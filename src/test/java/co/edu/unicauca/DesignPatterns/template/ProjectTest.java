package co.edu.unicauca.DesignPatterns.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Project.
 * Verifica getters, setters y el estado del proyecto.
 * 
 * @author Dana
 */
public class ProjectTest {

    @Test
    public void testGetName() {
        System.out.println("Prueba: getName()");
        Project instance = new Project("Sistema de ventas", "Práctica Profesional", "Laura Gómez");
        assertEquals("Sistema de ventas", instance.getName());
    }

    @Test
    public void testGetNameStudent() {
        System.out.println("Prueba: getNameStudent()");
        Project instance = new Project("Aplicación móvil", "Investigación", "Carlos Pérez");
        assertEquals("Carlos Pérez", instance.getNameStudent());
    }

    @Test
    public void testGetType() {
        System.out.println("Prueba: getType()");
        Project instance = new Project("Sistema de gestión", "Práctica Profesional", "Ana Ruiz");
        assertEquals("Práctica Profesional", instance.getType());
    }

    @Test
    public void testIsApprovedInitiallyFalse() {
        System.out.println("Prueba: isApproved() al inicio");
        Project instance = new Project("Plataforma educativa", "Investigación", "David López");
        assertFalse(instance.isApproved(), "El proyecto no debería estar aprobado al inicio.");
    }

    @Test
    public void testSetApproved() {
        System.out.println("Prueba: setApproved()");
        Project instance = new Project("Sistema de inventarios", "Práctica Profesional", "María Torres");
        
        instance.setApproved(true);
        assertTrue(instance.isApproved(), "El proyecto debería marcarse como aprobado.");

        instance.setApproved(false);
        assertFalse(instance.isApproved(), "El proyecto debería poder volver a no aprobado.");
    }

}
