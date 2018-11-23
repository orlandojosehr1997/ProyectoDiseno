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
public class Pedido {
    private String fecha;
    private ArrayList<Item> items;
    private float monto;
    private Cliente cliente;
    private Evaluacion evaluacion;
    private Pago pago;
    private TipoServicio tipoServicio;

    //Evualuacion
    public void setEvaluacion(Evaluacion evaluacion) {    
        this.evaluacion = evaluacion;
    }
    
    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    //Producto
    public void agregarItem(Item i)
    {
        items.add(i);
    }
    
    public void eliminarProducto(Item i)
    {
        items.remove(i);
    }
   
    //Constructor
    public Pedido(String fecha, ArrayList<Item> items, float monto, Cliente cliente, Evaluacion evaluacion, Pago pago, TipoServicio tipoServicio) {
        this.fecha = fecha;
        this.items = items;
        this.monto = monto;
        this.cliente = cliente;
        this.evaluacion = evaluacion;
        this.pago = pago;
        this.tipoServicio = tipoServicio;
    }
    
    //Gettes and Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
}
