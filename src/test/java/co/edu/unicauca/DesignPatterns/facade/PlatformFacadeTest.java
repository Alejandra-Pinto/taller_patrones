package co.edu.unicauca.DesignPatterns.facade;

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlatformFacadeTest {
    
    @Test
    public void testManageProjectRunsWithoutError(){
        PlatformFacade platform = new PlatformFacade();
        ProjectFacade project = new ProjectFacade(
                "Proyecto IoT",
                "Práctica Profesional",
                "María Pérez",
                "2025-09-12",
                "Ing. Torres",
                "Desarrollar sistema IoT para sensores",
                Arrays.asList("Diseñar hardware", "Conectar sensores")
        );

        // Solo verificamos que el método se ejecute sin lanzar excepciones
        platform.manageProject(project);
    }
    
}
