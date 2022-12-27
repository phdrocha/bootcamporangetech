/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class ex7_OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {-5, -6, 15, 50, 8, 4};

        //System.out.println(vetor.length);

        System.out.println("Vetor posição normal:");
        for ( int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + " ");
        }
        System.out.println("--------------------------------------------");
        
        System.out.println("Vetor invertido:");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i]+ " ");
        }
        
    }
}
