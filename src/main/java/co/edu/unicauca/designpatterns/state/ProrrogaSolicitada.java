package co.edu.unicauca.designpatterns.state;

public class ProrrogaSolicitada implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("La prorroga ha sido concedida. El proyecto continua hasta su finalizacion.");
        proyecto.setEstado(new FinalizadoMonografia());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se aplican correcciones durante la prorroga, solo se extiende el tiempo de desarrollo.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("La prorroga no requiere aprobación adicional. Continue el desarrollo.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No es posible rechazar durante la prorroga. Debe finalizar el trabajo.");
    }

    @Override
    public String getNombreEstado() {
        return "Prorroga Solicitada";
    }
}
