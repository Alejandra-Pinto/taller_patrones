package co.edu.unicauca.DesignPatterns.template;

/**
 * Clase abstracta que define la plantilla del proceso de evaluación de un proyecto.
 */
public abstract class EvaluationTemplate {

    // Método plantilla (no se puede modificar)
    public final void evaluarProyecto() {
        recibirProyecto();
        revisarDocumentacion();
        realizarEvaluacion();
        generarInforme();
        notificarResultado();
    }

    // Métodos comunes
    protected void recibirProyecto() {
        System.out.println("📦 Proyecto recibido por el comité de evaluación.");
    }

    protected void notificarResultado() {
        System.out.println("📢 Resultado notificado al estudiante y al asesor.\n");
    }

    // Métodos abstractos que las subclases implementan
    protected abstract void revisarDocumentacion();
    protected abstract void realizarEvaluacion();
    protected abstract void generarInforme();
}
