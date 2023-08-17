package JavaSemestreUm;
import java.util.Scanner;

public class somaEntreDoisVal  {
    public static void main (String [] args){
  
        Scanner teclado = new Scanner (System.in);
        int valor1, valor2, soma;
        
        System.out.println("Primeiro número:");
        valor1 = teclado.nextInt();
        System.out.println("Segundo número:");
        valor2 = teclado.nextInt();
        soma = valor1+valor2;
        System.out.println("Resultado da Soma: "+soma);

        
    }
}

