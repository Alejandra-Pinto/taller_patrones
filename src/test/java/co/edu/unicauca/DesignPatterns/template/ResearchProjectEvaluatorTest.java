package co.edu.unicauca.DesignPatterns.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase ResearchProjectEvaluator.
 * @author Dana
 */
public class ResearchProjectEvaluatorTest {

    @Test
    public void testReviewProblem() {
        System.out.println("Prueba: reviewProblem");
        Project project = new Project("Modelo IA para detección de enfermedades", "Investigación", "Ana Torres");
        ResearchProjectEvaluator instance = new ResearchProjectEvaluator();
        
        // No debe lanzar ninguna excepción
        assertDoesNotThrow(() -> instance.reviewProblem(project));
    }

    @Test
    public void testReviewGoals() {
        System.out.println("Prueba: reviewGoals");
        Project project = new Project("Análisis de datos climáticos", "Investigación", "Carlos Pérez");
        ResearchProjectEvaluator instance = new ResearchProjectEvaluator();
        
        assertDoesNotThrow(() -> instance.reviewGoals(project));
    }

    @Test
    public void testReviewScope() {
        System.out.println("Prueba: reviewScope");
        Project project = new Project("Modelo IA para predicción de cultivos", "Investigación", "Laura Gómez");
        ResearchProjectEvaluator instance = new ResearchProjectEvaluator();
        
        assertDoesNotThrow(() -> instance.reviewScope(project));
    }

    @Test
    public void testMakeDecision() {
        System.out.println("Prueba: makeDecision");
        Project project = new Project("Detección automática de defectos", "Investigación", "Juan Ruiz");
        ResearchProjectEvaluator instance = new ResearchProjectEvaluator();
        
        assertDoesNotThrow(() -> instance.makeDecision(project));
    }
}
