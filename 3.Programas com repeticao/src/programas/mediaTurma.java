package programas;
import java.util.Scanner;
public class mediaTurma{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int alunos, loop;
        double nota, conta , m�dia;
        
        System.out.println("Quantos alunos tem em classe?");
        alunos = teclado.nextInt(); 
        
        loop = 0;
        conta = 0;
        
        while(loop<alunos){
           System.out.println("Digite a nota:");
           nota = teclado.nextDouble();
           //System.out.println("a nota nesse momento est� valendo "+nota);
           conta+=nota;
           
           loop++;
           
           
           if(loop==alunos){
               //System.out.println("Calculando a m�dia de "+nota);
               m�dia = conta/alunos;
               System.out.println(+m�dia);
           }
            
        }

    }
}

