package co.edu.unicauca.DesignPatterns.template;

/**
 * Evaluación de proyectos de tipo Investigación.
 */
public class EvaluationInvestigation extends EvaluationTemplate {

    @Override
    protected void revisarDocumentacion() {
        System.out.println("🔍 Revisando marco teórico y antecedentes de investigación...");
    }

    @Override
    protected void realizarEvaluacion() {
        System.out.println("Evaluando metodología experimental y resultados obtenidos...");
    }

    @Override
    protected void generarInforme() {
        System.out.println("📝 Generando informe con observaciones sobre calidad científica.");
    }
}
