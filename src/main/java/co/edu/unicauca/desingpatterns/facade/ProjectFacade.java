package co.edu.unicauca.desingpatterns.facade;

import java.util.List;

public class ProjectFacade {
    private String title;
    private String modality;
    private String student1;
    private String student2; // Solo se usa en investigación
    private String creationDate;
    private String director;
    private String coDirector1;
    private String coDirector2;
    private String generalObjective;
    private List<String> specificObjectives;

    // 🔹 Constructor completo
    public ProjectFacade(String title, String modality, String student1, String student2,
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
    }

    // 🔹 Constructor sin segundo estudiante (para práctica profesional)
    public ProjectFacade(String title, String modality, String student1,
                         String creationDate, String director, String generalObjective,
                         List<String> specificObjectives) {
        this(title, modality, student1, null, creationDate, director, null, null, generalObjective, specificObjectives);
    }

    // 🔹 Getters y Setters
    public String getTitle() {
        return title;
    }

    public String getModality() {
        return modality;
    }

    public String getStudent1() {
        return student1;
    }

    public String getStudent2() {
        return student2;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getDirector() {
        return director;
    }

    public String getCoDirector1() {
        return coDirector1;
    }

    public String getCoDirector2() {
        return coDirector2;
    }

    public String getGeneralObjective() {
        return generalObjective;
    }

    public List<String> getSpecificObjectives() {
        return specificObjectives;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("📘 Proyecto: ").append(title)
          .append("\nModalidad: ").append(modality)
          .append("\nDirector: ").append(director)
          .append("\nEstudiante 1: ").append(student1);
        if (student2 != null) {
            sb.append("\nEstudiante 2: ").append(student2);
        }
        sb.append("\nFecha de creación: ").append(creationDate)
          .append("\nObjetivo general: ").append(generalObjective)
          .append("\nObjetivos específicos: ");
        if (specificObjectives != null) {
            for (String obj : specificObjectives) {
                sb.append("\n   - ").append(obj);
            }
        }
        return sb.toString();
    }
}
