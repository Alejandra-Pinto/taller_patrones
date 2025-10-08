package co.edu.unicauca.designpatterns.state;

public class RechazadoPorComite implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El proyecto fue rechazado. Debe reiniciarse desde el Formato A.");
        proyecto.setEstado(new EstadoInicio());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se pueden realizar correcciones. El comite ya rechazo el proyecto.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("No se puede aprobar un proyecto rechazado. Debe volver a diligenciar el Formato A.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("Ya fue rechazado por el comite.");
    }

    @Override
    public String getNombreEstado() {
        return "Rechazado por comite";
    }
}
