package eduardo.actividades.actividad3.process;

import eduardo.actividades.actividad3.models.Producto;

public class GestorProductos {
    public static String compararProductos(Producto p1, Producto p2, double utilidad) {
        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);

        if (precio1 > precio2) {
            return "El producto con mayor precio de venta es: " + p1.getCodigo();
        } else if (precio2 > precio1) {
            return "El producto con mayor precio de venta es: " + p2.getCodigo();
        } else {
            return "Ambos productos tienen el mismo precio de venta.";
        }
    }
}
