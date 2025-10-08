package co.edu.unicauca.DesignPatterns.state;

public class SustentacionAprobada implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El proyecto ha finalizado exitosamente. ¡Felicitaciones, ha sido aprobado!");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se requieren correcciones. El proyecto ya está aprobado.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El proyecto ya fue aprobado. No hay más pasos.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar un proyecto aprobado.");
    }

    @Override
    public String getNombreEstado() {
        return "Sustentación Aprobada";
    }
}
