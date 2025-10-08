package co.edu.unicauca.DesignPatterns.state;

public class PresentadoDecanatura implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("La Decanatura ha recibido la monografía. El Consejo fija la fecha de sustentación.");
        proyecto.setEstado(new FechaSustentacionFijada());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se pueden hacer correcciones. El proyecto está en trámite de asignación de sustentación.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El proyecto no se aprueba aquí. Se debe esperar la sustentación.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar un proyecto en esta etapa sin evaluación del Consejo.");
    }

    @Override
    public String getNombreEstado() {
        return "Presentado a Decanatura";
    }
}
