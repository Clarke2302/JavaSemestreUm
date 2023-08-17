package JavaSemestreUm;
import java.util.Scanner;
public class gastoViagem {
    public static void main (String[]args){
        
        Scanner teclado = new Scanner(System.in);
        double consumo, valorcomb, distância, pedágios, valorped, total;
        
        System.out.printf("Quanto o carro consome em litros?");
        consumo = teclado.nextDouble();
        System.out.printf("Qual o valor do combústivel?");
        valorcomb = teclado.nextDouble();
        System.out.printf("Qual a distância percorrida?");
        distância = teclado.nextDouble();
        System.out.printf("Quantos pedágios tinham durante o percurso?");
        pedágios = teclado.nextDouble();
        System.out.printf("Qual o valor de cada pedágio?");
        valorped = teclado.nextDouble();
        
        total = (distância/consumo * valorcomb+pedágios * valorped);
        System.out.printf("Total de Gastos da viagem:"+total);
        
        
    }
}

