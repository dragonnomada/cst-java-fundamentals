package practice;

import java.util.Scanner;

public class PracticeConditionals_002 {
    
    public static void main(String[] args) {
        
        int a, b, c;
        
        // 1, 2, 3
        // 1, 3, 2
        // 2, 1, 3
        // 2, 3, 1
        // 3, 1, 2
        // 3, 2, 1
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dame A: ");
        a = scanner.nextInt();
        
        System.out.print("Dame B: ");
        b = scanner.nextInt();
        
        System.out.print("Dame C: ");
        c = scanner.nextInt();
        
        if (a < b) { // SI a < b
            
            if (a < c) { // SI a < c
                
                if (b < c) { // SI b < c: a <<< b <<< c
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                } else { // NO b < c: a <<< c <<< b
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);
                }
                
            } else { // NO a < c: c <<< a <<< b 
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
            
        } else { // NO a < b: b <<< a
            
            if (c < b) { // SI c < b: c <<< b <<< a
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            } else { // NO c < b: b <<< c Y b <<< a
                
                if (c < a) { // SI c < a: b <<< c <<< a
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a);
                } else { // NO c < a: b <<< a <<< c
                    System.out.println(b);
                    System.out.println(a);
                    System.out.println(c);
                }
                
            }
            
        }
        
    }
    
}
