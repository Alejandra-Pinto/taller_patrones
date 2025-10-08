package co.edu.unicauca.designpatterns.state;
/**
 *
 * @author sebas
 */
public class EnEvaluacionComite implements IEstadoProyecto {

    private int intentosCorreccion = 0;
    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El comite esta evaluando el Formato A. No puede avanzar hasta que se tome una decision.");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        intentosCorreccion++;
        if (intentosCorreccion > 3) {
            System.out.println("Se supero el numero maximo de correcciones (3). Proyecto rechazado por el comite.");
            proyecto.setEstado(new RechazadoPorComite());
        } else {
            System.out.println("El comite ha decidido solicitar correcciones al Formato A.");
            proyecto.setEstado(new CorreccionesComite()); // transición al estado de correcciones
        }
        
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El comite ha aprobado el Formato A.");
        proyecto.setEstado(new AceptadoPorComite()); // transición al estado aceptado
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El comite ha rechazado el Formato A.");
        proyecto.setEstado(new RechazadoPorComite()); // transición al estado rechazado
    }

    @Override
    public String getNombreEstado() {
        return "En evaluacion por comite";
    }
}
