package JavaSemestreUm;
import java.util.Scanner;
public class areaCirculo{
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        double di�metro, �rea, resultado;
        
        System.out.println("Qual � o Valor do Di�metro?");
        di�metro = teclado.nextDouble();
        System.out.printf("Qual � a �rea do C�rculo? %.2f \n",+ (di�metro*di�metro*3.1415) /4);
        
    }
}
