package programas;
import java.util.Scanner;
public class crescerArvores{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int velocA, velocB, A, B, ultrap, anos, cresc;
        
        System.out.println("Insira a altura da primeira �rvore");
        A = teclado.nextInt();

        System.out.println("Insira o valor de crescimento da primeira �rvore");
        velocA = teclado.nextInt();
        
        System.out.println("Insira a altura da segunda �rvore");
        B = teclado.nextInt();

        System.out.println("Insira o valor de crescimento da segunda �rvore");
        velocB = teclado.nextInt();
        
        anos = 0;
        if (A<B&&velocA>velocB||velocA<velocB&&A>B||A==B){
               while(A<B){
                   A = A+velocA;
                   B = B+velocB;
                   anos++;
                }
               } 
               if(velocA<velocB&&A>B||B>A&&velocA>velocB||A==B){
               System.out.println(+anos);
             
           }else{
                System.out.println("nunca");
      }
    }
 }

