package co.edu.unicauca.designpatterns.state;

public class ProrrogaSolicitada implements IEstadoProyecto {

    @Override
    public void avanzar(ProjectState proyecto) {
        System.out.println("La prórroga ha sido concedida. El proyecto continúa hasta su finalización.");
        proyecto.setEstado(new FinalizadoMonografia());
    }

    @Override
    public void corregir(ProjectState proyecto) {
        System.out.println("No se aplican correcciones durante la prórroga, solo se extiende el tiempo de desarrollo.");
    }

    @Override
    public void aprobar(ProjectState proyecto) {
        System.out.println("La prórroga no requiere aprobación adicional. Continúe el desarrollo.");
    }

    @Override
    public void rechazar(ProjectState proyecto) {
        System.out.println("No es posible rechazar durante la prórroga. Debe finalizar el trabajo.");
    }

    @Override
    public String getNombreEstado() {
        return "Prórroga Solicitada";
    }
}
