
import Modelo.Velocista;
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
public class VelocistaTest {
    
    @Test
    public void testToStringVelocista() {
        Equipo e = new Equipo("Team X", "Chile");
        Velocista v = new Velocista("Carlos", 27, "Chile", 5, 1.70, 65, 55, e);

        String resultado = v.toString();

        assertTrue(resultado.contains("Velocista"));
    }
}
