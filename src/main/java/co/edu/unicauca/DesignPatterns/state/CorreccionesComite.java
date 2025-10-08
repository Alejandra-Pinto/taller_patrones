package co.edu.unicauca.DesignPatterns.state;

public class CorreccionesComite implements IEstadoProyecto {
    private int intentosCorreccion = 1;

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("No se puede avanzar si no se han dado correcciones.");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        intentosCorreccion++;
        if (intentosCorreccion > 3) {
            System.out.println("Se superó el número máximo de correcciones (3). Proyecto rechazado por el comité.");
            proyecto.setEstado(new RechazadoPorComite());
        } else {
            System.out.println("Formato A devuelto para corrección. Intento " + intentosCorreccion);
            proyecto.setEstado(new EnEvaluacionComite());
        }
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("No se puede aprobar mientras el estudiante está corrigiendo el Formato A.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El comité decide rechazar definitivamente el Formato A.");
        proyecto.setEstado(new RechazadoPorComite());
    }

    @Override
    public String getNombreEstado() {
        return "Correcciones solicitadas por comité";
    }
}
