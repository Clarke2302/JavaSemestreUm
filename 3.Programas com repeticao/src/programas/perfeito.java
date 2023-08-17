package programas;
import java.util.Scanner;
public class perfeito{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int conta, valor, i;
        
        System.out.println("Insira um número:");
        valor = teclado.nextInt();
        
        if(valor<6){
            System.out.println("não");
        }
        
        conta = 0;
        i = 1;
        while (i<=valor/2){
            if(valor%i==0){
                System.out.println(i+" é divisor de "+valor);
                conta = conta+i;
                System.out.println("O somatório dos divisores"+conta+"até agora");
            }
            i++;
        }
        System.out.println("A soma dos divisores de"+valor+"é"+conta);
        if (conta==valor){
            System.out.println("sim");
        }else{
            System.out.println("não");
        }
    }
}

