package JavaSemestreUm;
import java.util.Scanner;
public class horasPartida{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int horain�cio;
        int horafim;
        int dura��o;
        //jogo dura 24 horas
        
        System.out.println("Insira a hora que a partida iniciou:");
        horain�cio = teclado.nextInt();
        System.out.println("Insira a hora que a partida acabou:");
        horafim = teclado.nextInt();
        
        //calcular o tempo de dura��o da partida
        if (horain�cio==horafim) {
            dura��o = (horain�cio-horafim + 24); 
            System.out.println(+dura��o);
        }
        if (horain�cio>horafim&&horain�cio>=0&&horafim>=0){
            dura��o = (horafim-horain�cio+ 24);
            System.out.println(+dura��o);
        }    
        if (horain�cio<horafim&&horain�cio>=0&&horafim>=0){
            dura��o = (horafim-horain�cio);
            System.out.println(+dura��o);
        }
        if (horain�cio<0||horafim<0){
            System.out.println("-");
        }
        
        
        //exibir mensagem com a dura��o da partida em horas
        
        
    }
}

