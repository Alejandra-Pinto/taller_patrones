package co.edu.unicauca.DesignPatterns.state;

import java.util.List;

/**
 *
 * @author sebas
 */
public class ProjectState {
    private String title;
    private String modality;
    private String student1;
    private String student2;
    private String creationDate;
    private String director;
    private String coDirector1;
    private String coDirector2;
    private String generalObjective;
    private List<String> specificObjectives;

    // Atributo del patrón State
    private IEstadoProyecto estadoActual;

    // Contador de correcciones del comité
    private int intentosCorreccionComite = 0;

    public ProjectState(String title, String modality, String student1, String student2,
                         String creationDate, String director, String coDirector1,
                         String coDirector2, String generalObjective, List<String> specificObjectives) {
        this.title = title;
        this.modality = modality;
        this.student1 = student1;
        this.student2 = student2;
        this.creationDate = creationDate;
        this.director = director;
        this.coDirector1 = coDirector1;
        this.coDirector2 = coDirector2;
        this.generalObjective = generalObjective;
        this.specificObjectives = specificObjectives;

        // Estado inicial del proyecto
        this.estadoActual = new EstadoInicio();
    }

    // Getters básicos
    public String getTitle() { return title; }
    public String getModality() { return modality; }
    public String getStudent1() { return student1; }
    public String getStudent2() { return student2; }
    public String getCreationDate() { return creationDate; }
    public String getDirector() { return director; }
    public String getGeneralObjective() { return generalObjective; }
    public List<String> getSpecificObjectives() { return specificObjectives; }

    // Métodos del patrón State (delegan al estado actual)
    public void presentar() { estadoActual.avanzar(this); }
    public void corregir() { estadoActual.corregir(this); }
    public void aprobar() { estadoActual.aprobar(this); }
    public void rechazar() { estadoActual.rechazar(this); }

    // Métodos para cambiar o consultar el estado
    public void setEstado(IEstadoProyecto nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public IEstadoProyecto getEstadoActual() {
        return estadoActual;
    }

    // 🔹 NUEVOS MÉTODOS: control del número de correcciones por comité
    public int getIntentosCorreccionComite() {
        return intentosCorreccionComite;
    }

    public void incrementarIntentosCorreccionComite() {
        this.intentosCorreccionComite++;
    }

    public void resetIntentosCorreccionComite() {
        this.intentosCorreccionComite = 0;
    }

    @Override
    public String toString() {
        return "Proyecto: " + title + "\n" +
               "Modalidad: " + modality + "\n" +
               "Estado actual: " + getEstadoActual();
    }
}
