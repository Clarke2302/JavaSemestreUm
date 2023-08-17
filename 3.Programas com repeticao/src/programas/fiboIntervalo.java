package programas;
import java.util.Scanner;
public class fiboIntervalo {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int a = 0;
        int b = 1 ;
        int resto;
        int val1;
        int val2;
        
        System.out.println("informe o primeiro valor da série:");
        val1 = teclado.nextInt();
        System.out.println("informe o segundo valor da série:");
        val2 = teclado.nextInt();
        
    
        while(a<=val2&& b<=val2){
         
          System.out.printf(a+" ");    
        
           resto=a+b;
           a=b;
           b=resto;
          
           

        }  
    }
}
