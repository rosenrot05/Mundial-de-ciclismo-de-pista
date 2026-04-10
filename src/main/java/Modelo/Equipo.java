
package Modelo;

/**
 *
 * @author rosam
 */
public class Equipo {
       private String nombre;
    private String pais;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + " (" + pais + ")";
    }
} 

