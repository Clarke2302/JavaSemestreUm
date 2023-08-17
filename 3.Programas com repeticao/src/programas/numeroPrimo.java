package programas;
import java.util.Scanner;
public class numeroPrimo {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner (System.in);
        int n,valor,conta;
        
        System.out.println("Informe o valor:");
        valor = teclado.nextInt();
        
        if(valor==1&&valor==0){
            System.out.println("não");
        }
        n=1;
        conta=0;
        while(n<=valor){
            if(valor%n==0){
                conta++;
            }
            n++;
                 
        }  
        if(conta==2){
            System.out.println("sim");
        }else
        System.out.println("não");
    }
  }

