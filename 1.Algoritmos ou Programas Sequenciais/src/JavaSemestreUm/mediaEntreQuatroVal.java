package JavaSemestreUm;
import java.util.Scanner;

public class mediaEntreQuatroVal {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, n4, arit;
        
        System.out.println ("Primeiro n�mero:");
        n1 = teclado.nextDouble();
        System.out.println ("Segundo n�mero:");
        n2 = teclado.nextDouble();
        System.out.println ("Terceiro n�mero:");
        n3 = teclado.nextDouble();
        System.out.println ("Quarto n�mero:");
        n4 = teclado.nextDouble();
        arit = (n1+n2+n3+n4)/4 ;
        System.out.println ("Resultado das m�dias aritm�ticas:"+arit);
        

    }
}

