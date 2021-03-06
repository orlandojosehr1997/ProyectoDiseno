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
public class Sucursal {
    
    private String ubicacion;
    private ArrayList<Integer> telefonos;
    private ArrayList<Empleado> empleados;
    private GerenteSucursal gerenteSucursal;

    public void agregarTelefono(int telefono)
    {
        telefonos.add(telefono);
    }

    //Constructor
    
    public Sucursal(String ubicacion, ArrayList<Integer> telefonos, ArrayList<Empleado> empleados, GerenteSucursal gerenteSucursal) {
        this.ubicacion = ubicacion;
        this.telefonos = telefonos;
        this.empleados = empleados;
        this.gerenteSucursal = gerenteSucursal;
    }

    public Sucursal(String ubicacion) {
        this.telefonos = new ArrayList();
        this.empleados = new ArrayList();
        this.ubicacion = ubicacion;
    }
    
    //Getters and Setters
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Integer> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Integer> telefonos) {
        this.telefonos = telefonos;
    }
    
    
    
}
