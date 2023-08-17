package JavaSemestreUm;
import java.util.Scanner;
public class mediaPonderada {
    public static void main (String[] args){
        
        Scanner teclado = new Scanner (System.in);
        double n1, p1, n2, p2, n3, p3, total;
        
        System.out.println("Primeira Nota:");
        n1 = teclado.nextDouble();
        System.out.println("Primeiro Peso:");
        p1 = teclado.nextDouble();
        System.out.println("Segunda Nota:");
        n2 = teclado.nextDouble();
        System.out.println("Segundo Peso:");
        p2 = teclado.nextDouble();
        System.out.println("Terceira Nota:");
        n3 = teclado.nextDouble();
        System.out.println("Terceiro Peso:");
        p3 = teclado.nextDouble();
        total = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
        System.out.printf("Resultado Final: %.2f %n",+total);
    }
}

