package co.edu.unicauca.designpatterns.state;

public class SustentacionPublica implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("La sustentación ha sido realizada. Esperando calificación del jurado...");
        // Aquí podría decidirse a qué estado ir según el resultado
        System.out.println("Debe registrar si fue 'Aprobada' o 'Rechazada' manualmente.");
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se aplican correcciones durante la sustentación pública.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("El jurado aprueba la sustentación. Proyecto aprobado definitivamente.");
        proyecto.setEstado(new SustentacionAprobada());
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("El jurado rechaza la sustentación. Proyecto no aprobado.");
        proyecto.setEstado(new SustentacionRechazada());
    }

    @Override
    public String getNombreEstado() {
        return "Sustentación Pública";
    }
}
