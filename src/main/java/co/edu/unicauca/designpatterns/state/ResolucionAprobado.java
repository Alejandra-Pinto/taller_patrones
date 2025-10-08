package co.edu.unicauca.DesignPatterns.state;

public class ResolucionAprobado implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("Se ha emitido la resolución de la Facultad. Inicia el desarrollo del proyecto durante 9 meses.");
        proyecto.setEstado(new EnDesarrollo());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No hay correcciones que realizar en este punto. La resolución ya fue emitida.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("La resolución ya fue aprobada y emitida.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar un proyecto con resolución emitida.");
    }

    @Override
    public String getNombreEstado() {
        return "Resolución Aprobada";
    }
}
