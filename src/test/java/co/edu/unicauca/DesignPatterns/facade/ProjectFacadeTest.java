package co.edu.unicauca.DesignPatterns.facade;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectFacadeTest {
    @Test
    public void testConstructorAndGetters() {
        List<String> objetivos = Arrays.asList("Recolectar datos", "Analizar resultados");

        ProjectFacade p = new ProjectFacade(
                "Proyecto de Prueba",
                "Investigación",
                "Ana López",
                "Carlos Díaz",
                "2025-10-01",
                "Dr. Pérez",
                "MSc. Ruiz",
                null,
                "Estudiar comportamiento de datos",
                objetivos
        );

        assertEquals("Proyecto de Prueba", p.getTitle());
        assertEquals("Investigación", p.getModality());
        assertEquals("Ana López", p.getStudent1());
        assertEquals("Carlos Díaz", p.getStudent2());
        assertEquals("2025-10-01", p.getCreationDate());
        assertEquals("Dr. Pérez", p.getDirector());
        assertEquals("MSc. Ruiz", p.getCoDirector1());
        assertEquals("Estudiar comportamiento de datos", p.getGeneralObjective());
        assertEquals(objetivos, p.getSpecificObjectives());
    }    
}
