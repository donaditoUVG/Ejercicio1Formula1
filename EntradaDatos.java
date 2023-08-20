import java.util.Scanner;

public class EntradaDatos {

    private static Scanner scanner = new Scanner(System.in);

    public static String pedirNombre(){
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        return nombre;
    }

    public static String pedirDpi(){
        System.out.println("Ingrese su numero de DPI: ");
        String dpi = scanner.nextLine();
        return dpi;
    }

    public static int pedirCantBoletos(){
        System.out.println("Ingrese la cantidad de boletos que desea comprar: ");
        int cantBoletos = scanner.nextInt();
        scanner.nextLine();
        return cantBoletos;
    }

    public static double pedirPresupuesto(){
        System.out.println("Ingrese su presupuesto máximo: ");
        double presupuesto = scanner.nextDouble();
        scanner.nextLine();
        return presupuesto;
    }

    
}
