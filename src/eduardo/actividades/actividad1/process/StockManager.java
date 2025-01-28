package eduardo.actividades.actividad1.process;

import eduardo.actividades.actividad1.models.Car;

import java.util.ArrayList;
import java.util.List;
public class StockManager {
    public ArrayList<Car> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }

    /**
     *  genera un nuevo objeto con la informacion de un aturo y se agrega
     *  al catalogo de la aplicacion
     * @param modelo el año del auto
     * @param marca empresa productora del
     * @param numeroPuertas
     * @param color Blanco y gris
     */
    public void addCar(String modelo, String marca, int numeroPuertas, String color){
        Car car= new Car(modelo,marca,numeroPuertas,color);
        stock.add(car);

    }

    /**
     *
     * @return devuelve una lista con todo el catalogo en memoria
     */
    public List<Car> getStock(){
        return this.stock;
    }
}