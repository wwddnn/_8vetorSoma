import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros vai digitar ");
       int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valores " + vetor[i]);
            System.out.println();
        }
        System.out.println();
        //somar valores
        int soma = 0;
        for (int i = 0; i < vetor.length ; i++) {
            soma += vetor[i];
        }
        System.out.print("Soma "  + soma);

        System.out.println();
        //media
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            media = soma / vetor.length;
        }
        System.out.print("Media " + media);

    sc.close();
    }
}
