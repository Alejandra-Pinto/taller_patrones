/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.state;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sebas
 */
public class ProjectStateTest {

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
    public void testFlujoCompletoProyecto() {
        //1.
        
        ProjectState proyecto = crearProyecto();

        // 2. Formato A Diligenciado → Presentado al Coordinador
        proyecto.setEstado(new EstadoInicio());
        proyecto.avanzar();
        assertTrue(proyecto.getEstadoActual() instanceof PresentadoAlCoordinador,
                "Debe pasar a PresentadoAlCoordinador tras presentar al coordinador");

        // 3. Presentado al Coordinador → En Evaluación por Comité
        proyecto.setEstado(new PresentadoAlCoordinador());
        proyecto.avanzar();
        assertTrue(proyecto.getEstadoActual() instanceof EnEvaluacionComite,
                "El proyecto debe pasar a EnEvaluacionComite");

        // 4. Comité solicita correcciones 3 veces (CorreccionesComite ↔ EnEvaluacionComite)
        proyecto.corregir(); // 1er intento
        assertTrue(proyecto.getEstadoActual() instanceof CorreccionesComite);
        assertEquals(1, proyecto.getIntentosCorreccionComite());

        proyecto.setEstado(new EnEvaluacionComite());
        proyecto.corregir(); // 2do intento
        assertEquals(2, proyecto.getIntentosCorreccionComite());

        proyecto.setEstado(new EnEvaluacionComite());
        proyecto.corregir(); // 3er intento
        assertEquals(3, proyecto.getIntentosCorreccionComite());
        assertTrue(proyecto.getEstadoActual() instanceof CorreccionesComite);

        // 5. Cuarta corrección excede → RechazadoPorComite
        proyecto.setEstado(new EnEvaluacionComite());
        proyecto.corregir();
        assertTrue(proyecto.getEstadoActual() instanceof RechazadoPorComite,
                "Debe pasar a RechazadoPorComite al exceder 3 intentos");

        // 6. Simular caso exitoso: Comité aprueba el proyecto
        proyecto.resetIntentosCorreccionComite();
        proyecto.setEstado(new EnEvaluacionComite());
        proyecto.aprobar();
        assertTrue(proyecto.getEstadoActual() instanceof AceptadoPorComite,
                "El comité debe aprobar y pasar a AceptadoPorComite");

        // 7. Docente y estudiante redactan anteproyecto
        proyecto.setEstado(new AceptadoPorComite());
        proyecto.avanzar();
        assertTrue(proyecto.getEstadoActual() instanceof EscribiendoAnteproyecto,
                "Debe pasar a EscribiendoAnteproyecto tras la aprobación del comité");

        // 8. Anteproyecto → Presentado a jefatura
        proyecto.setEstado(new EscribiendoAnteproyecto());
        proyecto.avanzar();
        assertTrue(proyecto.getEstadoActual() instanceof PresentadoJefatura,
                "Debe pasar a PresentadoJefatura");

        // 9. Jefatura → Evaluación del Departamento
        proyecto.setEstado(new PresentadoJefatura());
        proyecto.avanzar();
        assertTrue(proyecto.getEstadoActual() instanceof EvaluacionDepartamento,
                "Debe pasar a EvaluacionDepartamento");

        // 10. Evaluador pide correcciones
        proyecto.corregir();
        assertTrue(proyecto.getEstadoActual() instanceof EvaluadorPideCorrecciones,
                "El evaluador debe pedir correcciones");

        // 11. Evaluador acepta finalmente el anteproyecto
        proyecto.setEstado(new EvaluacionDepartamento());
        proyecto.aprobar();
        assertTrue(proyecto.getEstadoActual() instanceof EvaluadorAcepta,
                "El evaluador debe aceptar el anteproyecto al aprobar");
    }
}