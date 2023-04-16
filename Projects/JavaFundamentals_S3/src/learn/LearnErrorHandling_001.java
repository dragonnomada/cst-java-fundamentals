package learn;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LearnErrorHandling_001 {

    public static void main(String[] args) {
        
        // TRY <BLOQUE SUCEPTIBLE A ERROR>
        // CATCH (<TIPO EXCEPTION>) <BLOQUE CONTROL EXCPETION>
        // CATCH (Exception ex) <BLOQUE CONTROL GENERAL>
        
        try {
            FileWriter writer = new FileWriter("X:\\data\\si_existe.txt");
            
            writer.write("Hola mundo :D");
            
            writer.close();
            
            System.out.println("OKI");
        } catch (IOException ex) {
            System.out.println("NO PASA NADA, SOLO QUE EL ARCHIVO NO EXISTE O TENEMOS PROBLEMAS AL ABRIRLO");
            
            JFrame frame = new JFrame();
            
            JOptionPane.showMessageDialog(frame, "El archivo no existe", "Error al crear el archivo", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.out.println("OCURRIÓN OTRO ERROR NO ESPERADO");
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
