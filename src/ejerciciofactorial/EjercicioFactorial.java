package ejerciciofactorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JUAN
 */
public class EjercicioFactorial {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Escribe un número: ");
        int n = Integer.parseInt(br.readLine());
        
        while( n < 0 )
        {
            System.out.println("ERROR: El número no es positivo.");
            
            System.out.println("Escribe un número: ");
            n = Integer.parseInt(br.readLine());
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            //factorial = factorial * i; - se puede escribir tambien asi
              factorial *= i;
        }
        
        System.out.println("Factorial de "+n+": "+factorial);
    }
    
}
