import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class ex9_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero; 

        }

        System.out.println("Números aleatórios:");
        for (int i : numerosAleatorios) {
            System.out.println(i);
        }            
        System.out.println("-----------------------------------------------------");

        System.out.println("Antecessores:");
        for (int i : numerosAleatorios) {
            System.out.println(i-1);
        }            
        System.out.println("-----------------------------------------------------");

        System.out.println("Sucessores :");
        for (int i : numerosAleatorios) {
            System.out.println(i+1);
        }            
        System.out.println("-----------------------------------------------------");
    }
    
}
