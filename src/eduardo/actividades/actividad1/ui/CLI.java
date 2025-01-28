package eduardo.actividades.actividad1.ui;
import eduardo.actividades.actividad1.models.Car;
import eduardo.actividades.actividad1.process.StockManager;

import java.util.Scanner;

public class CLI {
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();

        showMenu();
        int opcion = scanner.nextInt();
        scanner.nextLine();

        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Introduce el número de puertas:");
                    int numPuertas = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Introduce el color del auto:");
                    String color = scanner.nextLine();

                    System.out.println("Introduce el modelo:");
                    String modelo = scanner.nextLine();

                    System.out.println("Introduce la marca:");
                    String marca = scanner.nextLine();

                    stockManager.addCar(modelo, marca, numPuertas, color);
                    System.out.println("¡Carro agregado exitosamente!");
                    System.out.println("------------------------------------");
                    break;

                case 2:
                    System.out.println("========= Catálogo de Autos =========");
                    int auto = 1;
                    for (Car car : stockManager.getStock()) {
                        System.out.println("Auto " + auto + ":");
                        System.out.println("    Modelo: " + car.getModelo());
                        System.out.println("    Color: " + car.getColor());
                        System.out.println("    Número de Puertas: " + car.getNumeroPuertas());
                        System.out.println("    Marca: " + car.getMarca());
                        System.out.println("------------------------------------");
                        auto++;
                    }
                    if (auto == 1) {
                        System.out.println("El catálogo está vacío.");
                    }
                    System.out.println("====================================");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }

            showMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("¡Gracias por usar la aplicación!");
    }

    public static void showMenu() {
        System.out.println("========== Menú ==========");
        System.out.println("1. Agregar un carro al catálogo");
        System.out.println("2. Mostrar el catálogo de carros");
        System.out.println("3. Salir");
        System.out.println("==========================");
        System.out.print("Elige una opción: ");
    }
}


