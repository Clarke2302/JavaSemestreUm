package JavaSemestreUm;
import java.util.Scanner;
public class parImpar{
    public static void main (String[]args){
        
        Scanner teclado = new Scanner (System.in);
        int número;
        
        System.out.println("Insira um número:");
        número = teclado.nextInt();
        
        if (número%2==0){
            System.out.println("Esse é um número par.");
        }else{
            System.out.println("Esse é um número ímpar.");
        }
        
        
    }
}