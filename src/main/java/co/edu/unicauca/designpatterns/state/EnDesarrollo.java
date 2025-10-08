package co.edu.unicauca.DesignPatterns.state;

public class EnDesarrollo implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El proyecto ha completado su desarrollo. Se presenta la monografía para revisión.");
        proyecto.setEstado(new FinalizadoMonografia());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("Durante el desarrollo, las correcciones se gestionan internamente por el docente y el estudiante.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El proyecto no puede aprobarse directamente en esta etapa. Debe finalizar primero.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El proyecto no puede rechazarse en esta etapa sin revisión formal.");
    }

    @Override
    public String getNombreEstado() {
        return "En Desarrollo";
    }
    
    public void prorroga(ProjectState proyecto){
        System.out.println("El estudiante ha solicitado una prorroga de 3 meses.");
        proyecto.setEstado(new ProrrogaSolicitada());
    }
}
