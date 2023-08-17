package prog;
import java.util.Scanner;
public class lerMaiorOcorrencia {
    public static void main (String[]args){
        Scanner tec = new Scanner (System.in);
        
        int [] numeros = new int [10];

        for(int i=0; i<10; i++){
             numeros[i] = tec.nextInt();  
            if(numeros[i]==0){
            i=10;
            }
        }
        int numRepete = numeros[0] ;
        int vezesRepete = 0;
        for(int i=1; i<10; i++){
            if(numeros[i]==numRepete){
                numRepete=numeros[i];
                vezesRepete++;
            }else if(numeros[i]==numeros[i+1]){
                numRepete=numeros[i];
                vezesRepete++;
            }else if(numRepete==0&&vezesRepete==0){
                System.out.println("0");
            }
        }
        System.out.println(numRepete+vezesRepete);
        
    }
}

