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
public class Empleado extends Persona
{
    private float salarioActual;
    private Puesto puesto;
    
    //Constructor
    
    public Empleado(float salarioActual, Puesto puesto, String nombre, int telefono, String correo, String usuario, String contrasena) {
        super(nombre, telefono, correo, usuario, contrasena);
        this.salarioActual = salarioActual;
        this.puesto = puesto;
    }

    public Empleado(float salarioActual, String nombre, int telefono, String correo, String usuario, String contrasena) {
        super(nombre, telefono, correo, usuario, contrasena);
        this.salarioActual = salarioActual;
    }
    
    //Getters and Setters
    public float getSalarioActual() {
        return salarioActual;
    }

    public void setSalarioActual(float salarioActual) {
        this.salarioActual = salarioActual;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    
}
