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
public class ControladorTest {
        @Test
    public void testAgregarCompetidor() {

        ControladorCompetencia controlador = new ControladorCompetencia(2);

        Equipo e = new Equipo("Team Z", "Colombia");
        Competidor c = new Velocista("Pedro", 25, "Colombia", 10, 1.75, 70, 60, e);

        controlador.agregarCompetidor(c);

        String resultado = controlador.mostrarCompetidores();

        assertTrue(resultado.contains("Pedro"));
    }
}
