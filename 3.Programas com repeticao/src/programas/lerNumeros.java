package programas;
import java.util.Scanner;
public class lerNumeros{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        
        int conta, valor;
        conta = 0;

        System.out.println("Digite um valor:");
        valor = teclado.nextInt();
        
        while (valor!=0){
            if (100<=valor && valor<=200){
                conta++;
                
            }
            valor = teclado.nextInt();  
        }
       System.out.println(+conta); 
    }
}

