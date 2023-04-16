package entity;

// class <NOMBRE CLASE/ENTIDAD> {
//    
//    [ESTADO]
//    <NIVEL ACCESO> <TIPO 1> <NOMBRE ESTADO 1>; // Ejemplo: String nombre;
//    <NIVEL ACCESO> <TIPO 2> <NOMBRE ESTADO 2>; // Ejemplo: double precio;
//    <NIVEL ACCESO> <TIPO 3> <NOMBRE ESTADO 3>; // Ejemplo: int existencias;
//    ...
//
//    [COMPORTAMIENTO]
//    - Operaciones, transacciones, tareas, actividades, ejecuciones, ...
//    <NIVEL ACCESO> <TIPO DEVUELTO> <NOMBRE MÉTODO>(<PARÁMETROS ...>) <BLOQUE>
//    <PARAMÉTROS...> - <PARÁMETRO 1>, <PARÁMETRO 2>, <PARÁMETRO 3>, ...
//    <PARÁMETRO> - <TIPO> <NOMBRE PARÁMETRO>
// }

// CLASE PRODUCTO
public class Producto {

    // [ESTADO]
    String nombre; // Inicializa en null
    double precio; // Inicializa en 0.0
    int existencias; // Inicializa en 0
    
    // [COMPORTAMIENTOS]
    // Un método es una función contenida dentro de una clase
    // que según su nivel de acceso puede ser llamada
    // y el resultado devuelto será entregado
    public void describir() {
        System.out.printf("%s $%.2f (%d existencias) %n", nombre, precio, existencias);
    }
    
    // Los métodos pueden recibir diferentes parámetros
    // para poder acceder a valores externos que se necesiten
    // en el momento en que es llamado el método, para poder
    // funcionar.
    // Por ejemplo, el método cambiarNombre(String nuevoNombre)
    // recibe un String `nuevoNombre` que contendrá
    // un valor String con el nuevo nombre que deberá tener el estado
    // o la propiedad `nombre`
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            precio = nuevoPrecio;
        }
    }
    
    public void modificarExistencias(int nuevasExistencias) {
        existencias = nuevasExistencias;
    }
    
}

// INSTANCIAR UN NUEVO OBJETO: DE LA CLASE CREA UN OBJETO
// CLASE: Producto
// OBJETO: producto
// Producto producto = new Producto();
// producto.cambiarNombre("Gansito");
// producto.actualizarPrecio(20.99);
// producto.modificarExistencias(400);
// producto.describir();

// CLASE: Producto
// OBJETO: cocaCola
// Producto cocaCola = new Producto();
// cocaCola.cambiarNombre("Coca-Cola");
// cocaCola.actualizarPrecio(17.5);
// cocaCola.modificarExistencias(200);
// cocaCola.describir();