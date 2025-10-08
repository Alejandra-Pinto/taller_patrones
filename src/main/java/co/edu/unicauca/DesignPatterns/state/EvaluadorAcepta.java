package co.edu.unicauca.DesignPatterns.state;

public class EvaluadorAcepta implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El anteproyecto fue aceptado. Se envía al Consejo de Facultad para aprobación final.");
        proyecto.setEstado(new AprobadoConsejo());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se requieren correcciones. El anteproyecto ya fue aceptado.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El anteproyecto ya está aprobado por el evaluador.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar. El anteproyecto fue aprobado.");
    }

    @Override
    public String getNombreEstado() {
        return "Evaluador Acepta";
    }
}
