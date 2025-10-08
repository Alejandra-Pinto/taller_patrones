package co.edu.unicauca.DesignPatterns.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase EvaluationPractica.
 * Se valida que los métodos del patrón Template se ejecuten sin errores.
 * 
 * @author Dana
 */
public class EvaluationPracticaTest {
    
    /**
     * Test del método revisarDocumentacion().
     * Comprueba que el método se ejecute correctamente sin lanzar excepciones.
     */
    @Test
    public void testRevisarDocumentacion() {
        EvaluationPractica instance = new EvaluationPractica();
        assertDoesNotThrow(() -> instance.revisarDocumentacion(),
                "El método revisarDocumentacion() no debería lanzar excepciones.");
    }

    /**
     * Test del método realizarEvaluacion().
     * Comprueba que la evaluación se ejecute correctamente sin fallar.
     */
    @Test
    public void testRealizarEvaluacion() {
        //crea instancia
        EvaluationPractica instance = new EvaluationPractica();
        //llama al metodo y mira que no lance excepciones con por medio de assertDoesNotThrow
        assertDoesNotThrow(() -> instance.realizarEvaluacion(),
                "El método realizarEvaluacion() no debería lanzar excepciones.");
    }

    /**
     * Test del método generarInforme().
     * Comprueba que el informe se genere correctamente sin errores.
     */
    @Test
    public void testGenerarInforme() {
        EvaluationPractica instance = new EvaluationPractica();
        assertDoesNotThrow(() -> instance.generarInforme(),
                "El método generarInforme() no debería lanzar excepciones.");
    }
}
