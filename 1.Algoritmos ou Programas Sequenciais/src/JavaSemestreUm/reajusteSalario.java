package JavaSemestreUm;
import java.util.Scanner;
public class  reajusteSalario {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        double sal�rio, reajuste, resultado;
        
        System.out.println("Qual o sal�rio atual?");
        sal�rio = teclado.nextDouble();
        System.out.println("Qual o percentual para reajuste?");
        reajuste = teclado.nextDouble();
        
        System.out.printf("Qual o novo sal�rio? %2f \n", +((reajuste/100)*sal�rio+sal�rio));
    }
}

