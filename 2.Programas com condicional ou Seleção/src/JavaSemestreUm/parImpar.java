package JavaSemestreUm;
import java.util.Scanner;
public class parImpar{
    public static void main (String[]args){
        
        Scanner teclado = new Scanner (System.in);
        int n�mero;
        
        System.out.println("Insira um n�mero:");
        n�mero = teclado.nextInt();
        
        if (n�mero%2==0){
            System.out.println("Esse � um n�mero par.");
        }else{
            System.out.println("Esse � um n�mero �mpar.");
        }
        
        
    }
}