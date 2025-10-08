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
public class EvaluacionDepartamentoTest {

    private ProjectState crearProyecto() {
        return new ProjectState(
                "Sistema de Control Académico",
                "Anteproyecto",
                "Sebastián Caicedo",
                "N/A",
                "2025-10-06",
                "Ing. Rodríguez",
                "N/A",
                "N/A",
                "Mejorar la gestión de notas y asistencia",
                Arrays.asList("Analizar requerimientos", "Diseñar arquitectura", "Implementar módulos")
        );
    }

    @Test
    public void testAprobacionEvaluador() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new EvaluacionDepartamento());

        proyecto.getEstadoActual().aprobar(proyecto);

        assertEquals("Evaluador Acepta", proyecto.getEstadoActual().getNombreEstado());
    }

    @Test
    public void testRechazoEvaluador() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new EvaluacionDepartamento());

        proyecto.getEstadoActual().rechazar(proyecto);

        assertEquals("Evaluador Rechaza", proyecto.getEstadoActual().getNombreEstado());
    }

    @Test
    public void testCorreccionesMenosDeTresIntentos() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new EvaluacionDepartamento());

        proyecto.getEstadoActual().corregir(proyecto);

        assertEquals("Evaluador Pide Correcciones", proyecto.getEstadoActual().getNombreEstado());
    }

    @Test
    public void testCorreccionesExcedidasLlevaARechazado() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new EvaluacionDepartamento());

        proyecto.getEstadoActual().corregir(proyecto);
        proyecto.setEstado(new EvaluacionDepartamento());
        proyecto.getEstadoActual().corregir(proyecto);
        proyecto.setEstado(new EvaluacionDepartamento());
        proyecto.getEstadoActual().corregir(proyecto);
        proyecto.setEstado(new EvaluacionDepartamento());
        proyecto.getEstadoActual().corregir(proyecto); // 4ta vez

        assertEquals("Evaluador Rechaza", proyecto.getEstadoActual().getNombreEstado());
    }
}
