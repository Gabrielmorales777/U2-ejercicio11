import java.time.LocalDateTime;
public class Alerta {
    private int idZona;
    private String tipoSensor;
    private LocalDateTime marcaTemporal;

    public Alerta(int idZona , String tipoSensor){
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.marcaTemporal = LocalDateTime.now();
    }

    public  int getidZona(){

        return idZona;
    }
    public String getTipoSensor(){
        return tipoSensor;
    }
    public LocalDateTime getMarcaTemporal(){
        return marcaTemporal;

    }
@Override
public String toString() {
    return "Zona: " + idZona + " | Sensor: " + tipoSensor + " | Fecha y hora: " + marcaTemporal;
}

}

