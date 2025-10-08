package co.edu.unicauca.designpatterns.state;

public class SustentacionRechazada implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El proyecto ha sido rechazado en la sustentacion. Fin del proceso.");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("El proyecto rechazado no puede corregirse en esta etapa. Debe reiniciar el proceso.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("No se puede aprobar un proyecto que fue rechazado.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El proyecto ya está rechazado.");
    }

    @Override
    public String getNombreEstado() {
        return "Sustentacion Rechazada";
    }
}
