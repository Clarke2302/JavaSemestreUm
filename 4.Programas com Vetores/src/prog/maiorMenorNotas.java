package prog;
import java.util.Scanner;
public class  maiorMenorNotas{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        double[] minhaArray = new double[11];
        double maior, menor;
        int posMaior,posMenor, i;
        //posição menor, nota menor, posição maior, nota maior 
        
            
            for(i=1;i<11;i++){
            minhaArray[i]=teclado.nextDouble();
            }
            
            maior=minhaArray[1];
            menor=minhaArray[1];
            posMenor=i;
            posMaior=i;
            
            for(i=2;i<11;i++){
                if(minhaArray[i]<menor){
                    menor=minhaArray[i];
                    posMenor=i;
                    
                }else if(minhaArray[i]>maior){
                    maior=minhaArray[i];
                    posMaior=i;
                }
            }
            
            System.out.println(posMenor+" "+menor+" "+posMaior+" "+maior);
    }
 }


