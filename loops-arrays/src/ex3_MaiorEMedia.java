/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int aux = 0;
        int soma = 0;
        int maior = 0;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            aux++;
            if ( maior < numero){
                maior = numero;
            }
            soma = soma + numero;

        } while(aux < 5);

        System.out.println("O maior número é = " + maior );
        System.out.println("A média entre os números é = "+ (soma/5));
           

    }
}
