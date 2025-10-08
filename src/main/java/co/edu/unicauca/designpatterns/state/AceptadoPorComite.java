package co.edu.unicauca.designpatterns.state;

public class AceptadoPorComite implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El proyecto fue aceptado. Ahora puede iniciar la escritura del anteproyecto.");
        proyecto.setEstado(new EscribiendoAnteproyecto());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No hay correcciones pendientes. El comite ya acepto el Formato A.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("Ya fue aprobado por el comite. Debe avanzar al siguiente paso.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar. El comite ya lo acepto.");
    }

    @Override
    public String getNombreEstado() {
        return "Aceptado por comite";
    }
}
