
package Modelo;

/**
 *
 * @author rosam
 */
public class Competencia {
    
    private String nombreEvento;
    private String lugar;

    public Competencia() {
        this.nombreEvento = "Mundial de Ciclismo de Pista";
        this.lugar = "Velódromo Alcides Nieto Patiño - Cali";
    }

    public String getInfo() {
        return nombreEvento + " en " + lugar;
    }
}
