
package Modelo;

/**
 *
 * @author rosam
 */
public class Competidor {
    
    protected String nombre;
    protected int edad;
    protected String pais;
    protected int ranking;
    protected double estatura;
    protected double peso;

    public Competidor(String nombre, int edad, String pais, int ranking, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.ranking = ranking;
        this.estatura = estatura;
        this.peso = peso;
    }

    // GETTERS Y SETTERS
    public String getNombre() { return nombre; }
    public int getRanking() { return ranking; }

    //Metodo para actualizar ranking
    public void actualizarRanking(int puntos) {
        ranking = ranking - puntos;
    }

    // Sobrecarga 
    public void actualizarRanking(int puntos, int penalizacion) {
        ranking = ranking - (puntos - penalizacion);
    }

    // Metodo con estructura anidada 
    public void actualizarRanking(double puntos, boolean bonus) {
        if (bonus) {
            if (puntos > 10) {
                ranking -= puntos * 2;
            } else {
                ranking -= puntos;
            }
        } else {
            ranking -= puntos;
        }
    }

    // Sobreescritura sugerida
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Pais: " + pais + ", Ranking: " + ranking;
    }
}

