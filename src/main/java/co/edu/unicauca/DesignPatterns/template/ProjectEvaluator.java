/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.template;

import co.edu.unicauca.DesignPatterns.template.*;

/**
 *
 * @author Dana Isabella
 */
public abstract class ProjectEvaluator {

    /**
     * Método plantilla que define el flujo general.
     */
    public final void evaluate(Project project) {
        reviewProblem(project);
        reviewGoals(project);
        reviewScope(project);
        makeDecision(project);
    }

    protected abstract void reviewProblem(Project project);
    protected abstract void reviewGoals(Project project);
    protected abstract void reviewScope(Project project);
    protected abstract void makeDecision(Project project);
}
