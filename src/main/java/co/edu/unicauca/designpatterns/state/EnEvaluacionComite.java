package co.edu.unicauca.DesignPatterns.state;
/**
 *
 * @author sebas
 */
public class EnEvaluacionComite implements IEstadoProyecto {

    
    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El comité está evaluando el Formato A. No puede avanzar hasta que se tome una decisión.");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        proyecto.incrementarIntentosCorreccionComite();

        if (proyecto.getIntentosCorreccionComite() > 3) {
            System.out.println("Se superó el número máximo de correcciones (3). Proyecto rechazado por el comité.");
            proyecto.setEstado(new RechazadoPorComite());
        } else {
            System.out.println("El comité ha decidido solicitar correcciones al Formato A.");
            proyecto.setEstado(new CorreccionesComite());
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
