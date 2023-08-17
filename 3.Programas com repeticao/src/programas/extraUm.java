package programas;
import java.util.Scanner;
public class extraUm{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int i=0;
        int Limite = 10; 
        while(Limite>0){
        i=0;
        while(i<Limite){
        System.out.print(i);
        i++;
        }
        System.out.println();
        Limite--;
    }
       
 }
}

// Limite = 10; 
//while(Limite>0){
//i=0;
//while(i<Limite){
//System.out.print(i);
//i++;
//}
//println();
//Limite--;
//}

