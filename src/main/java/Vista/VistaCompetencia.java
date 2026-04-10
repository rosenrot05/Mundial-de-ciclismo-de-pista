
package Vista;

/**
 *
 * @author rosam
 */
import java.util.Scanner;

public class VistaCompetencia {

    private Scanner sc = new Scanner(System.in);

    // arreglos para validar repetidos
    private String[] nombres = new String[100];
    private int[] rankings = new int[100];
    private int contadorNombres = 0;
    private int contadorRankings = 0;

    public int leerCantidad() {
        int cantidad = 0;
        boolean valido = false;

        do {
            try {
                System.out.print("Ingrese cantidad de competidores: ");
                cantidad = Integer.parseInt(sc.nextLine());
                if (cantidad > 0) valido = true;
                else System.out.println("❌ Debe ser mayor a 0");
            } catch (Exception e) {
                System.out.println("❌ Ingrese un número válido");
            }
        } while (!valido);

        return cantidad;
    }

    public String leerNombre() {
        String nombre;
        boolean repetido;

        do {
            repetido = false;
            System.out.print("Ingrese nombre: ");
            nombre = sc.nextLine();

            for (int i = 0; i < contadorNombres; i++) {
                if (nombres[i].equals(nombre)) {
                    repetido = true;
                    System.out.println("Nombre repetido");
                }
            }

        } while (nombre.isEmpty() || repetido);

        nombres[contadorNombres] = nombre;
        contadorNombres++;

        return nombre;
    }

    public int leerEdad() {
        int edad = 0;
        boolean valido = false;

        do {
            try {
                System.out.print("Ingrese edad: ");
                edad = Integer.parseInt(sc.nextLine());
                if (edad > 0) valido = true;
                else System.out.println("Debe ser positiva");
            } catch (Exception e) {
                System.out.println("Ingrese un numero valido");
            }
        } while (!valido);

        return edad;
    }

    public String leerPais() {
        String pais;
        do {
            System.out.print("Ingrese pais: ");
            pais = sc.nextLine();
        } while (pais.isEmpty());
        return pais;
    }

    public int leerRanking() {
        int ranking = 0;
        boolean valido = false;
        boolean repetido;

        do {
            repetido = false;

            try {
                System.out.print("Ingrese ranking: ");
                ranking = Integer.parseInt(sc.nextLine());

                for (int i = 0; i < contadorRankings; i++) {
                    if (rankings[i] == ranking) {
                        repetido = true;
                        System.out.println("Ranking repetido");
                    }
                }

                if (ranking > 0 && !repetido) {
                    valido = true;
                } else if (ranking <= 0) {
                    System.out.println("Debe ser positivo");
                }

            } catch (Exception e) {
                System.out.println("Ingrese un número valido");
            }

        } while (!valido);

        rankings[contadorRankings] = ranking;
        contadorRankings++;

        return ranking;
    }

    public double leerEstatura() {
        double estatura = 0;
        boolean valido = false;

        do {
            try {
                System.out.print("Ingrese estatura: ");
                estatura = Double.parseDouble(sc.nextLine());
                if (estatura > 0) valido = true;
                else System.out.println("Debe ser positiva");
            } catch (Exception e) {
                System.out.println("Numero invalido");
            }
        } while (!valido);

        return estatura;
    }

    public double leerPeso() {
        double peso = 0;
        boolean valido = false;

        do {
            try {
                System.out.print("Ingrese peso: ");
                peso = Double.parseDouble(sc.nextLine());
                if (peso > 0) valido = true;
                else System.out.println("Debe ser positivo");
            } catch (Exception e) {
                System.out.println("Numero invalido");
            }
        } while (!valido);

        return peso;
    }

    public String leerEquipo() {
        String equipo;
        do {
            System.out.print("Ingrese nombre del equipo: ");
            equipo = sc.nextLine();
        } while (equipo.isEmpty());
        return equipo;
    }

    public int tipoCompetidor() {
        int tipo = 0;

        do {
            try {
                System.out.println("Tipo de competidor:");
                System.out.println("1. Velocista");
                System.out.println("2. Resistencia");
                tipo = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ingrese un numero valido");
            }
        } while (tipo != 1 && tipo != 2);

        return tipo;
    }

    public double datoExtra(int tipo) {
        double valor = 0;
        boolean valido = false;

        do {
            try {
                if (tipo == 1)
                    System.out.print("Ingrese velocidad maxima: ");
                else
                    System.out.print("Ingrese nivel de resistencia: ");

                valor = Double.parseDouble(sc.nextLine());

                if (valor > 0) valido = true;
                else System.out.println("Debe ser positivo");

            } catch (Exception e) {
                System.out.println("Numero invalido");
            }

        } while (!valido);

        return valor;
    }

    public int leerPuntos() {
        int puntos = 0;
        boolean valido = false;

        do {
            try {
                System.out.print("Ingrese puntos obtenidos: ");
                puntos = Integer.parseInt(sc.nextLine());
                if (puntos >= 0) valido = true;
                else System.out.println("No pueden ser negativos");
            } catch (Exception e) {
                System.out.println("Numero invalido");
            }
        } while (!valido);

        return puntos;
    }

    public void mostrar(String msg) {
        System.out.println("--- RESULTADOS ---");
        System.out.println(msg);
    }
}