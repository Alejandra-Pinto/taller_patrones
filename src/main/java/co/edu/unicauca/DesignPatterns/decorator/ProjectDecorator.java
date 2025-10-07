package co.edu.unicauca.DesignPatterns.decorator;

//Clase abstracta que actua como decorador base, extiende ProjectD y contiene una referencia a otro ProjectD

public abstract class ProjectDecorator extends ProjectD {
    //Atributo project (referencia a ProjectD)
    protected ProjectD project;
    
    //Constructor parametrizado
    public ProjectDecorator(ProjectD project) {
        //Llamamos al constructor de la clase padre
        super(project.getTitle(), project.getDescription());
        this.project = project;
    }
    
    @Override
    public String getTitle(){
        return project.getTitle();
    }
    
    @Override
    public String getDescription(){
        return project.getDescription();
    }
    
    @Override
    public String toString() {
        return "\nTítulo: " + getTitle() + "\nDescripción: " + getDescription();
    }
}
