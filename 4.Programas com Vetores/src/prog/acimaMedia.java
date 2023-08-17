package prog;
import java.util.Scanner;
public class acimaMedia{
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos:");
        int totalAlunos = tec.nextInt();
        double [] notas = new double [totalAlunos];
        int alunosAcima=0;
        
        //pegar notas
        for(int i = 0; i<totalAlunos; i++){
            notas[i] = tec.nextDouble();
        }
        //fazer a soma das notas
        double soma=0;
        for(int i = 0; i<totalAlunos; i++){
            soma +=notas[i];
        }
        //fazer a media das notas e ver alunos acima da media
        for(int i = 0; i<totalAlunos; i++){
            double media = soma/totalAlunos;
            
                if(notas[i]>media){
                    alunosAcima++;
                }
        }
        //fazendo percentual de alunos acima da média
        
        double percentual = (alunosAcima*100)/totalAlunos;
    
        System.out.println(percentual+"%");
    }
} 

