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
public class CadenaRestaurante {
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;
    private GerenteGeneral gerenteGeneral;
    
    //Constructor

    public CadenaRestaurante(GerenteGeneral gerenteGeneral) {
        this.gerenteGeneral = gerenteGeneral;
    }
    
    public Boolean agregarPersona(Persona p)
    {
        if(p instanceof Empleado)
        {
            empleados.add((Empleado) p);
            return true;
        }
        else if(p instanceof Cliente)
        {
            clientes.add((Cliente) p);
            return true;
        }
        else
        {
            System.out.println("Error: Persona no es cliente ni empleado.");
            return false;
        }
    }
}
