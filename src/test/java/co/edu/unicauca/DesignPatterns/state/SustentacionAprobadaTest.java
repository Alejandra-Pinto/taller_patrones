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
public class SustentacionAprobadaTest {

    private ProjectState crearProyecto() {
        return new ProjectState(
                "Sistema de Gestión de Bibliotecas",
                "Proyecto Final",
                "Sebastián Caicedo",
                "N/A",
                "2025-10-06",
                "Ing. Rojas",
                "N/A",
                "N/A",
                "Automatizar préstamos y devoluciones",
                Arrays.asList("Diseñar base de datos", "Desarrollar módulo de usuarios", "Probar funcionalidades")
        );
    }

    @Test
    public void testSustentacionAprobadaNoCambia() {
        ProjectState proyecto = crearProyecto();
        proyecto.setEstado(new SustentacionAprobada());

        proyecto.getEstadoActual().corregir(proyecto);
        proyecto.getEstadoActual().rechazar(proyecto);
        proyecto.getEstadoActual().aprobar(proyecto);
        proyecto.getEstadoActual().avanzar(proyecto);

        assertEquals("Sustentación Aprobada", proyecto.getEstadoActual().getNombreEstado());
    }
}
