package learn;

import java.util.Scanner;

public class LearnConditionalsBySelection {

    public static void main(String[] args) {
        
        String color;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dame un color en ingle's: ");
        color = scanner.nextLine();
        
        // SWITCH (VALUE) { 
        //    CASE VALUE_1: SENTENCES...; BREAK; 
        //    CASE VALUE_2: SENTENCES...; BREAK; 
        //    CASE VALUE_3: SENTENCES...; BREAK; 
        //    ...
        //    DEFAULT: SENTENCES; BREAK;
        // }
        
        switch (color.toUpperCase().trim()) {
            
            case "ROJO":
            case "RED":
                System.out.println("#FF0000 (255, 0, 0)");
                break;
            case "AZUL":
            case "BLUE":
                System.out.println("#0000FF (0, 0, 255)");
                break;
            case "GREEN":
                System.out.println("#00FF00 (0, 255, 0)");
                break;
            case "MAGENTA":
                System.out.println("#FF00FF (255, 0, 255)");
                break;
            case "CYAN":
                System.out.println("#00FFFF (0, 255, 255)");
                break;
            case "YELLOW":
                System.out.println("#FFFF00 (255, 255, 0)");
                break;
            case "BLACK":
                System.out.println("#000000 (0, 0, 0)");
                break;
            case "WHITE":
                System.out.println("#FFFFFF (255, 255, 255)");
                break;
            default:
                System.out.println("#?????? (???, ???, ???)");
                break;
            
        }
        
    }
    
}
