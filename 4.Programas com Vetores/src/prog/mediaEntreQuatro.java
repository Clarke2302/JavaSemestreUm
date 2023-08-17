package prog;
import java.util.Scanner;
public class mediaEntreQuatro{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in); 
        double [] minhaArray = new double [5]; //5 elementos;
        double n1,n2,n3,n4,média;
        System.out.println("Informe o primeiro valor:");
        n1=teclado.nextDouble();
        minhaArray[0] = n1;
        System.out.println("Informe o segundo valor:");
        n2=teclado.nextDouble();
        minhaArray[1] = n2;
        System.out.println("Informe o terceiro valor:");
        n3=teclado.nextDouble();
        minhaArray[2] = n3;
        System.out.println("Informe o quarto valor:");
        n4=teclado.nextDouble();
        minhaArray[3] = n4;
        
        média=(minhaArray[0]+minhaArray[1]+minhaArray[2]+minhaArray[3])/4;
        minhaArray[4]= média;
        
        System.out.println("A média aritmética dos valores inseridos é:"+minhaArray[4]);
            
            
            
        
    }
}

