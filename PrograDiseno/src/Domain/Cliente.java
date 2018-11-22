/*
 * Instituto Tecnologico de Costa Rica
 * Diseno de Software
 * Semestre II - 2018
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author orlandojose
 */
class Cliente extends Persona{
    private ArrayList<Pedido> pedidos;
    
    //Constructor
    public Cliente(String nombre, int telefono, String correo, String usuario, String contrasena) {
        super(nombre, telefono, correo, usuario, contrasena);
        pedidos = new ArrayList();
    }
    
}
