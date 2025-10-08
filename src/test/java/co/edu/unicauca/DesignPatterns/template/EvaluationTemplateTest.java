package co.edu.unicauca.DesignPatterns.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase abstracta EvaluationTemplate.
 * Se usa una subclase interna concreta para verificar el flujo de ejecución del patrón Template.
 * 
 * @author Dana
 */
public class EvaluationTemplateTest {

    /**
     * Implementación concreta mínima del Template para pruebas.
     */
    public class EvaluationTemplateImpl extends EvaluationTemplate {

        private boolean docRevisada = false;
        private boolean evaluacionRealizada = false;
        private boolean informeGenerado = false;

        @Override
        public void revisarDocumentacion() {
            docRevisada = true;
        }

        @Override
        public void realizarEvaluacion() {
            evaluacionRealizada = true;
        }

        @Override
        public void generarInforme() {
            informeGenerado = true;
        }

        // Métodos para comprobar si las fases fueron ejecutadas
        public boolean isDocRevisada() {
            return docRevisada;
        }

        public boolean isEvaluacionRealizada() {
            return evaluacionRealizada;
        }

        public boolean isInformeGenerado() {
            return informeGenerado;
        }
    }

    /**
     * Test del método evaluarProyecto(), que es el método plantilla.
     * Debe ejecutar todas las fases sin lanzar excepciones.
     */
    @Test
    public void testEvaluarProyecto() {
        EvaluationTemplateImpl instance = new EvaluationTemplateImpl();

        assertDoesNotThrow(() -> instance.evaluarProyecto(),
                "El método evaluarProyecto() no debería lanzar excepciones.");

        // Verificamos que las fases abstractas fueron llamadas
        assertTrue(instance.isDocRevisada(), "Debe haberse revisado la documentación.");
        assertTrue(instance.isEvaluacionRealizada(), "Debe haberse realizado la evaluación.");
        assertTrue(instance.isInformeGenerado(), "Debe haberse generado el informe.");
    }

    /**
     * Test de recibirProyecto(): verifica que se ejecute sin errores.
     */
    @Test
    public void testRecibirProyecto() {
        EvaluationTemplate instance = new EvaluationTemplateImpl();
        assertDoesNotThrow(() -> instance.recibirProyecto(),
                "El método recibirProyecto() no debería lanzar excepciones.");
    }

    /**
     * Test de notificarResultado(): verifica que se ejecute sin errores.
     */
    @Test
    public void testNotificarResultado() {
        EvaluationTemplate instance = new EvaluationTemplateImpl();
        assertDoesNotThrow(() -> instance.notificarResultado(),
                "El método notificarResultado() no debería lanzar excepciones.");
    }

    /**
     * Test de los métodos abstractos individuales.
     * (No deberían lanzar errores en esta implementación básica)
     */
    @Test
    public void testMetodosAbstractos() {
        EvaluationTemplateImpl instance = new EvaluationTemplateImpl();

        assertDoesNotThrow(() -> instance.revisarDocumentacion());
        assertDoesNotThrow(() -> instance.realizarEvaluacion());
        assertDoesNotThrow(() -> instance.generarInforme());
    }
}
