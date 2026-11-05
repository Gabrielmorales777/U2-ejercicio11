public class SensorPerimetral {
    private int idZona;
    private String tipoSensor;
    private CentralMonitoreo central;

    public SensorPerimetral(int idZona, String tipoSensor, CentralMonitoreo central) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.central = central;

    }
    public void detectarMovimiento() {
        System.out.println("Sensor de la zona " + idZona
                + " detectó movimiento.");

        Alerta alerta = new Alerta(idZona, tipoSensor);

        central.procesarAlerta(alerta);
    }
}
