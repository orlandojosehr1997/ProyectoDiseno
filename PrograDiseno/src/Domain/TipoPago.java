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
public class TipoPago {
    private String nombre;
    private String descripcion;

    //Constructor
    public TipoPago(String nombre, String descripcion) {
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
    
    
}
