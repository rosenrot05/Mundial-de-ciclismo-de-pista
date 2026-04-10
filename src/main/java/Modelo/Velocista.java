
package Modelo;

/**
 *
 * @author rosam
 */
public class Velocista extends Competidor {
    
        private double velocidadMaxima;

    public Velocista(String nombre, int edad, String pais, int ranking, double estatura, double peso, double velocidadMaxima) {
        super(nombre, edad, pais, ranking, estatura, peso);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Velocista, Velocidad: " + velocidadMaxima;
    }
}
