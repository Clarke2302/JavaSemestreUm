package programas;
import java.util.Scanner;
public class classificaNumeros {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int num,par,�mpar,pos,negat;
        
        System.out.println("Insira o n�mero para ver a sua defini��o:");
        num = teclado.nextInt();
        
        par=0;
        �mpar=0;
        pos=0;
        negat=0;
        while(num!=0){
            if(num<0){
            negat++;    
            }
            if(num>0){
                pos++;
            }
            if(num%2==0){
            par++;    
            }else{
            �mpar++;    
            }

           num = teclado.nextInt();  
        }
        System.out.println(pos+" - "+negat+" - "+par+" - "+�mpar);
    }
}

