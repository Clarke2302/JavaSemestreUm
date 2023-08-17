package JavaSemestreUm;
import java.util.Scanner;
public class retasTriangulo{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        int seg1;
        int seg2;
        int seg3;
        
        System.out.println("Insira o valor 1:");
        seg1 = teclado.nextInt();
        System.out.println("Insira o valor 2:");
        seg2 = teclado.nextInt();
        System.out.println("Insira o valor 3:");
        seg3 = teclado.nextInt();
        

        if(seg1+seg2>seg3&&seg1+seg3>seg2&&seg2+seg3>seg1&&seg3!=0&&seg2!=0&&seg3!=0&&seg1>0&&seg2>0&&seg3>0){
            System.out.println("sim");
        }else{
            System.out.println("não");
        }
        
        if(seg1==0||seg2==0||seg3==0||seg1<0||seg2<0||seg3<0){
            System.out.println("inválido");
        }
        
 //if(seg1+seg2>=seg3&&seg1+seg3<=seg2||seg2+seg3<seg1&&seg1!=0&&seg2!=0&&seg3!=0&&seg1>0&&seg2>0&&seg3>0) {
            //System.out.println("não");
        
    }
}
