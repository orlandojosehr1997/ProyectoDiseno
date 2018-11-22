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
public class PromocionBuilder 
{
    private Promocion promocion;
    
    public void addProducto(Producto p)
    {
        promocion.addProducto(p);
    }
    public void setPrecio(float precio)
    {
        promocion.setPrecio(precio);
    }
    public Promocion getPromocionFinal()
    {
        return promocion;
    }
}
