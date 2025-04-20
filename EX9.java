/*9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
Melissa Guedes e Laryssa Barbosa. */

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m, n;

        do {
            System.out.print("Digite o número de linhas (máximo 10): ");
            m = scan.nextInt();
        } while (m <= 0 || m > 10);

        do {
            System.out.print("Digite o número de colunas (máximo 10): ");
            n = scan.nextInt();
        } while (n <= 0 || n > 10);

        double[][] matriz = new double[m][n];
        double[][] transposta = new double[n][m];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextDouble();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
