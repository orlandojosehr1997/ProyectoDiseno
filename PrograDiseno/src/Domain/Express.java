/*
 * Instituto Tecnologico de Costa Rica
 * Diseno de Software
 * Semestre II - 2018
 */
package Domain;

/**
 *
 * @author orlandojose
 */
public class Express implements TipoServicio {
    private float precioEnvio;
    private float tiempoPreparacion;
    private float tiempoEnvio;

    //Constructor
    public Express(float precioEnvio, float tiempoPreparacion, float tiempoEnvio) {
        this.precioEnvio = precioEnvio;
        this.tiempoPreparacion = tiempoPreparacion;
        this.tiempoEnvio = tiempoEnvio;
    }

    //Getters and Setters
    public float getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(float precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public float getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(float tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public float getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(float tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }
    
    
}
