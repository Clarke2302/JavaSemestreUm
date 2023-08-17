package JavaSemestreUm;
import java.util.Scanner;
public class valorMaior {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner (System.in);
        
        
        int valorconcedido,pri ;
        
        valorconcedido = 100;
       
        System.out.println("Insira o primeiro número:");
        pri = teclado.nextInt();
        
        if(valorconcedido<pri){
            System.out.println("sim");
        }else{
            System.out.println("não");
        }
       
    }
}  

