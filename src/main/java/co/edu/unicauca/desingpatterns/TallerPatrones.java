package co.edu.unicauca.desingpatterns;


import co.edu.unicauca.DesignPatterns.adapter.Company;
import co.edu.unicauca.DesignPatterns.adapter.CompanyDataProvider;
import co.edu.unicauca.DesignPatterns.adapter.ExternalService;
import co.edu.unicauca.DesignPatterns.adapter.ExternalServiceAdapter;
import co.edu.unicauca.DesignPatterns.decorator.PriorityProject;
import co.edu.unicauca.DesignPatterns.decorator.ProjectD;
import co.edu.unicauca.DesignPatterns.facade.PlatformFacade;
import co.edu.unicauca.DesignPatterns.facade.ProjectFacade;
import co.edu.unicauca.designpatterns.state.ProjectState;
import co.edu.unicauca.DesignPatterns.template.EvaluationTemplate;
import co.edu.unicauca.DesignPatterns.template.EvaluationInvestigation;
import co.edu.unicauca.DesignPatterns.template.EvaluationPractica;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class TallerPatrones {

    public static void main(String[] args) {
        //INTANCIA DE PATRÓN STATE
        ProjectState proyecto = new ProjectState(
                "Sistema de Gestion de Proyectos de Grado",
                "Investigacion",
                "Sebastian Caicedo",
                "Alejandra Pinto",
                "07/10/2025",
                "Dr. Francisco Lopez",
                "Ing. Laura Perez",
                "Ing. Andres Ruiz",
                "Desarrollar un sistema que gestione los proyectos academicos de grado",
                Arrays.asList("Analizar requerimientos", "Diseñar arquitectura", "Implementar solucion")
        );
        String[] acciones = {
            "avanzar",   // EstadoInicio -> PresentadoAlCoordinador
            "avanzar",   // PresentadoAlCoordinador -> EnEvaluacionComite
            "corregir",  // EnEvaluacionComite -> CorreccionesComite
            "corregir",  // CorreccionesComite -> EnEvaluacionComite
            "aprobar",   // EnEvaluacionComite -> AceptadoPorComite
            "avanzar",   // AceptadoPorComite -> EscribiendoAnteproyecto
            "avanzar",   // EscribiendoAnteproyecto -> PresentadoJefatura
            "avanzar",   // PresentadoJefatura -> EvaluacionDepartamento
            "aprobar",   // EvaluacionDepartamento -> EvaluadorAcepta
            "avanzar",   // EvaluadorAcepta -> AprobadoConsejo
            "avanzar",   // AprobadoConsejo -> ResolucionAprobado
            "avanzar",   // ResolucionAprobado -> EnDesarrollo
            "avanzar",   // EnDesarrollo -> FinalizadoMonografia
            "avanzar",   // FinalizadoMonografia -> PresentadoDecanatura
            "avanzar",   // PresentadoDecanatura -> FechaSustentacionFijada
            "avanzar",   // FechaSustentacionFijada -> SustentacionPublica
            "aprobar",   // SustentacionPublica -> SustentacionAprobada (fin feliz)
            "avanzar"    // SustentacionAprobada -> SustentacionAprobada
        };

        
        
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
                "Diseño e implementacion de un sistema inteligente que personaliza el contenido educativo segun el desempeño del estudiante");
        ProjectD priorityProject = new PriorityProject(normalProject);        
        
        //INSTANCIAS DE PATRÓN ADAPTER
        ExternalService externalService = new ExternalService();
        String jsonData = externalService.getCompanyData();
        CompanyDataProvider adapter = new ExternalServiceAdapter(externalService);
        Company company = adapter.getCompany();
        
        
        //APLICANDO PATRÓN STATE
        System.out.println("\n========================================================PATRON STATE======================================================================");
        System.out.println("===== SIMULACION COMPLETA DE PROYECTO =====");
        System.out.println("Estado inicial: " + proyecto.getEstadoActual());
        System.out.println("============================================\n");

        for (String accion : acciones) {
            System.out.println(">> Accion ejecutada: " + accion.toUpperCase());

            switch (accion) {
                case "avanzar":
                    proyecto.presentar();
                    break;
                case "corregir":
                    proyecto.corregir();
                    break;
                case "aprobar":
                    proyecto.aprobar();
                    break;
                case "rechazar":
                    proyecto.rechazar();
                    break;
                default:
                    System.out.println("Accion no reconocida: " + accion);
                    break;
            }

            System.out.println("Estado actual: " + proyecto.getEstadoActual());
            System.out.println("--------------------------------------------");
        }

        System.out.println("\n===== PROCESO FINALIZADO =====");
        System.out.println(proyecto);
        
        //APLICANDO PATRÓN FACADE
        System.out.println("\n========================================================PATRON FACADE======================================================================");
        PlatformFacade plataforma = new PlatformFacade();
        plataforma.manageProject(investigacion);
        plataforma.manageProject(practica);
        
        //APLICANDO PATRÓN DECORATOR
        System.out.println("\n========================================================PATRON DECORATOR======================================================================");
        System.out.println("\nPROYECTO ORIGINAL: " + normalProject);
        System.out.println("\nPROYECTO CON PATRON DECORADOR: " + priorityProject);
        
        //APLICANDO PATRÓN ADAPTER
        System.out.println("\n========================================================PATRON ADAPTER========================================================================");
        System.out.println("\nDATOS ORIGINALES DE LA EMPRESA EN FORMATO JSON:");
        System.out.println(jsonData);
        System.out.println("\nDATOS ADAPTADOS DE LA EMPRESA OBJETO COMPANY: ");
        System.out.println(company);
        
        //APLICANDO PATRÓN TEMPLATE
        System.out.println("\n========================================================PATRON TEMPLATE======================================================================");

        EvaluationTemplate investigacionEval = new EvaluationInvestigation();
        EvaluationTemplate practicaEval      = new EvaluationPractica();

        System.out.println("\n--- Evaluación Proyecto de Investigación ---");
        investigacionEval.evaluarProyecto();

        System.out.println("\n--- Evaluación Práctica Profesional ---");
        practicaEval.evaluarProyecto();

    }
}
