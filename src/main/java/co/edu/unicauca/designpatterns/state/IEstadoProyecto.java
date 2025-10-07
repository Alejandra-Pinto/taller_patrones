/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.designpatterns.state;

/**
 *
 * @author sebas
 */

public interface IEstadoProyecto {
    void avanzar(ProjectState proyecto);
    void corregir(ProjectState proyecto);
    void aprobar(ProjectState proyecto);
    void rechazar(ProjectState proyecto);
    String getNombreEstado();
}
