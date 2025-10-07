package co.edu.unicauca.designpatterns.state;

public class FechaSustentacionFijada implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El Consejo ha fijado la fecha y evaluadores. Se procede con la sustentación pública.");
        proyecto.setEstado(new SustentacionPublica());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se permiten correcciones. El proyecto está a la espera de la sustentación.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("Aún no se puede aprobar. Falta realizar la sustentación.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar. La sustentación aún no ha sido realizada.");
    }

    @Override
    public String getNombreEstado() {
        return "Fecha de Sustentación Fijada";
    }
}
