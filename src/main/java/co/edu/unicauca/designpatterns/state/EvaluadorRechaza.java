package co.edu.unicauca.designpatterns.state;

public class EvaluadorRechaza implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("Se debe rehacer el anteproyecto.");
        proyecto.setEstado(new EscribiendoAnteproyecto());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("El anteproyecto fue rechazado. Debe elaborarse uno nuevo.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("No se puede aprobar. El anteproyecto fue rechazado.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El anteproyecto ya se encuentra rechazado.");
    }

    @Override
    public String getNombreEstado() {
        return "Evaluador Rechaza";
    }
}
