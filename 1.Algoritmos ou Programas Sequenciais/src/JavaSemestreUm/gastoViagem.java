package JavaSemestreUm;
import java.util.Scanner;
public class gastoViagem {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner(System.in);
        double consumo, valorcomb, dist�ncia, ped�gios, valorped, total;
        
        System.out.printf("Quanto o carro consome em litros?");
        consumo = teclado.nextDouble();
        System.out.printf("Qual o valor do comb�stivel?");
        valorcomb = teclado.nextDouble();
        System.out.printf("Qual a dist�ncia percorrida?");
        dist�ncia = teclado.nextDouble();
        System.out.printf("Quantos ped�gios tinham durante o percurso?");
        ped�gios = teclado.nextDouble();
        System.out.printf("Qual o valor de cada ped�gio?");
        valorped = teclado.nextDouble();
        
        total = (dist�ncia/consumo * valorcomb+ped�gios * valorped);
        System.out.printf("Total de Gastos da viagem:"+total);
        
        
    }
}

