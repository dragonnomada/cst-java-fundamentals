package practice;

import entity.Libro;

public class PracticeClasses_001 {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        
        libro1.setTitulo("Harry Potter y la cámara secreta");
        
        libro1.setAutor("J.K. Roling");
        
        libro1.setAño(1998);
        
        libro1.setEdicion(2);
        
        libro1.setEditorial("Pinguin");
        
        libro1.setGenero("Ciencia Ficción");
        
        libro1.setIsbn("1234567878");
        
        libro1.setNumPaginas(340);
        
        libro1.setPrefacio("En un mundo normal de muggles, ...");
        
        libro1.setReseña("Habla de un niño prodigio en la magia");
        
        libro1.describir();
        
    }
    
}
