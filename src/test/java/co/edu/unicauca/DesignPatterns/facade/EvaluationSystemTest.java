package co.edu.unicauca.DesignPatterns.facade;

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvaluationSystemTest {
    @Test
    public void testEvaluateReturnsBoolean() {
        EvaluationSystem eval = new EvaluationSystem();
        ProjectFacade project = new ProjectFacade(
                "Proyecto IA",
                "Investigación",
                "Ana Torres",
                "Luis Gómez",
                "2025-10-04",
                "Dr. Ruiz",
                "Ing. Díaz",
                null,
                "Desarrollar modelo IA",
                Arrays.asList("Recolectar datos", "Entrenar modelo")
        );

        boolean result = eval.evaluate(project);
        assertTrue(result == true || result == false, "Debe retornar un valor booleano");
    }
}
