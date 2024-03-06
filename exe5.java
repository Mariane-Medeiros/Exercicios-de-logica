
/* Escreva um programa que inverta os caracteres de um string. */
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva uma frase");
        String frase = scan.nextLine();
        int tam = frase.length() - 1;

        inverteString(frase, tam);
    }

    public static void inverteString(String frase, int tam) {
        int contador = 0;
        char[] inversa = new char[tam + 1];
        char[] frase_convertida = frase.toCharArray();

        for (int i = tam; i >= 0; i--) {
            inversa[contador] = frase_convertida[i];
            contador++;
        }

        for (int i = 0; i < inversa.length; i++) {
            System.out.printf("%c", inversa[i]);
        }
    }
}