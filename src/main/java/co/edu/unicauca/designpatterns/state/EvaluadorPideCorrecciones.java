package co.edu.unicauca.designpatterns.state;

public class EvaluadorPideCorrecciones implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("Las correcciones fueron realizadas. Se envía de nuevo a evaluacion del departamento.");
        proyecto.setEstado(new EvaluacionDepartamento());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("El anteproyecto esta siendo corregido según las observaciones del evaluador.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("No se puede aprobar directamente. Debe reevaluarse primero.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El evaluador debe emitir su decision tras la reevaluacion.");
    }

    @Override
    public String getNombreEstado() {
        return "Evaluador Pide Correcciones";
    }
}
