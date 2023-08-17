package JavaSemestreUm;
import java.util.Scanner;
public class conversaoKelvin {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner (System.in);
        double fah;
        
        System.out.println("Qual a medição em Fahrenheit?");
        fah = teclado.nextDouble();
        System.out.printf("Qual a temperatura em Kelvin? %.1f \n", + (fah - 32)* 5/9 + 273);
    }
}
