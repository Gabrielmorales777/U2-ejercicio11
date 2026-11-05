import java.util.ArrayList;
import java.util.List;

public class CentralMonitoreo {
    private List<Alerta> incidentesActivos;

    public CentralMonitoreo() {
        incidentesActivos = new ArrayList<>();
    }

    public void procesarAlerta(Alerta alerta) {
        incidentesActivos.add(alerta);

        System.out.println("¡ALERTA DE SEGURIDAD!");
        System.out.println("Incidente registrado:");
        System.out.println(alerta);
        System.out.println();
    }

    public void mostrarReporte() {
        System.out.println("===== REPORTE DE ALERTAS =====");

        if (incidentesActivos.isEmpty()) {
            System.out.println("No hay incidentes registrados.");
        } else {
            for (Alerta alerta : incidentesActivos) {
                System.out.println(alerta);
            }
        }
    }
}