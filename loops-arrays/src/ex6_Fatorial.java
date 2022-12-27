import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial = 1;
        int numero;

        System.out.println("Digite o número que você deseja saber seu fatorial : ");
        numero = scan.nextInt();

        for ( int i = numero; i >=1 ; i--){
            fatorial = fatorial*i;
        }
       

        String frase = String.valueOf(numero)+" x "+String.valueOf(numero-1);

        for ( int i = (numero-2); i>=1 ; i--){
            
            frase = frase +" x "+ String.valueOf(i);
            
        }
        System.out.println(numero+"! = " + " ( "+ frase+" ) = " + fatorial);
    }
}
