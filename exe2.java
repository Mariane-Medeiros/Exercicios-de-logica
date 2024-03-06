/*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */
import java.util.Scanner;
public class exe2{
    public static void main(String[] args) {
        int num, a, b;
        Boolean numero_pertence=false;
        a=0;
        b=1;


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = scan.nextInt();


        for(int i=0; i<20; i++){
            int temp;
            temp = a + b;
            if(temp == num){
                numero_pertence=true;
                break;
            }
            a = b;
            b = temp;
        }

        if(numero_pertence){
            System.out.printf("O numero informado %d pertence a sequencia!", num);
        }else{
            System.out.printf("O numero informado %d não pertence a sequencia!", num);
        }
    }
}