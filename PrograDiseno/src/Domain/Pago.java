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
public class Pago {
    private String fecha;
    private Cliente cliente;
    private float monto;
    private Pedido pedido;
    private TipoPago tipoPago;
    
    //Constructor

    public Pago(String fecha, Cliente cliente, float monto, Pedido pedido, TipoPago tipoPago) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.monto = monto;
        this.pedido = pedido;
        this.tipoPago = tipoPago;
    }

    public Pago(String fecha, Cliente cliente, float monto, Pedido pedido) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.monto = monto;
        this.pedido = pedido;
    }
    
    //Getters and Setters

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }
    
}
