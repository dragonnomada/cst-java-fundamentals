package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo_001 {

    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("C:\\no_existe.txt");
        
        Scanner scanner = new Scanner(file);
        
    }
    
}
