package learn;

import entity.Producto;

public class LearnClass {

    public static void main(String[] args) {
        
        Producto producto = new Producto();
        
        //producto.nombre = "Licuadora 3000";
        
        producto.cambiarNombre("Licuadora 3000");
        
        //producto.precio = -100;
        
        producto.actualizarPrecio(-100);
        
        producto.modificarExistencias(1000);
        
        producto.describir();
        
        Producto cocaCola = new Producto();
        
        cocaCola.cambiarNombre("Coca*Cola Light");
        cocaCola.actualizarPrecio(8.75);
        cocaCola.modificarExistencias(3);
        
        cocaCola.describir();
        
    }
    
}
