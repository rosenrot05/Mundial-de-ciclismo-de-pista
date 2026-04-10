
package Controlador;

/**
 *
 * @author rosam
 */

import Modelo.Competidor;

public class ControladorCompetencia {
    
    private Competidor[] competidores;
    private int contador;

    public ControladorCompetencia(int tamaño) {
        competidores = new Competidor[tamaño];
        contador = 0;
    }

    public void agregarCompetidor(Competidor c) {
        competidores[contador] = c;
        contador++;
    }

    public String mostrarCompetidores() {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            resultado += competidores[i].toString() + "\n";
        }
        return resultado;
    }
}
