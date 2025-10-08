package co.edu.unicauca.designpatterns.state;

public class ResolucionAprobado implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("Se ha emitido la resolucion de la Facultad. Inicia el desarrollo del proyecto durante 9 meses.");
        proyecto.setEstado(new EnDesarrollo());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No hay correcciones que realizar en este punto. La resolucion ya fue emitida.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("La resolucion ya fue aprobada y emitida.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar un proyecto con resolucion emitida.");
    }

    @Override
    public String getNombreEstado() {
        return "Resolucion Aprobada";
    }
}
