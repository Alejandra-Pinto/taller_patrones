package co.edu.unicauca.DesignPatterns.state;

public class FinalizadoMonografia implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El proyecto ha sido finalizado. Se entrega la monografía y anexos a Decanatura.");
        proyecto.setEstado(new PresentadoDecanatura());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("El proyecto ya fue finalizado. No se pueden hacer correcciones en esta etapa.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El proyecto no puede aprobarse aún. Debe ser entregado a Decanatura primero.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El proyecto finalizado no puede ser rechazado sin evaluación formal.");
    }

    @Override
    public String getNombreEstado() {
        return "Finalizado Monografía";
    }
}
