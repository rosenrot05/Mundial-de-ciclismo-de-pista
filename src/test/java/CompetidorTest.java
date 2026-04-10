/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Modelo.Competidor;
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
public class CompetidorTest {
    

    @Test
    public void testActualizarRanking() {
        Equipo e = new Equipo("Team A", "Colombia");
        Competidor c = new Competidor("Christian", 31, "Colombia", 10, 1.75, 70, e);

        c.actualizarRanking(3);

        assertEquals(7, c.getRanking());
    }

    @Test
    public void testActualizarRankingNoNegativo() {
        Equipo e = new Equipo("Team B", "Peru");
        Competidor c = new Competidor("Uvencer", 46, "Perú", 2, 1.65, 60, e);

        c.actualizarRanking(10);

        assertEquals(1, c.getRanking());
    }
}