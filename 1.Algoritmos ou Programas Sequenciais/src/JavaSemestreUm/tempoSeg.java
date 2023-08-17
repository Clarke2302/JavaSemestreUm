package JavaSemestreUm;
import java.util.Scanner;
public class tempoSeg {
    public static void main(String[]args){
        
        Scanner teclado= new Scanner (System.in);
        double horas, minutos, segundos, segtrans;
        
        System.out.printf ("Valor em Horas:");
        horas = teclado.nextDouble();
        
        System.out.printf("Valor em Minutos:");
        minutos = teclado.nextDouble();
        
        System.out.printf("Valor em Segundos:");
        segundos = teclado.nextDouble();
        
        segtrans = (horas*3600) + (minutos*60) + segundos;
        System.out.printf("Quantos segundos foram transcorridos nesse dia? %.0f\n",+segtrans);
    }
}
