package prog;
import java.util.Scanner;
public class lerSemRepeticao{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int[10];
        int i=0;
        
        numeros[i] = teclado.nextInt();
        if(numeros[0]==0){
            System.out.println("erro");
        }
        
        for(i = 1; i<10; i++){
            numeros[i]=teclado.nextInt();
            
            if(numeros[i]==0){
                i=9;
            }
            
        }
        System.out.println(numeros);
    }
}

