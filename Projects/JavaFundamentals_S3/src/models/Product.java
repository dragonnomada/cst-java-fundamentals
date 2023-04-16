package models;

// La encapsulación/encapsulamiento
// se basa en restringir partes del código
// para que no sean accesibles en otros lugares
// Por ejemplo, podemos hacer que las propiedades
// o los métodos tengan distintos niveles de acceso:

// Niveles de acceso:
// <default> - Permite el acceso dentro del mismo paquete
// public - Permite el acceso desde cualquier paquete
// protected - Permite el acceso dentro de la clase o sus derivados
// private - Permite el acceso sólo dentro de la clase

public class Product {
    
    private String name;
    private double price;

    public Product() {
        this.name = "UNKONWN";
        this.price = 0.0;
    }
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {   
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("[WARNING] EL PRECIO NO PUEDE SER NEGATIVO");
            //throw new Exception("El precio no puede ser negativo");
        }
    }
    
}
