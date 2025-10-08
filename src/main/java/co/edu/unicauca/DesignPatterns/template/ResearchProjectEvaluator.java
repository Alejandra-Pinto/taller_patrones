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
public class ResearchProjectEvaluator extends ProjectEvaluator {

    @Override
    protected void reviewProblem(Project project) {
        System.out.println("Revisando problema de investigación...");
    }

    @Override
    protected void reviewGoals(Project project) {
        System.out.println("Revisando objetivos de investigación...");
    }

    @Override
    protected void reviewScope(Project project) {
        System.out.println("Revisando alcance científico...");
    }

    @Override
    protected void makeDecision(Project project) {
        project.setApproved(true);
        System.out.println("Proyecto de investigación aprobado.");
    }
}
