package JavaSemestreUm;
import java.util.Scanner;
public class calculaImposto {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);

        //doubles
        double valorprod;
        double base1 = 1000 ;
        double base2 = 2000 ;
        double valis;
        double valordesc;
        double valordesc1;
        double valordesc2;
        double valordesc3;
        double imposto;
        
        //teclado
        System.out.println("Informe o valor do produto:");
        valorprod = teclado.nextDouble();
        
        //ifs
        
        if (valorprod<=base1){
            valordesc = base1 - valorprod;
            imposto = valordesc*0;
            System.out.println(+imposto);
        }
        if (valorprod>base1&&valorprod<base2){
            valordesc = valorprod - base1;
            imposto = valordesc *0.1;
            System.out.println(+imposto+"0");
        }//problema cálculo if
        if (valorprod>base2){
            valis = base2-base1;
            valordesc = valis*0.1;
            valordesc1 = valorprod - base1;
            valordesc2 = valordesc1 - base1;
            valordesc3 = valordesc2 *0.2;
            imposto = valordesc+valordesc3;
            System.out.println(+imposto+"0");
        }
    }
}

