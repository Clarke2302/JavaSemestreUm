package JavaSemestreUm;
import java.util.Scanner;
public class maiorDois {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        int n1;
        int n2;
        
        System.out.println("Insira o primeiro n�mero:");
        n1 = teclado.nextInt();
        System.out.println("Insira o segundo n�mero:");
        n2 = teclado.nextInt();
        
        
        if (n1>n2&&n1!=0&&n2!=0&&n1>0&&n2>0) {
            System.out.println("primeiro");
        }
        if (n2>n1&&n1!=0&&n2!=0&&n1>0&&n2>0) {
            System.out.println("segundo");
        }
        if (n1==n2&&n1!=0&&n2!=0&&n1>0&&n2>0) {
            System.out.println("iguais");
        }
        if (n1==0||n2==0&&n1<0||n2<0) {
            System.out.println("inv�lido");
        }
              
    }
}

