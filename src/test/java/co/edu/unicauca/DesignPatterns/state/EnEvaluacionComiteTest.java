/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.state;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sebas
 */
public class EnEvaluacionComiteTest {

    private ProjectState crearProyecto() {
        return new ProjectState(
                "Sistema de Inventario",
                "Formato A",
                "Sebastián Caicedo",
                "Laura Gómez",
                "2025-10-06",
                "Ing. Pérez",
                "N/A",
                "N/A",
                "Optimizar el control de inventarios",
                Arrays.asList("Analizar procesos", "Diseñar base de datos", "Implementar sistema")
        );
    }

    @Test
    public void testAprobacionPorComite() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new EnEvaluacionComite());

        proyecto.getEstadoActual().aprobar(proyecto);

        assertEquals("Aceptado por comité", proyecto.getEstadoActual().getNombreEstado());
    }

    @Test
    public void testRechazoPorComite() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new EnEvaluacionComite());

        proyecto.getEstadoActual().rechazar(proyecto);

        assertEquals("Rechazado por comité", proyecto.getEstadoActual().getNombreEstado());
    }

    @Test
    public void testCorreccionesMenosDeTresIntentos() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new EnEvaluacionComite());

        proyecto.getEstadoActual().corregir(proyecto);

        assertEquals("Correcciones solicitadas por comité", proyecto.getEstadoActual().getNombreEstado());
    }

    @Test
    public void testCorreccionesExcedidasLlevaARechazado() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new EnEvaluacionComite());

        proyecto.getEstadoActual().corregir(proyecto);
        proyecto.setEstado(new EnEvaluacionComite());
        proyecto.getEstadoActual().corregir(proyecto);
        proyecto.setEstado(new EnEvaluacionComite());
        proyecto.getEstadoActual().corregir(proyecto);
        proyecto.setEstado(new EnEvaluacionComite());
        proyecto.getEstadoActual().corregir(proyecto); // 4ta vez

        assertEquals("Rechazado por comité", proyecto.getEstadoActual().getNombreEstado());
    }
}
