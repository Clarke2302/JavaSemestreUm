package JavaSemestreUm;
import java.util.Scanner;
public class  reajusteSalario {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        double salário, reajuste, resultado;
        
        System.out.println("Qual o salário atual?");
        salário = teclado.nextDouble();
        System.out.println("Qual o percentual para reajuste?");
        reajuste = teclado.nextDouble();
        
        System.out.printf("Qual o novo salário? %2f \n", +((reajuste/100)*salário+salário));
    }
}

