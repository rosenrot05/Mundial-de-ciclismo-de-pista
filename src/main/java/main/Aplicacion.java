
package main;

/**
 *
 * @author rosam
 */

import Controlador.ControladorCompetencia;
import Modelo.*;
import Vista.VistaCompetencia;

public class Aplicacion {

    public static void main(String[] args) {
                VistaCompetencia vista = new VistaCompetencia();
        int cantidad = vista.leerCantidad();

        ControladorCompetencia controlador = new ControladorCompetencia(cantidad);

        for (int i = 0; i < cantidad; i++) {

            String nombre = vista.leerNombre();
            int edad = vista.leerEdad();
            String pais = vista.leerPais();
            int ranking = vista.leerRanking();
            double estatura = vista.leerEstatura();
            double peso = vista.leerPeso();

            int tipo = vista.tipoCompetidor();
            double extra = vista.datoExtra(tipo);

            Competidor c;

            if (tipo == 1) {
                c = new Velocista(nombre, edad, pais, ranking, estatura, peso, extra);
            } else {
                c = new Resistencia(nombre, edad, pais, ranking, estatura, peso, extra);
            }

            // aplicar logica (sobrecarga)
            c.actualizarRanking(5);

            controlador.agregarCompetidor(c);
        }

        vista.mostrar(controlador.mostrarCompetidores());
    }
    
}
