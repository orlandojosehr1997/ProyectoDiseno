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
class Promocion {
    private float precio;
    private ArrayList<Producto> productos;

    //Funciones Especificas
    public void addProducto(Producto p)
    {
        productos.add(p);
    }
    
    //Constructor
    public Promocion(float precio, ArrayList<Producto> productos) {
        this.precio = precio;
        this.productos = productos;
    }
    
    //Getters and Setters
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

}
