package prog;
import java.util.Scanner;
public class fiboArray{
    public static void main (String[]args){
        Scanner tec = new Scanner(System.in);
        
        int [] minhaArray = new int [2];
        
        minhaArray[0]=0;
        minhaArray[1]=1;
        
        int i=0;
        int fibo=0;
        while(i<10){
            System.out.print(fibo+" ");  
            fibo = minhaArray[0]+minhaArray[1];
            minhaArray[1]=minhaArray[0];
            minhaArray[0]=fibo;
            i++;
        }
 
    }
}

