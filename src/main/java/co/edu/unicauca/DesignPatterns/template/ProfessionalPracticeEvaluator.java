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
public class ProfessionalPracticeEvaluator extends ProjectEvaluator{
    
    protected void reviewProblem(Project project) {
        System.out.println("Revisando problema en práctica profesional...");
    }

    public ProfessionalPracticeEvaluator() {
    }

    protected void reviewGoals(Project project) {
        System.out.println("Revisando objetivos del proyecto profesional...");
    }


    protected void reviewScope(Project project) {
        System.out.println("Revisando alcance de la práctica...");
    }

    protected void makeDecision(Project project) {
        project.setApproved(true);
        System.out.println("Práctica profesional aprobada.");
    }
}
