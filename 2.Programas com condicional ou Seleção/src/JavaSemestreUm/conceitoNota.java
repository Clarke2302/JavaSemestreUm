package JavaSemestreUm;
import java.util.Scanner;

public class conceitoNota {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, m�dia1, m�dia2, m�dia3, m�diaf, peso1, peso2, peso3;


        System.out.println("Informe a primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = teclado.nextDouble();
        System.out.println("Informe a terceira nota:");
        nota3 = teclado.nextDouble();
        
        peso1=1;
        peso2=2; 
        peso3=3;
      
  
        m�dia1 = (nota1 * peso1);
        m�dia2 = (nota2 * peso2);
        m�dia3 = (nota3 * peso3);
        m�diaf = (m�dia1+m�dia2+m�dia3)/6;

        if (m�diaf<4){
        System.out.println(m�diaf+"\n"+ "Reprovado");   
        }else if (m�diaf>=4&&m�diaf<7){
            System.out.println(m�diaf+"\n"+ "Em Exame");
        }else if (m�diaf>=7){
            System.out.println(m�diaf+"\n"+ "Aprovado");
        }
    }
}

