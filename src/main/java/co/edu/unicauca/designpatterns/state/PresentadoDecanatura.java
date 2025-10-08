package co.edu.unicauca.designpatterns.state;

public class PresentadoDecanatura implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("La Decanatura ha recibido la monografia. El Consejo fija la fecha de sustentacion.");
        proyecto.setEstado(new FechaSustentacionFijada());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se pueden hacer correcciones. El proyecto está en tramite de asignacion de sustentacion.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El proyecto no se aprueba aqui. Se debe esperar la sustentacion.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar un proyecto en esta etapa sin evaluacion del Consejo.");
    }

    @Override
    public String getNombreEstado() {
        return "Presentado a Decanatura";
    }
}
