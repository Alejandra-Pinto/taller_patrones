package co.edu.unicauca.designpatterns.state;

public class EscribiendoAnteproyecto implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El anteproyecto ha sido presentado a la jefatura.");
        proyecto.setEstado(new PresentadoJefatura());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("Aun no hay observaciones. Puedes continuar escribiendo el anteproyecto.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("No se puede aprobar aun. Debe presentarse a la jefatura primero.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar un anteproyecto en redaccion.");
    }

    @Override
    public String getNombreEstado() {
        return "Escribiendo Anteproyecto";
    }
}
