package programas;
import java.util.Scanner;
public class lerIntervalos{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int intI, intF, num,conta;
        
        System.out.println("Informe o intervalo inicial:");
        intI= teclado.nextInt();
        System.out.println("Informe o intervalo final:");
        intF= teclado.nextInt();
        
        //System.out.println("Insira os números para ver se estão entre "+intI+ " e " +intF+"\n");
        num = teclado.nextInt();
        
        conta=0;
        while(num!=0){
            if (intI<=num&&num<=intF){
            conta++;
            }
            num=teclado.nextInt();

      }
      System.out.println(+conta);
    }
}

