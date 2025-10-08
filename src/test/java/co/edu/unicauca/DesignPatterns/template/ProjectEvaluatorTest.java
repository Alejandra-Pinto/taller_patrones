package co.edu.unicauca.DesignPatterns.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase abstracta ProjectEvaluator.
 * Se usa una clase interna (ProjectEvaluatorImpl) para probar el flujo general.
 * @author Dana
 */
public class ProjectEvaluatorTest {

    /**
     * Clase interna concreta que implementa los métodos abstractos
     * de ProjectEvaluator para propósitos de prueba.
     */
    public class ProjectEvaluatorImpl extends ProjectEvaluator {

        @Override
        protected void reviewProblem(Project project) {
            System.out.println("Revisando el problema: " + project.getName());
        }

        @Override
        protected void reviewGoals(Project project) {
            System.out.println("Revisando los objetivos del proyecto: " + project.getName());
        }

        @Override
        protected void reviewScope(Project project) {
            System.out.println("Revisando el alcance del proyecto: " + project.getName());
        }

        @Override
        protected void makeDecision(Project project) {
            System.out.println("Decisión tomada para el proyecto: " + project.getName());
        }
    }

    @Test
    public void testEvaluate() {
        System.out.println("Prueba: evaluate()");
        Project project = new Project("Sistema experto médico", "Investigación", "Laura Martínez");
        ProjectEvaluator instance = new ProjectEvaluatorImpl();

        // Verifica que no se lance ninguna excepción durante el flujo de evaluación
        assertDoesNotThrow(() -> instance.evaluate(project));
    }

    @Test
    public void testReviewProblem() {
        System.out.println("Prueba: reviewProblem()");
        Project project = new Project("Sistema web de gestión", "Práctica Profesional", "Carlos Pérez");
        ProjectEvaluator instance = new ProjectEvaluatorImpl();

        assertDoesNotThrow(() -> instance.reviewProblem(project));
    }

    @Test
    public void testReviewGoals() {
        System.out.println("Prueba: reviewGoals()");
        Project project = new Project("App de seguimiento académico", "Investigación", "María Gómez");
        ProjectEvaluator instance = new ProjectEvaluatorImpl();

        assertDoesNotThrow(() -> instance.reviewGoals(project));
    }

    @Test
    public void testReviewScope() {
        System.out.println("Prueba: reviewScope()");
        Project project = new Project("Sistema de inventarios", "Práctica Profesional", "David López");
        ProjectEvaluator instance = new ProjectEvaluatorImpl();

        assertDoesNotThrow(() -> instance.reviewScope(project));
    }

    @Test
    public void testMakeDecision() {
        System.out.println("Prueba: makeDecision()");
        Project project = new Project("App de gestión de proyectos", "Investigación", "Ana Ruiz");
        ProjectEvaluator instance = new ProjectEvaluatorImpl();

        assertDoesNotThrow(() -> instance.makeDecision(project));
    }
}
