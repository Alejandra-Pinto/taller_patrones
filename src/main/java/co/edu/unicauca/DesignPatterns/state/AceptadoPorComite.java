package co.edu.unicauca.DesignPatterns.state;

public class AceptadoPorComite implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El proyecto fue aceptado. Ahora puede iniciar la escritura del anteproyecto.");
        proyecto.setEstado(new EscribiendoAnteproyecto());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No hay correcciones pendientes. El comité ya aceptó el Formato A.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("Ya fue aprobado por el comité. Debe avanzar al siguiente paso.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar. El comité ya lo aceptó.");
    }

    @Override
    public String getNombreEstado() {
        return "Aceptado por comité";
    }
}
