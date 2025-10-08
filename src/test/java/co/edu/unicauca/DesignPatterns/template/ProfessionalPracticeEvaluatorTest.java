package co.edu.unicauca.DesignPatterns.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase ProfessionalPracticeEvaluator.
 * Verifica el flujo del patrón Template Method aplicado a una práctica profesional.
 * 
 * @author Dana
 */
public class ProfessionalPracticeEvaluatorTest {

    @Test
    public void testReviewProblem() {
        System.out.println("Prueba: reviewProblem()");
        Project project = new Project("Sistema contable empresarial", "Práctica Profesional", "Carlos Pérez");
        ProfessionalPracticeEvaluator evaluator = new ProfessionalPracticeEvaluator();

        assertDoesNotThrow(() -> evaluator.reviewProblem(project));
    }

    @Test
    public void testReviewGoals() {
        System.out.println("Prueba: reviewGoals()");
        Project project = new Project("Aplicación móvil de inventarios", "Práctica Profesional", "Laura Gómez");
        ProfessionalPracticeEvaluator evaluator = new ProfessionalPracticeEvaluator();

        assertDoesNotThrow(() -> evaluator.reviewGoals(project));
    }

    @Test
    public void testReviewScope() {
        System.out.println("Prueba: reviewScope()");
        Project project = new Project("Sistema web de ventas", "Práctica Profesional", "Andrés Torres");
        ProfessionalPracticeEvaluator evaluator = new ProfessionalPracticeEvaluator();

        assertDoesNotThrow(() -> evaluator.reviewScope(project));
    }

    @Test
    public void testMakeDecision() {
        System.out.println("Prueba: makeDecision()");
        Project project = new Project("Aplicación de gestión de turnos", "Práctica Profesional", "Sofía Ruiz");
        ProfessionalPracticeEvaluator evaluator = new ProfessionalPracticeEvaluator();

        // Antes de tomar la decisión
        assertFalse(project.isApproved(), "El proyecto no debería estar aprobado inicialmente.");

        // Ejecuta el método de decisión
        evaluator.makeDecision(project);

        // Después de tomar la decisión
        assertTrue(project.isApproved(), "El proyecto debería quedar aprobado después de makeDecision().");
    }

    @Test
    public void testEvaluateCompleteFlow() {
        System.out.println("Prueba completa: evaluate()");
        Project project = new Project("Plataforma de seguimiento académico", "Práctica Profesional", "David López");
        ProfessionalPracticeEvaluator evaluator = new ProfessionalPracticeEvaluator();

        // Verifica que el flujo completo no arroje errores
        assertDoesNotThrow(() -> evaluator.evaluate(project));

        // Verifica que al final del flujo el proyecto esté aprobado
        assertTrue(project.isApproved(), "El proyecto debería estar aprobado al finalizar la evaluación.");
    }
}
