/*8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.
Melissa Guedes e Laryssa Barbosa. */

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matriz = new double[3][4];
        double[][] matriz_multi = new double[3][4];

        System.out.println("Digite 12 valores para a matriz 3x4: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                matriz[i][j] = scan.nextDouble();

        System.out.println("Digite a constante multiplicativa: ");
        double constante = scan.nextDouble();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                matriz_multi[i][j] = matriz[i][j] * constante;

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
}

        System.out.println("Matriz multiplicada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz_multi[i][j] + "\t");
            }
            System.out.println();
        }

    }
}