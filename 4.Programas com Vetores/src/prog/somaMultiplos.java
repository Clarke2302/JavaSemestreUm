package prog;
import java.util.Scanner;
public class somaMultiplos{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        int [] minhaArray = new int [10];
        int menor = 0;
        int soma=0;
        
        for (int i=0; i<10; i++){
            minhaArray[i] = teclado.nextInt();
        }
        
        menor = minhaArray[0];
        for (int i=0; i<10; i++){
            if(minhaArray[i]<menor){
                   menor = minhaArray[i];
           }
        }
        
        for (int i=0; i<10; i++){
           minhaArray[i]*=menor;
        }
        
        //System.out.println("O menor no momento é "+menor);
        //substituir
        soma = 0;
        for (int i=0; i<10; i++){
            soma+= minhaArray[i];
        }
        
        System.out.println(soma);
    }
} 


/*
        for (int i=0; i<10; i++){
            minhaArray[i] = teclado.nextInt();
            if(i==0){
                menor = minhaArray[0];
            }else{
                if(minhaArray[i]<menor){
                    menor = minhaArray[i];
                }
            }
        }
        //System.out.println("O menor no momento é "+menor);
        //substituir
        for (int i=0; i<10; i++){
            int multi= minhaArray[i]*menor;
            soma += multi; 
        }
        System.out.println(soma);



for (int i=0; i<10; i++){
            int num = teclado.nextInt();
            minhaArray[i] = num;
            
            if(i==1 && minhaArray[1]<minhaArray[0]){
                menor = minhaArray[1];
                System.out.println(menor);
            }else{
                menor = minhaArray[0];
            }
            if(i>=2 && menor>minhaArray[i]&&minhaArray[i]<minhaArray[i-1]){
                menor = minhaArray[i];
            }
        }
        System.out.println("O menor no momento é "+menor);
        //substituir
        for (int i=0; i<10; i++){
            int multi= minhaArray[i]*menor;
            soma += multi; 
        }
        System.out.println(soma);
        
        */
