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
public class PorcentajeVentas 
{
    private float monto;
    private String fecha;
    
    //Constructor
    public PorcentajeVentas(float monto, String fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }
    
    //Getters and Setters
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
