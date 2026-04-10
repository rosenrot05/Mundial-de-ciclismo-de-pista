
import Modelo.Resistencia;
import Modelo.Equipo;
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
public class ResistenciaTest {
        @Test
    public void testToStringResistencia() {
        Equipo e = new Equipo("Team Y", "Antonio");
        Resistencia r = new Resistencia("Acercandra", 29, "Mexico", 6, 1.68, 58, 90, e);

        String resultado = r.toString();

        assertTrue(resultado.contains("Resistencia"));
    }
}
