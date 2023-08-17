package JavaSemestreUm;
import java.util.Scanner;
public class impostoRenda {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        double faixa1 = 1000;
        double faixa2 = 2000;
        double faixa3 = 3000;
        double faixa4 = 4000;
        double faixa5 = 5000;
        double salário;
        double vp1;
        double vp2;
        double vp3;
        double vp4;
        double vp5;
        double imposto;
        double saldesc;
        double saldesc1;
        double saldesc2;
        double saldesc3;
        double saldesc4;
        double saldesc5;
        double valis;
        
        
        System.out.println("Qual é o salário?");
        salário = teclado.nextDouble();
    
        
        if (salário<=faixa1&&salário>=0){
            saldesc=faixa1-salário;
            imposto=saldesc*0;
            System.out.println(+imposto+"0");
        }
        if (salário>faixa1&&salário<=faixa2){
            saldesc=salário-faixa1;
            imposto=saldesc*0.1;
            
            System.out.println(+imposto+"0");
        }
        if (salário>faixa2&&salário<=faixa3){
            valis = (faixa2-faixa1);
            vp1 = (valis * 0.1);
            saldesc1 = salário-faixa1;
            saldesc2 = saldesc1-faixa1;
            vp2 = saldesc2*0.2;
            imposto = (vp1+vp2);
            
            System.out.println(+imposto+"0");
        }
        if (salário>faixa3&&salário<=faixa4){
            valis = (faixa2-faixa1);
            vp1 = (valis * 0.1);
            saldesc1 = salário-faixa1;
            saldesc2 = saldesc1-faixa1;
            saldesc3 = saldesc2-faixa1;
            vp2 = valis*0.2; 
            vp3 = saldesc3*0.3;
            imposto=(vp1+vp2+vp3);
            
            System.out.println(imposto+"0");

        }
        if (salário>faixa4&&salário<=faixa5){
            valis = (faixa2-faixa1);
            vp1 = (valis * 0.1);
            saldesc1 = salário-faixa1;
            saldesc2 = saldesc1-faixa1;
            saldesc3 = saldesc2-faixa1;
            saldesc4 = saldesc3-faixa1;
            vp2 = valis*0.2;
            vp3 = valis*0.3;
            vp4 = saldesc4*0.4;
            imposto = (vp1+vp2+vp3+vp4);
            
            System.out.println(imposto+"0");
        }
        if (salário>faixa5){
            valis = (faixa2-faixa1);
            vp1 = (valis * 0.1);
            saldesc1 = salário-faixa1;
            saldesc2 = saldesc1-faixa1;
            saldesc3 = saldesc2-faixa1;
            saldesc4 = saldesc3-faixa1;
            saldesc5 = saldesc4-faixa1;
            vp2 = valis*0.2;
            vp3 = valis*0.3;
            vp4 = valis*0.4;
            vp5 = saldesc5*0.5;
            imposto = (vp1+vp2+vp3+vp4+vp5);
            
            System.out.println(imposto+"0");
        }
    }
}

