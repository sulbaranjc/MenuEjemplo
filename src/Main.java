import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean salir = false;
        do {
            System.out.println("\n===== MENÚ PRINCIPAL JC=====");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Opcion 5");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            //int opcion = scanner.nextInt(); // no funciona bien
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Iniciando opcion 1...");
                    Opcion1();
                    break;
                case 2:
                    System.out.println("Iniciando opcion 2...");
                    Opcion2();
                    break;
                case 3:
                    System.out.println("Iniciando opcion 3...");
                    Opcion3();
                    break;
                case 4:
                    System.out.println("Iniciando opcion 4...");
                    Opcion4();
                    break;
                case 5:
                    System.out.println("Iniciando opcion 5...");
                    Opcion5();
                    break;
                case 0:
                    // Código para crear un alumno
                    System.out.println("saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }while (!salir);
        System.out.println("Fin del programa");
    }
    public static void Opcion1() {
        System.out.println("Ejecutando Opcion 1");
    }
    public static void Opcion2() {
        System.out.println("Ejecutando Opcion 2");
    }
    public static void Opcion3() {
        System.out.println("Ejecutando Opcion 3");
    }
    public static void Opcion4() {
        System.out.println("Ejecutando Opcion 4");
    }
    public static void Opcion5() {
        System.out.println("Ejecutando Opcion 5");
    }

}