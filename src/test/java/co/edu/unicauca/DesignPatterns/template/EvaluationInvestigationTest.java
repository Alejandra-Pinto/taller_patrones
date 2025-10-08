package co.edu.unicauca.DesignPatterns.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test unitario para la clase EvaluationInvestigation.
 * Verifica que los pasos del Template se ejecuten correctamente.
 * @author Dana
 */
public class EvaluationInvestigationTest {

    @Test
    public void testRevisarDocumentacion() {
        //crea instancia
        EvaluationInvestigation instance = new EvaluationInvestigation();

        // No debe lanzar excepción, llama al metodo y prueba con assertDoesNotThrow
        assertDoesNotThrow(() -> instance.revisarDocumentacion(),
                "El método revisarDocumentacion() no debe lanzar excepción");
    }

    @Test
    public void testRealizarEvaluacion() {
        EvaluationInvestigation instance = new EvaluationInvestigation();

        // No debe lanzar excepción
        assertDoesNotThrow(() -> instance.realizarEvaluacion(),
                "El método realizarEvaluacion() no debe lanzar excepción");
    }

    @Test
    public void testGenerarInforme() {
        EvaluationInvestigation instance = new EvaluationInvestigation();

        // No debe lanzar excepción
        assertDoesNotThrow(() -> instance.generarInforme(),
                "El método generarInforme() no debe lanzar excepción");
    }
}
