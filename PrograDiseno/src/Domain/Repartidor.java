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
public class Repartidor extends Empleado
{
    private ArrayList<PorcentajeVentas> porcentajeVentas = new ArrayList();

    //Constructores
    public Repartidor(ArrayList<PorcentajeVentas> porcentajeVentas, float salarioActual, Puesto puesto, String nombre, int telefono, String correo, String usuario, String contrasena) {
        super(salarioActual, puesto, nombre, telefono, correo, usuario, contrasena);
        this.porcentajeVentas = porcentajeVentas;
    }
    
    public void agregarPorcentajeVentas(PorcentajeVentas p){
        porcentajeVentas.add(p);
    }
}
