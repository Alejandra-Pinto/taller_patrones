package co.edu.unicauca.DesignPatterns.decorator;

//Decorador concreto que añade la etiqueta de alta prioridad al titulo del proyecto

public class PriorityProject extends ProjectDecorator{
    
    public PriorityProject(ProjectD project){
        super(project);
    }
    
    @Override
    public String getDescription(){
        //Añado la funcionalidad adicional
        return project.getTitle() + "[High Priority";
    }
    
}
