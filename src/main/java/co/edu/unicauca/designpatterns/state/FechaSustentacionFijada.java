package co.edu.unicauca.designpatterns.state;

public class FechaSustentacionFijada implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("El Consejo ha fijado la fecha y evaluadores. Se procede con la sustentacion publica.");
        proyecto.setEstado(new SustentacionPublica());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se permiten correcciones. El proyecto está a la espera de la sustentacion.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("Aun no se puede aprobar. Falta realizar la sustentacion.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No se puede rechazar. La sustentacion aun no ha sido realizada.");
    }

    @Override
    public String getNombreEstado() {
        return "Fecha de Sustentacion Fijada";
    }
}
