package co.edu.unicauca.DesignPatterns.facade;

public class EvaluationSystem {
    public boolean evaluate(ProjectFacade project) {
        System.out.println("Evaluando proyecto: " + project.getTitle());
        return Math.random() > 0.3; // 70% de aprobación
    }
}
