package co.edu.unicauca.DesignPatterns.facade;

public class PlatformFacade {
    private EvaluationSystem evaluation;
    private EvaluatorsAssignment assignment;

    public PlatformFacade() {
        this.evaluation = new EvaluationSystem();
        this.assignment = new EvaluatorsAssignment();
    }

    public void manageProject(ProjectFacade project) {
        System.out.println("\nGestionando proyecto:\n" + project);
        if (evaluation.evaluate(project)) {
            if (assignment.assign(project)) {
                System.out.println("Proyecto evaluado y asignado correctamente.");
            } else {
                System.out.println("Proyecto aprobado, pero no hay evaluadores disponibles.");
            }
        } else {
            System.out.println("Proyecto no aprobado.");
        }
    }
}