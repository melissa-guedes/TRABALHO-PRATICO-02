/*2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
Melissa Guedes e Laryssa Barbosa. */

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int i = 0;

        while(i < 10) {
            System.out.println("Digite um numero: ");
            int valor = scan.nextInt();
            numeros[i] = valor;
            soma += valor;

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }

            i++;
        }

        double media = soma / 10.0;

        System.out.println("\nSoma dos valores: " + soma);
        System.out.println("Media dos valores: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scan.close();
    }
}
