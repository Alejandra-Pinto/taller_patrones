package co.edu.unicauca.designpatterns.state;

public class SustentacionPublica implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("La sustentacion ha sido realizada. Esperando calificacion del jurado...");
        // Aquí podría decidirse a qué estado ir según el resultado
        System.out.println("Debe registrar si fue 'Aprobada' o 'Rechazada' manualmente.");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se aplican correcciones durante la sustentacion publica.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El jurado aprueba la sustentacion. Proyecto aprobado definitivamente.");
        proyecto.setEstado(new SustentacionAprobada());
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El jurado rechaza la sustentacion. Proyecto no aprobado.");
        proyecto.setEstado(new SustentacionRechazada());
    }

    @Override
    public String getNombreEstado() {
        return "Sustentacion Publica";
    }
}
