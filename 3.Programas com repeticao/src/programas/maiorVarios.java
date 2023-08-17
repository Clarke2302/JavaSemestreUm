package programas;
import java.util.Scanner;
public class maiorVarios{
    public static void main(String[]args){
        
        Scanner teclado =  new Scanner(System.in);
        int A, B, num, resto, maior;
        
            System.out.println("Informe um valor inteiro:");
            num = teclado.nextInt();
            maior=num;
    
        while(num!=0){
            num = teclado.nextInt();
            
        if(num>maior && num!=0){
            maior = num;
 
        }
        
    }
    if(maior!=0){
     System.out.println(+maior);   
    }else{
     System.out.println("erro");    
    }
    
 }
}

