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
public interface TipoPago {
    public String getNombre();
    public String getDescripcion();
    public void setDescripcion(String descripcion);
    public void setNombre(String nombre);
    public void pagar();
    
}
