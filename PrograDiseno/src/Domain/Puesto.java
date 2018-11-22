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
public class Puesto 
{
    private String nombre;
    private String descripcion;
    private Salario salario;

    //Constructor
    
    public Puesto(String nombre, String descripcion, Salario salario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public Puesto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }
    
}
