package practice;

public class PracticeIterators_002 {

    public static void main(String[] args) {
        
        int suma = 0;
        
        // BLOQUE: suma = suma + x | 1 ≤ x ≤ 10
        
        // x = x + 1 => x += 1 => x++
        for(int x = 1; x <= 10; x = x + 1) {
            suma = suma + x;
            System.out.println(suma);
            
            // x=1 suma=0 => suma = 0 + 1 = 1
            // x=2 suma=1 => suma = 1 + 2 = 3
            // x=3 suma=3 => suma = 3 + 3 = 6
            // x=4 suma=6 => suma = 6 + 4 = 10
            // x=5 suma=10 => suma = 10 + 5 = 15
            // x=6 suma=15 => suma = 15 + 6 = 21
            // x=7 suma=21 => suma = 21 + 7 = 28
            // x=8 suma=28 => suma = 28 + 8 = 36
            // x=9 suma=36 => suma = 36 + 9 = 45
            // x=10 suma=45 => suma = 45 + 10 = 55
        }
        
        // suma = 0 + 1 + 2 + 3 + ... + 8 + 9 + 10 = ∑x:1->10 x
        System.out.printf("SUMA: %d %n", suma);
        
    }
    
}
