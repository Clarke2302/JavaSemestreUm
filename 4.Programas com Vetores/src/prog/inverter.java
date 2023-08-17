package prog;
import java.util.Scanner;
public class inverter {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int [] minhaArray = new int [5];
        
        //le 20 e armazena na array
        int t=5;
        for (int i=0; i<t; i++){
            minhaArray[i] = teclado.nextInt();
        }
        //troca 0--> 5  1-->4  2-->3
        for (int i=0; i<t; i++){
            for(int j=5; j>2; j--){
                    
                    minhaArray[i]=minhaArray[j-1];
                    minhaArray[j-1]=minhaArray[i];
                
                
                
            }
            
        }
        System.out.println(minhaArray+"\n");
    }
}

 /*for (int i=0; i<t; i++){
            int a = minhaArray[i];
            minhaArray[i] = t - 1 - i;
            
            for(j=5; j>2; j--){
                
                if(i==0){
                    
                }*/

