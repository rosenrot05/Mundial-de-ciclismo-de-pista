
package Modelo;

/**
 *
 * @author rosam
 */
public class Resistencia extends Competidor {

    private double resistencia;

    public Resistencia(String nombre, int edad, String pais, int ranking, double estatura, double peso, double resistencia, Equipo equipo) {
        super(nombre, edad, pais, ranking, estatura, peso, equipo);
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Resistencia, Nivel: " + resistencia;
    }
}
