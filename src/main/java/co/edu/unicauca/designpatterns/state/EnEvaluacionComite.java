package co.edu.unicauca.designpatterns.state;
/**
 *
 * @author sebas
 */
public class EnEvaluacionComite implements IEstadoProyecto {

    private int intentosCorreccion = 0;
    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El comité está evaluando el Formato A. No puede avanzar hasta que se tome una decisión.");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        intentosCorreccion++;
        if (intentosCorreccion > 3) {
            System.out.println("Se superó el número máximo de correcciones (3). Proyecto rechazado por el comité.");
            proyecto.setEstado(new RechazadoPorComite());
        } else {
            System.out.println("El comité ha decidido solicitar correcciones al Formato A.");
            proyecto.setEstado(new CorreccionesComite()); // transición al estado de correcciones
        }
        
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El comité ha aprobado el Formato A.");
        proyecto.setEstado(new AceptadoPorComite()); // transición al estado aceptado
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El comité ha rechazado el Formato A.");
        proyecto.setEstado(new RechazadoPorComite()); // transición al estado rechazado
    }

    @Override
    public String getNombreEstado() {
        return "En evaluación por comité";
    }
}
