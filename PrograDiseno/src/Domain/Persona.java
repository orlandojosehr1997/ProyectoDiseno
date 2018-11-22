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
public abstract class Persona 
{
    private String nombre;
    private int telefono;
    private String correo;
    private String usuario;
    private String contrasena;

    //Constructor
    public Persona(String nombre, int telefono, String correo, String usuario, String contrasena) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    //Getters and Setters
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
