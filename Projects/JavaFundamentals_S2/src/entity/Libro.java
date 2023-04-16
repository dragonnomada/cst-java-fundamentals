package entity;

public class Libro {

    String titulo;
    String autor;
    int año;
    String editorial;
    String isbn;
    String genero;
    int numPaginas;
    String prefacio;
    String reseña;
    int edicion;
    
    // Los ajustadores de estados/propiedades
    // son conocidos como SETTERS (SET -> AJUSTAR, SETTER -> AJUSTADOR)
    // En Java se coviene que cada atributo/propiedad/estado
    // tenga un método ajustador, que es construido con el mismo
    // nombre, pero usando el prefijo set.
    // Por ejemplo: Para nombre -> setNombre(), titulo -> setTitulo(), ...
    // Casi todos los IDE tienen la posibilidad de generar código
    // y generar los ajustadores/setters necesarios
    
    // En Netbeans:
    // 1. (Clic Secundario)
    // 2. Insertar Código (Insert Code... [ALT + INSERT])
    // 3. Setter...

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setPrefacio(String prefacio) {
        this.prefacio = prefacio;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    
    public void describir() {
        System.out.println("LIBRO");
        System.out.println("---------------------------");
        System.out.printf("TÍTULO: %s %n", titulo);
        System.out.printf("AUTOR: %s %n", autor);
        System.out.printf("AÑO: %d %n", año);
        System.out.printf("EDITORIAL: %s %n", editorial);
        System.out.printf("EDICIÓN: %d %n", edicion);
        System.out.printf("ISBN: %s %n", isbn);
        System.out.printf("GÉNERO: %s %n", genero);
        System.out.printf("PÁGINAS: %d %n", numPaginas);
        System.out.println("---------------------------");
        System.out.println("RESEÑA:");
        System.out.println(reseña);
        System.out.println("---------------------------");
        System.out.println("PREFACIO:");
        System.out.println(prefacio);
        System.out.println("---------------------------");
        
    }
    
}
