package practice;

import entity.Libro;
import java.util.Scanner;

public class PracticeClasses_002 {

    public static void main(String[] args) {
        
        System.out.println("Capturador de Libros v1.0");
        System.out.println("By My Company © 2023");
        System.out.println("Revised at March, 2023");
        System.out.println("-------------------------");
        
        Scanner scanner = new Scanner(System.in);
        
        Libro libro1 = new Libro();
        
        System.out.print("Dame el Título: ");
        libro1.setTitulo(scanner.nextLine());
        
        System.out.print("Dame el Autor: ");
        libro1.setAutor(scanner.nextLine());
        
        System.out.print("Dame el Año de Publicación: ");
        libro1.setAño(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Dame la Edición: ");
        libro1.setEdicion(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Dame la Editorial: ");
        libro1.setEditorial(scanner.nextLine());
        
        System.out.print("Dame el Género: ");
        libro1.setGenero(scanner.nextLine());
        
        System.out.print("Dame el ISBN: ");
        libro1.setIsbn(scanner.nextLine());
        
        System.out.print("Dame el Número de Páginas: ");
        libro1.setNumPaginas(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Dame el Prefacio: ");
        libro1.setPrefacio(scanner.nextLine());
        
        System.out.print("Dame el Reseña: ");
        libro1.setReseña(scanner.nextLine());
        
        libro1.describir();
        
    }
    
}
