package co.edu.unicauca.DesignPatterns.decorator;

//Decorador concreto que añade la etiqueta de alta prioridad al titulo del proyecto

public class PriorityProject extends ProjectDecorator{
    
    public PriorityProject(ProjectD project){
        super(project);
    }
    
    @Override
    public String getDescription() {
        return project.getDescription();
    }

    @Override
    public String getTitle() {
        return project.getTitle() + " [High Priority]";
    }

    @Override
    public String toString() {
        return "\nTitulo: " + getTitle() + "\nDescripcion: " + getDescription();
    }

    
}
