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
public class PriorityProjectTest {
    
    public PriorityProjectTest() {
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

    @Test
    void testPriorityProjectAddsHighPriorityToTitle() {
        ProjectD baseProject = new ProjectD("App de Monitoreo Ambiental", "Desarrollar aplicación que use sensores IoT para medir calidad del aire");
        ProjectD decorated = new PriorityProject(baseProject);

        //Verifica que el título contenga la etiqueta de prioridad
        assertEquals("App de Monitoreo Ambiental [High Priority]", decorated.getTitle());
        
        //Verifica que la descripción no cambie
        assertEquals(baseProject.getDescription(), decorated.getDescription());
    }

    @Test
    void testToStringFormat() {
        ProjectD project = new ProjectD("Sistema de Control de Inventario", "Optimiza la gestión de productos en almacén");
        ProjectD priority = new PriorityProject(project);

        String expectedOutput = "\nTitulo: Sistema de Control de Inventario [High Priority]\nDescripcion: Optimiza la gestión de productos en almacén";
        assertEquals(expectedOutput, priority.toString());
    }
    
}
