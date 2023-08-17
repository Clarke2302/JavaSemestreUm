package programas;
import java.util.Scanner;
public class extraDois{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int limite, n;
        limite=0;
        n = 10;
        while(limite<n){
            n=10;
            while(n<limite){
                System.out.print(+limite);
                ++limite;
            }
            
            n--;
        }
    }
}

