package eduardo.actividades.actividad3.ui;




import eduardo.actividades.actividad3.models.Producto;
import eduardo.actividades.actividad3.process.GestorProductos;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        try {
            System.out.println("Ingrese los datos del primer producto:");
            System.out.print("Código: ");
            producto1.setCodigo(scanner.nextLine());
            System.out.print("Tipo: ");
            producto1.setTipo(scanner.nextLine());
            System.out.print("Costo: ");
            producto1.setCosto(Double.parseDouble(scanner.nextLine()));
            System.out.print("Impuesto (%): ");
            producto1.setImpuesto(Double.parseDouble(scanner.nextLine()));

            System.out.println("Ingrese los datos del segundo producto:");
            System.out.print("Código: ");
            producto2.setCodigo(scanner.nextLine());
            System.out.print("Tipo: ");
            producto2.setTipo(scanner.nextLine());
            System.out.print("Costo: ");
            producto2.setCosto(Double.parseDouble(scanner.nextLine()));
            System.out.print("Impuesto (%): ");
            producto2.setImpuesto(Double.parseDouble(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Error en la entrada de datos. Asegúrese de ingresar los valores correctamente.");
            return;
        }

        System.out.println("\nDatos del primer producto:");
        producto1.muestraProducto();
        System.out.println("\nDatos del segundo producto:");
        producto2.muestraProducto();

        System.out.print("Ingrese el porcentaje de utilidad para el cálculo de precios: ");
        double utilidad = scanner.nextDouble();

        String resultado = GestorProductos.compararProductos(producto1, producto2, utilidad);
        System.out.println("\n" + resultado);

        scanner.close();
    }

    public static void runApp() {

    }
}

