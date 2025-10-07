package co.edu.unicauca.designpatterns.state;

public class PresentadoJefatura implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El anteproyecto ha sido enviado al departamento para evaluación.");
        proyecto.setEstado(new EvaluacionDepartamento());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No puedes hacer correcciones. Está en revisión de la jefatura.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("No se puede aprobar porque no se han desginado evaluadores.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar porque no se han desginado evaluadores.");
    }

    @Override
    public String getNombreEstado() {
        return "Presentado a Jefatura";
    }
}
