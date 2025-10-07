/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.unicauca.desingpatterns;

import co.edu.unicauca.DesignPatterns.facade.PlatformFacade;
import co.edu.unicauca.DesignPatterns.facade.ProjectFacade;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class TallerPatrones {

    public static void main(String[] args) {
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

        PlatformFacade plataforma = new PlatformFacade();
        plataforma.manageProject(investigacion);
        plataforma.manageProject(practica);
    }
}
