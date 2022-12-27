import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class ex8_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        String letra;
        int aux = 0;

        do{
            System.out.println("Digite uma letra: ");
            letra = scan.next();
            
            if( !(letra.equalsIgnoreCase("a")|
                  letra.equalsIgnoreCase("e")|
                  letra.equalsIgnoreCase("i")|
                  letra.equalsIgnoreCase("o")|
                  letra.equalsIgnoreCase("u"))){
                consoantes[aux] = letra;
                quantidadeConsoantes++;
            }
            aux++;
        } while (aux < consoantes.length);
        
        System.out.println("-----------------------------------------");
        System.out.println("Consoantes : ");
        
        for (String string : consoantes) {
            if ( string != null){
                System.out.println(string);
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("Quantidade de consoantes : "+ quantidadeConsoantes);
        System.out.println("-----------------------------------------");
    }
    
}
