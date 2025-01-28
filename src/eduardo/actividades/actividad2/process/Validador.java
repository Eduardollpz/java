package eduardo.actividades.actividad2.process;

import eduardo.actividades.actividad2.data.Data;

public class Validador {


    /**
     * Metodo que se encarga de validar si el nombre ingresado es valido
     */
    public static boolean validateName(String name){

        for (String nombre : Data.nombres) {
            if (name.equals(nombre)) {
                return true;
            }
        }
        return false;




    }


}
