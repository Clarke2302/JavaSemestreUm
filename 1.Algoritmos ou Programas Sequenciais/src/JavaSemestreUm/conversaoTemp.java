package JavaSemestreUm;
import java.util.Scanner;
public class conversaoTemp {
    public static void main (String[]args){
       
        Scanner teclado = new Scanner (System.in);
        double fah;
        
        System.out.println("Qual a temperatura em Fahrenheit?");
        fah = teclado.nextDouble();
        System.out.printf("Qual a medição dela em Celsius? %.1f\n", +(fah-32)*5/9);
        
    }
}
