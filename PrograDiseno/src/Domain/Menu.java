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
public class Menu {
    private static Menu menu = null;
    private ArrayList<Promocion> promociones;
    private ArrayList<Item> items;
    
    //Constructor
    private Menu() {
    }
    
    //Singleton Instance Call
    public static Menu getInstance() {
        if(menu==null)
        {
            menu = new Menu();
        }
        return menu; 
    }
    
    //Getters and Setters
    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(ArrayList<Promocion> promociones) {
        this.promociones = promociones;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setProductos(ArrayList<Item> items) {
        this.items = items;
    }

   
}
