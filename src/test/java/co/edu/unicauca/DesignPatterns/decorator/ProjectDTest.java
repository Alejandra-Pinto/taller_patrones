package co.edu.unicauca.DesignPatterns.decorator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julia
 */
public class ProjectDTest {
    
    public ProjectDTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of toString method, of class ProjectD.
     */
    @Test
    void testGettersAndToString() {
        ProjectD project = new ProjectD("Sistema Solar Virtual", "Simula el movimiento de planetas en 3D");

        assertEquals("Sistema Solar Virtual", project.getTitle());
        assertEquals("Simula el movimiento de planetas en 3D", project.getDescription());

        String expectedOutput = "\nTitulo: Sistema Solar Virtual\nDescripcion: Simula el movimiento de planetas en 3D";
        assertEquals(expectedOutput, project.toString());
    }
    
}
