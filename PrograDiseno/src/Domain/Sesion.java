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
public class Sesion {
    private static Sesion sesion = null;
    private Persona usuario;
    
    //Funciones especificas
    public void login(Persona usuario) {
        this.usuario = usuario;
    }  
    
    public void logout()
    {
        this.usuario = null;
    }
    
    //Constructores
    private Sesion() {
    }
    
    public static Sesion getSesion() {
        if(sesion==null)
        {
            sesion = new Sesion();
        }
        return sesion; 
    }
    
    //Getters and Setters
    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }
    
    
}
