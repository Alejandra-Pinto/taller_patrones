package co.edu.unicauca.desingpatterns;

import co.edu.unicauca.DesignPatterns.decorator.PriorityProject;
import co.edu.unicauca.DesignPatterns.decorator.ProjectD;
import co.edu.unicauca.DesignPatterns.facade.PlatformFacade;
import co.edu.unicauca.DesignPatterns.facade.ProjectFacade;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class TallerPatrones {

    public static void main(String[] args) {
        //INSTANCIAS DE PATRÓN FACADE
        ProjectFacade investigacion = new ProjectFacade(
                "Modelo IA para deteccion de enfermedades",
                "Investigacion",
                "Ana Torres",
                "Luis Gomez",
                "2025-10-04",
                "Dr. Carlos Ruiz",
                "MSc. Laura Díaz",
                null,
                "Desarrollar un modelo IA para diagnostico temprano.",
                Arrays.asList("Recoleccion de datos clinicos", "Entrenamiento del modelo", "Validacion de resultados")
        );

        ProjectFacade practica = new ProjectFacade(
                "Sistema web para inventarios",
                "Practica Profesional",
                "Sofia Herrera",
                "2025-09-12",
                "Ing. Pablo Morales",
                "Implementar un sistema web eficiente.",
                Arrays.asList("Desarrollo de base de datos", "Implementar CRUD", "Desplegar aplicacion")
        );
        
        //INSTANCIAS DE PATRÓN DECORATE
        ProjectD normalProject = new ProjectD("Plataforma de aprendizaje adaptativo basada en IA", 
                "Diseño e implementación de un sistema inteligente que personaliza el contenido educativo según el desempeño del estudiante");
        
        ProjectD priorityProject = new PriorityProject(normalProject);

        
        //APLICANDO PATRÓN FACADE
        PlatformFacade plataforma = new PlatformFacade();
        plataforma.manageProject(investigacion);
        plataforma.manageProject(practica);
        
        
        //APLICANDO PATRÓN DECORATOR
        System.out.println("PATRÓN DECORATOR");
        System.out.println("PROYECTO: " + normalProject.getDescription());
        System.out.println("PROYECTO CON PATRÓN DECORADOR: " + priorityProject.getDescription());
        
    }
}
