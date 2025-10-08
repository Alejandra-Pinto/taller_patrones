package co.edu.unicauca.designpatterns.state;

public class AprobadoConsejo implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El Consejo de Facultad ha aprobado el proyecto. Se procede a emitir la resolucion.");
        proyecto.setEstado(new ResolucionAprobado());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No hay correcciones pendientes. El proyecto ya fue aprobado por el Consejo.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El proyecto ya está aprobado por el Consejo de Facultad.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar un proyecto ya aprobado por el Consejo.");
    }

    @Override
    public String getNombreEstado() {
        return "Aprobado por Consejo";
    }
}
