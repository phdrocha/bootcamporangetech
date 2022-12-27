import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int tabuada;
        System.out.println("Digite o número que vc deseja saber a tabuada : ");
        tabuada = scan.nextInt();
        System.out.println("-----------------------------------------------------");
        System.out.println("Tabuada do número: " + tabuada);

        for(int i=0; i<= 10; i++ ){
            System.out.println( tabuada + " x "+ i + " = " + (tabuada*i));
        }
    }
    
}
