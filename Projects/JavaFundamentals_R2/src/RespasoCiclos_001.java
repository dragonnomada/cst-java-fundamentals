
import java.util.ArrayList;
import java.util.Arrays;

public class RespasoCiclos_001 {

    public static void main(String[] args) {
        
        ArrayList<Integer> primos = new ArrayList<>();
        
        primos.add(2);
        
        int n = 3; // Si `n` no es múltiplo de otro primo, es primo
        
        while (primos.size() < 20) {
            
            boolean nEsPrimo = true;
            
            for (int p : primos) {
                if (n % p == 0) {
                    nEsPrimo = false;
                }
            }
            
            if (nEsPrimo) {
                primos.add(n);
            }
            
            n++;
            
        }
        
        System.out.println(Arrays.toString(primos.toArray()));
        
    }
    
}
