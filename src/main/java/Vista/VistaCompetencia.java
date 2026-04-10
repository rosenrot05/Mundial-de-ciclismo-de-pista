
package Vista;

/**
 *
 * @author rosam
 */
import javax.swing.JOptionPane;
import java.util.HashSet;

public class VistaCompetencia {
        private HashSet<String> nombres = new HashSet<>();
    private HashSet<Integer> rankings = new HashSet<>();

    public int leerCantidad() {
        int cantidad;
        do {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de competidores"));
        } while (cantidad <= 0);
        return cantidad;
    }

    public String leerNombre() {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog("Ingrese nombre:");
            if (nombres.contains(nombre)) {
                JOptionPane.showMessageDialog(null, "Nombre repetido, ingrese otro");
            }
        } while (nombres.contains(nombre) || nombre.isEmpty());

        nombres.add(nombre);
        return nombre;
    }

    public int leerEdad() {
        int edad;
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
        } while (edad <= 0);
        return edad;
    }

    public String leerPais() {
        String pais;
        do {
            pais = JOptionPane.showInputDialog("Ingrese pais:");
        } while (pais.isEmpty());
        return pais;
    }

    public int leerRanking() {
        int ranking;
        do {
            ranking = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ranking:"));

            if (rankings.contains(ranking)) {
                JOptionPane.showMessageDialog(null, "Ranking repetido, ingrese otro");
            }

        } while (ranking <= 0 || rankings.contains(ranking));

        rankings.add(ranking);
        return ranking;
    }

    public double leerEstatura() {
        double estatura;
        do {
            estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese estatura:"));
        } while (estatura <= 0);
        return estatura;
    }

    public double leerPeso() {
        double peso;
        do {
            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso:"));
        } while (peso <= 0);
        return peso;
    }

    public int tipoCompetidor() {
        int tipo;
        do {
            tipo = Integer.parseInt(JOptionPane.showInputDialog(
                "Tipo de competidor:\n1. Velocista \n2. Resistencia"));
        } while (tipo != 1 && tipo != 2);
        return tipo;
    }

    public double datoExtra(int tipo) {
        double valor;
        if (tipo == 1) {
            do {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Velocidad maxima:"));
            } while (valor <= 0);
        } else {
            do {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Nivel de resistencia:"));
            } while (valor <= 0);
        }
        return valor;
    }

    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
