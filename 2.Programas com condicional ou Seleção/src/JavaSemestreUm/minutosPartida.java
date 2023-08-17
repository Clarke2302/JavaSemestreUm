package JavaSemestreUm;
import java.util.Scanner;
public class  minutosPartida {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int h1;
        int m1;
        int h2;
        int m2;
        int horat; 
        int minutost;
        
        System.out.println("Insira a hora de ínicio do jogo:");
        h1 = teclado.nextInt();
        System.out.println("Insira os minutos iniciais do jogo:");
        m1 = teclado.nextInt();
        System.out.println("Insira a hora final do jogo:");
        h2 = teclado.nextInt();
        System.out.println("Insira os minutos finais do jogo:");
        m2 = teclado.nextInt();
        //calcular o tempo de duração da partida
        
                horat = h2 - h1;
                minutost = m2 - m1;
   
            if(h1<0||h2<0||m1<0||m2<0){
            System.out.println("-");
            }else{
                if(horat <= 0 ){
                 horat += 24; 
                }if (minutost < 0){
                  horat -=1;
                  minutost += 60;
                  System.out.println( horat+":"+minutost);   
                }else{
                    if (minutost == 0){
                    System.out.println(horat + ":" + minutost+ 0);  
                     }
                }if (minutost > 0){
                   System.out.println(horat + ":" + minutost);  
           }
        }
    }
}

