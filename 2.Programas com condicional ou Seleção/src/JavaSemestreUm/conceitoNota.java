package JavaSemestreUm;
import java.util.Scanner;

public class conceitoNota {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, média1, média2, média3, médiaf, peso1, peso2, peso3;


        System.out.println("Informe a primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = teclado.nextDouble();
        System.out.println("Informe a terceira nota:");
        nota3 = teclado.nextDouble();
        
        peso1=1;
        peso2=2; 
        peso3=3;
      
  
        média1 = (nota1 * peso1);
        média2 = (nota2 * peso2);
        média3 = (nota3 * peso3);
        médiaf = (média1+média2+média3)/6;

        if (médiaf<4){
        System.out.println(médiaf+"\n"+ "Reprovado");   
        }else if (médiaf>=4&&médiaf<7){
            System.out.println(médiaf+"\n"+ "Em Exame");
        }else if (médiaf>=7){
            System.out.println(médiaf+"\n"+ "Aprovado");
        }
    }
}

