/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author orlandojose
 */
public class Evaluacion {
    private Cliente cliente;
    private Pedido pedido;
    private String comentario;
    private int calificacion;
    
    //Constructor

    public Evaluacion(Cliente cliente, Pedido pedido, String comentario, int calificacion) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }
    
    //Getters and Setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
}
