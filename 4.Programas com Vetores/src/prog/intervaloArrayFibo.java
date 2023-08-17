package prog;
import java.util.Scanner;
public class intervaloArrayFibo{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int [] minhaArray = new int [30];
        
        minhaArray[0]= 0;
        minhaArray[1]= 1;
        //fibonacci entra no array
        for(int i=2;i<30;i++){
            minhaArray[i]=minhaArray[i-1]+minhaArray[i-2];
        }
        //intervalos
        int intervaloUm = teclado.nextInt();
        int intervaloDois = teclado.nextInt();
        
        int i=0;
        while(minhaArray[i]>=intervaloUm&&minhaArray[i]<=intervaloDois){
            System.out.print(minhaArray[i]+" ");
                if(intervaloUm>=i&&i>=intervaloDois){
                    //System.out.print("-"+" "+i+"-"+i);
                }else{
                    //System.out.print("erro");
                }
            i++;
        }
        
    }
}

