package programas;
import java.util.Scanner;
public class fibo {
    public static void main (String[]args){
        
        int n1 = 0;
        int n2 = 1;
        int n,c;
        c = 0;
        while(c<18){
            System.out.printf(n1+"\n");
            n=n1+n2;
            n1=n2;
            n2=n;
            c++;
        }
    }
}

