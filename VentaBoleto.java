import java.util.Random;

public class VentaBoleto {
    public static void main(String[] args) {

        String nombre, dpi, localidad;
        int cantBoletos, numTicket, numA, numB;
        double presupuesto;

        Ubicacion[] localidades = {
            new Ubicacion("Localidad 1", 300, 20),
            new Ubicacion("Localidad 5", 565, 20),
            new Ubicacion("Localidad 10", 1495, 20)
        };

        // Vender 60 entradas como máximo
        Boleto[] boletos = new Boleto[60];
        for (int i = 0; i < 60; i++) { //Ir sumando de foma "javónica"
            boletos[i] = new Boleto(numTicket, numA, numB, localidad);
        }

        nombre = EntradaDatos.pedirNombre();
        dpi = EntradaDatos.pedirDpi();
        cantBoletos = EntradaDatos.pedirCantBoletos();
        presupuesto = EntradaDatos.pedirPresupuesto();

        Comprador comprador1 = new Comprador(nombre, dpi, cantBoletos, presupuesto);

        Random random = new Random();

        for (Boleto boleto : boletos) { //Rango de acuerdo con la cantidad de boletos

            // Condicionales de validación
            if (comprador1.getCantBoletos() > 0) {

                if (boleto.validarAptoCompra()) {
                    Ubicacion ubicacion = localidades[random.nextInt(localidades.length)];
                    boleto.setLocalidad(localidad);

                    // Mientras hayan espacios disponibles, es posible contrar
                    if (ubicacion.getEspaciosDisp() > 0) {
                        int boletosVendidos = Math.min(ubicacion.getEspaciosDisp(), comprador1.getCantBoletos()); //Los boletos vendidos son los valores mínimos de Espacios y cANTIDAD DE Boletos
                        ubicacion.disminuirEspacios(boletosVendidos);
                        comprador1.restarBoletosComprados(boletosVendidos);

                        System.out.println("¡" + comprador1.getNombre() + " ha comprado " + boletosVendidos + " boletos de " + ubicacion.getLocalidad() + "!");
                    } else {
                        System.out.println("No hay espacios disponibles en " + ubicacion.getLocalidad());
                    }
                    
                } else {
                    System.out.println("Lo sentimos, no es posible comprar boletos con el ticket generado.");
                }
            } else {
                System.out.println("Ya ha comprado sus boletos. ");
                break; // De lo contario ya no se podrá comprar más
            }
        }
    }
}






