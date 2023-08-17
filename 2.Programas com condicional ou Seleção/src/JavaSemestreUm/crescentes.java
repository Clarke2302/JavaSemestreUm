package JavaSemestreUm;
import java.util.Scanner;
public class crescentes {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int pri;
        int seg;
        int ter;
        
        System.out.println("Informe o primeiro valor:");
        pri = teclado.nextInt();
        System.out.println("Informe o segundo valor:");
        seg = teclado.nextInt();
        System.out.println("Informe o terceiro valor:");
        ter = teclado.nextInt();

        // mostrar mensagem com valores em ordem crescente 
        
        if (pri>seg&&pri>ter&&seg>ter&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(ter+"\n" +seg+"\n" +pri  );
        }
        if (pri>seg&&ter>seg&&pri>ter&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(seg+"\n" +ter+"\n" +pri);
        }
        if (seg>pri&&pri>ter&&seg>ter&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(+ter+"\n" +pri+"\n"+seg);
        }
        if (seg>pri&&ter>pri&&seg>ter&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(pri+"\n" +ter+"\n"+seg);
        }
        if (ter>pri&&pri>seg&&ter>seg&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(seg+"\n"+pri+"\n"+ter); 
        }
        if (ter>pri&&seg>pri&&ter>seg&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(pri+"\n" +seg+ "\n"+ter);
        }
        if (pri==seg&&seg<=ter&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(pri+"\n"+seg+"\n"+ter);
        }
        if (pri<=seg&&seg==ter&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(pri+"\n"+seg+"\n"+ter);
        }
        if (pri<seg&&seg>ter&&pri!=0&&ter!=0&&seg!=0&&pri>0&&seg>0&&ter>0){
            System.out.println(pri+"\n"+ter+"\n"+seg);
        }
        if (pri<=0||seg<=0||ter<=0){
            System.out.printf("-");
        }
        
    }
}

