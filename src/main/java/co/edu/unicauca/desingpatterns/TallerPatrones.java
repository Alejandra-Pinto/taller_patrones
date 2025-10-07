package co.edu.unicauca.desingpatterns;

import co.edu.unicauca.DesignPatterns.adapter.Company;
import co.edu.unicauca.DesignPatterns.adapter.CompanyDataProvider;
import co.edu.unicauca.DesignPatterns.adapter.ExternalService;
import co.edu.unicauca.DesignPatterns.adapter.ExternalServiceAdapter;
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
        
        
        //INSTANCIAS DE PATRÓN ADAPTER
        ExternalService externalService = new ExternalService();
        String jsonData = externalService.getCompanyData();
        CompanyDataProvider adapter = new ExternalServiceAdapter(externalService);
        Company company = adapter.getCompany();
        
        
        //APLICANDO PATRÓN DECORATOR
        System.out.println("\n========================================================PATRÓN DECORATOR======================================================================");
        System.out.println("\nPROYECTO ORIGINAL: " + normalProject);
        System.out.println("\nPROYECTO CON PATRÓN DECORADOR: " + priorityProject);
        
        
        //APLICANDO PATRÓN ADAPTER
        System.out.println("\n========================================================PATRÓN ADAPTER========================================================================");
        System.out.println("\nDATOS ORIGINALES DE LA EMPRESA EN FORMATO JSON:");
        System.out.println(jsonData);
        System.out.println("\nDATOS ADAPTADOS DE LA EMPRESA OBJETO COMPANY: ");
        System.out.println(company);
    }
}
