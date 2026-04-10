
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
    protected Equipo equipo;

    public Competidor(String nombre, int edad, String pais, int ranking, double estatura, double peso, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.ranking = ranking;
        this.estatura = estatura;
        this.peso = peso;
        this.equipo = equipo;
    }

    public int getRanking() {
        return ranking;
    }

    // 🔹 Métodos con sobrecarga
    public void actualizarRanking(int puntos) {
        ranking -= puntos;
        if (ranking < 1) ranking = 1;
    }

    public void actualizarRanking(int puntos, int penalizacion) {
        ranking -= (puntos - penalizacion);
    }

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

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Pais: " + pais +
               ", Ranking: " + ranking +
               ", " + equipo.toString();
    }
}