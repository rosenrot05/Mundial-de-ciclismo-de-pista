
import Controlador.ControladorCompetencia;
import Modelo.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rosam
 */
public class IntegracionTest {
        @Test
    public void testFlujoCompleto() {

        ControladorCompetencia controlador = new ControladorCompetencia(2);

        Equipo e1 = new Equipo("Team A", "Colombia");
        Equipo e2 = new Equipo("Team B", "Venezuela");

        Competidor c1 = new Velocista("Christian", 25, "Colombia", 10, 1.75, 70, 60, e1);
        Competidor c2 = new Resistencia("Acercandra", 28, "Venezuela", 8, 1.65, 55, 90, e2);

        c1.actualizarRanking(2);
        c2.actualizarRanking(3);

        controlador.agregarCompetidor(c1);
        controlador.agregarCompetidor(c2);

        String resultado = controlador.mostrarCompetidores();

        assertTrue(resultado.contains("Christian"));
        assertTrue(resultado.contains("Acercandra"));
    }
}
