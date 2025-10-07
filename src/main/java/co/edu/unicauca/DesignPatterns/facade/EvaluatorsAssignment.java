package co.edu.unicauca.DesignPatterns.facade;

public class EvaluatorsAssignment {
    public boolean assign(ProjectFacade project) {
        System.out.println("Asignando evaluadores para: " + project.getTitle());
        return Math.random() > 0.2; // 80% de éxito en asignación
    }
}
