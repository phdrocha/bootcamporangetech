import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int quantidade;
        int pares = 0;
        int impares = 0 ;
        int aux = 0;
        int num = 0;

        System.out.println("Digite a quantidade de números que você deseja digitar : ");
        quantidade = scan.nextInt();

        do{
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            if (num%2 != 0){
                impares++;
            }
            else{
                pares++;
            }
            
        aux++;
        
        } while(aux < quantidade);

        System.out.println("Quantidade de números pares = " + pares);
        System.out.println("Quantidade de números impares = " + impares);

    }
}
