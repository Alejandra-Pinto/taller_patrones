/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.DesignPatterns.state;

/**
 *
 * @author sebas
 */
public class PresentadoAlCoordinador implements IEstadoProyecto{

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("Enviando al comite evaluador.");
        proyecto.setEstado(new EnEvaluacionComite());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se puede corregir. El proyecto aún no ha sido evaluado.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("No se puede aprobar. Debe presentarse primero.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar un proyecto no presentado.");
    }

    @Override
    public String getNombreEstado() {
        return "Presentado al coordinador";
    }
    
}
