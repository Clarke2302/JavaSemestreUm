package JavaSemestreUm;
import java.util.Scanner;
public class areaCirculo{
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        double diâmetro, área, resultado;
        
        System.out.println("Qual é o Valor do Diâmetro?");
        diâmetro = teclado.nextDouble();
        System.out.printf("Qual é a Área do Círculo? %.2f \n",+ (diâmetro*diâmetro*3.1415) /4);
        
    }
}
