package co.edu.unicauca.designpatterns.state;

public class EvaluacionDepartamento implements IEstadoProyecto {

    private int intentosCorreccion = 0;
    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El departamento está evaluando el anteproyecto. Debe decidir si lo aprueba, rechaza o pide correcciones.");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        intentosCorreccion++;
        if (intentosCorreccion > 3) {
            System.out.println("Se superó el número máximo de correcciones (3). Proyecto rechazado por el departamento.");
            proyecto.setEstado(new EvaluadorRechaza());
        } else {
            System.out.println("El evaluador ha solicitado correcciones al anteproyecto.");
            proyecto.setEstado(new EvaluadorPideCorrecciones());
        }
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El evaluador ha aceptado el anteproyecto.");
        proyecto.setEstado(new EvaluadorAcepta());
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El evaluador ha rechazado el anteproyecto.");
        proyecto.setEstado(new EvaluadorRechaza());
    }

    @Override
    public String getNombreEstado() {
        return "Evaluación Departamento";
    }
}
