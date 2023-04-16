package learn;

import models.Contador;

public class LearnObjects_002 {
    
    public static void main(String[] args) {
        
        // Un objeto es una instancia de clase,
        // es decir, es una referencia a una
        // memoria reservada, para contener
        // (almacenar) todas las propiedades
        // solicitadas (por la clase).
        // A través del objeto podemos acceder
        // (si se permite) a diferentes propiedades
        // (atributos/edados) y métodos
        // (funciones internas de la clase)
        // para hacer operaciones y obtener resultados
        // de esas operaciones que cumplen tareas.
        
        // Por ejemplo:
        // CLASE: Downloader
        // OBJETO: myDownloader_1
        // OBJETO: myDownloader_2
        //
        // myDownloader_1.download("http://.../imagen.png");
        // myDownloader_2.download("http://.../musiquita.mp3");
        
        // INSTANCIAR: Significa reservar la memoria
        // necesaria para crear un contexto dado
        // por una clase (crear un objeto en memoria o
        // crear el contexto para la memoria de un objeto)
        
        // CLASE: Contador
        // OBJETO: miContador_1
        // OBJETO: miContador_2
        Contador miContador_1 = new Contador();
        Contador miContador_2 = new Contador();
        
        System.out.printf("CONTADOR 1: %d %n", 
                miContador_1.getValor());
        System.out.printf("CONTADOR 2: %d %n", 
                miContador_2.getValor());
        
        miContador_1.incrementar();
        miContador_1.incrementar();
        miContador_1.incrementar();
        
        miContador_2.incrementar();
        
        System.out.printf("CONTADOR 1: %d %n", 
                miContador_1.getValor());
        System.out.printf("CONTADOR 2: %d %n", 
                miContador_2.getValor());
        
        miContador_1.decrementar();
        miContador_2.resetear();
        
        System.out.printf("CONTADOR 1: %d %n", 
                miContador_1.getValor());
        System.out.printf("CONTADOR 2: %d %n", 
                miContador_2.getValor());
        
    }
    
}
