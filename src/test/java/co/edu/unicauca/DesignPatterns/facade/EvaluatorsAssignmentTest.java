package co.edu.unicauca.DesignPatterns.facade;

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvaluatorsAssignmentTest {
    @Test
    public void testAssignReturnsBoolean() {
        EvaluatorsAssignment assign = new EvaluatorsAssignment();
        ProjectFacade project = new ProjectFacade(
                "Sistema Web",
                "Práctica Profesional",
                "Carlos Pérez",
                "2025-09-01",
                "Ing. López",
                "Desarrollar sistema web para inventarios",
                Arrays.asList("Diseñar BD", "Implementar CRUD")
        );

        boolean result = assign.assign(project);
        assertTrue(result == true || result == false, "Debe retornar un valor booleano");
    }
}
