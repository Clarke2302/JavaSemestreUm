package JavaSemestreUm;
import java.util.Scanner;
public class maquinaSaque {
    public static void main(String[]args){
        
        Scanner teclado = new Scanner (System.in);
        int valor, n100, n20, n5, n1;
    
        
        System.out.println("Quanto você quer sacar?");
        valor = teclado.nextInt();
        
        n100 = valor/100;
        System.out.println(n100+" de 100");
        n20 = valor%100;
        System.out.println(n20/20 + " de 20");
        n5 = valor%20;
        System.out.println(n5/5 +" de 5");
        n1 = valor%5;
        System.out.println(n1/1 +" de 1");
        
    }
}

