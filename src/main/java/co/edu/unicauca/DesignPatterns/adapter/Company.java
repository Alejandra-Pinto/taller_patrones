package co.edu.unicauca.DesignPatterns.adapter;

public class Company {
    //Atributos de la empresa
    private String name;
    private String description;
    
    //Constructor parametrizado
    public Company(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    //Setters y getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){
        return "Empresa: " + name + "\nDescripción: " + description;
    }
    
}
