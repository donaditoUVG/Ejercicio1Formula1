import java.util.Random;

public class VentaBoleto {
    public static void main(String[] args) {
        Ubicacion[] localidades = {
            new Ubicacion("Localidad 1", 300, 20),
            new Ubicacion("Localidad 5", 565, 20),
            new Ubicacion("Localidad 10", 1495, 20)
        };

        // Vender 60 entradas como máximo
        Boleto[] boletos = new Boleto[60];
        for (int i = 0; i < 60; i++) { //Ir sumando de foma "javónica"
            boletos[i] = new Boleto();
        }

        Comprador comprador = new Comprador("Jose Donado", "3557591546", 2, 2000);

        Random random = new Random();

        for (Boleto boleto : boletos) { //Rango de acuerdo con la cantidad de boletos

            // Condicionales de validación
            if (comprador.getCantBoletos() > 0) {
                if (boleto.validarAptoCompra()) {
                    Ubicacion localidad = localidades[random.nextInt(localidades.length)];
                    boleto.asignarUbicacion(localidad);

                    // Mientras hayan espacios disponibles, es posible contrar
                    if (localidad.getEspaciosDisp() > 0) {
                        int boletosVendidos = Math.min(localidad.getEspaciosDisp(), comprador.getCantBoletos()); //Los boletos vendidos son los valores mínimos de Espacios y cANTIDAD DE Boletos
                        localidad.disminuirEspacios(boletosVendidos);
                        comprador.restarBoletosComprados(boletosVendidos);

                        System.out.println("¡" + comprador.getNombre() + " ha comprado " + boletosVendidos + " boletos de " + localidad.getLocalidad() + "!");
                    }
                }
            } else {
                System.out.println("Ya ha comprado sus boletos. ");
                break; // De lo contario ya no se podrá comprar más
            }
        }
    }
}






