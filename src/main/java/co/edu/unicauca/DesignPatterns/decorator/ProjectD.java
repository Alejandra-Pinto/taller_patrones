package co.edu.unicauca.DesignPatterns.decorator;

public class ProjectD {
    private String title;
    private String description;
    
    //Constructor con parámetros (el título y la descripción del proyecto)
    public ProjectD(String title, String description){
        this.title = title;
        this.description = description;
    }

    //Setters and Getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){
        return "\nTitulo: " + title + "\nDescripcion: " + description;
    }
    
}
