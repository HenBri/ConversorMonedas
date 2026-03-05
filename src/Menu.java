import java.util.Scanner;

public class Menu {
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        ConversorLogic logic = new ConversorLogic();

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("|  Bienvenido al conversor de monedas  |");
            System.out.println("---------------------------------------");
            System.out.println("1) Dolar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real Brasilero");
            System.out.println("4) Real Brasilero =>> Dolar");
            System.out.println("5) Dolar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion valida:");

            int opcion = sc.nextInt();
            if (opcion == 7) {
                System.out.println("Saliendo del programa... ¡Gracias!");
                break;
            }

            if (opcion < 1 || opcion > 7) {
                System.out.println("Opcion invalida. Intente de nuevo.");
                continue;
            }

            System.out.println("Ingresa el valor que desea convertir:");
            double cantidad = sc.nextDouble();

            switch (opcion) {
                case 1 -> logic.ejecutarConversion("USD", "ARS", cantidad);
                case 2 -> logic.ejecutarConversion("ARS", "USD", cantidad);
                case 3 -> logic.ejecutarConversion("USD", "BRL", cantidad);
                case 4 -> logic.ejecutarConversion("BRL", "USD", cantidad);
                case 5 -> logic.ejecutarConversion("USD", "COP", cantidad);
                case 6 -> logic.ejecutarConversion("COP", "USD", cantidad);
            }
        }
    }
}