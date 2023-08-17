package JavaSemestreUm;
import java.util.Scanner;
public class horasPartida{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int horainício;
        int horafim;
        int duração;
        //jogo dura 24 horas
        
        System.out.println("Insira a hora que a partida iniciou:");
        horainício = teclado.nextInt();
        System.out.println("Insira a hora que a partida acabou:");
        horafim = teclado.nextInt();
        
        //calcular o tempo de duração da partida
        if (horainício==horafim) {
            duração = (horainício-horafim + 24); 
            System.out.println(+duração);
        }
        if (horainício>horafim&&horainício>=0&&horafim>=0){
            duração = (horafim-horainício+ 24);
            System.out.println(+duração);
        }    
        if (horainício<horafim&&horainício>=0&&horafim>=0){
            duração = (horafim-horainício);
            System.out.println(+duração);
        }
        if (horainício<0||horafim<0){
            System.out.println("-");
        }
        
        
        //exibir mensagem com a duração da partida em horas
        
        
    }
}

