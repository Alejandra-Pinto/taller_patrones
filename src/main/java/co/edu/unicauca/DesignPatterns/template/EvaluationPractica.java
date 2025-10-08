package co.edu.unicauca.DesignPatterns.template;

/**
 * Evaluación de proyectos de tipo Práctica Profesional.
 */
public class EvaluationPractica extends EvaluationTemplate {

    @Override
    protected void revisarDocumentacion() {
        System.out.println("📂 Revisando informe de actividades realizadas en la empresa...");
    }

    @Override
    protected void realizarEvaluacion() {
        System.out.println("⚙️ Evaluando impacto del sistema desarrollado en el entorno laboral...");
    }

    @Override
    protected void generarInforme() {
        System.out.println("🧾 Generando informe con recomendaciones para la empresa.");
    }
}
