package programas;
import java.util.Scanner;
public class perfeito{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int conta, valor, i;
        
        System.out.println("Insira um n�mero:");
        valor = teclado.nextInt();
        
        if(valor<6){
            System.out.println("n�o");
        }
        
        conta = 0;
        i = 1;
        while (i<=valor/2){
            if(valor%i==0){
                System.out.println(i+" � divisor de "+valor);
                conta = conta+i;
                System.out.println("O somat�rio dos divisores"+conta+"at� agora");
            }
            i++;
        }
        System.out.println("A soma dos divisores de"+valor+"�"+conta);
        if (conta==valor){
            System.out.println("sim");
        }else{
            System.out.println("n�o");
        }
    }
}

