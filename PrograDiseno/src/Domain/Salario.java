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
public class Salario 
{
    private float montoMinimo;
    private float montoMaximo;

    public Salario(float montoMinimo, float montoMaximo) {
        this.montoMinimo = montoMinimo;
        this.montoMaximo = montoMaximo;
    }
    
    //Getters and Setters

    public float getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(float montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public float getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(float montoMaximo) {
        this.montoMaximo = montoMaximo;
    }
    
}
