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
    private ArrayList<Empleado> empleados = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Sucursal> sucursales = new ArrayList();
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

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public GerenteGeneral getGerenteGeneral() {
        return gerenteGeneral;
    }

    public void setGerenteGeneral(GerenteGeneral gerenteGeneral) {
        this.gerenteGeneral = gerenteGeneral;
    }
    
}
