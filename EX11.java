/*11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
Melissa Guedes e Laryssa Barbosa. */

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ordem;

        do {
            System.out.print("Digite a ordem da matriz quadrada (1 a 10): ");
            ordem = scan.nextInt();
        } while (ordem <= 0 || ordem > 10);

        double[][] matriz = new double[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextDouble();
            }
        }

        double determinante = calcularDeterminante(matriz);

        System.out.println("\nDeterminante da matriz: " + determinante);

        scan.close();
    }

    public static double calcularDeterminante(double[][] matriz) {
        int n = matriz.length;

        if (n == 1) {
            return matriz[0][0];
        }

        if (n == 2) {
            return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        }

        double determinante = 0;

        for (int j = 0; j < n; j++) {
            double[][] submatriz = gerarSubmatriz(matriz, 0, j);
            determinante += Math.pow(-1, j) * matriz[0][j] * calcularDeterminante(submatriz);
        }

        return determinante;
    }

    public static double[][] gerarSubmatriz(double[][] matriz, int linhaIgnorada, int colunaIgnorada) {
        int n = matriz.length;
        double[][] submatriz = new double[n - 1][n - 1];
        int linhaDestino = 0;

        for (int i = 0; i < n; i++) {
            if (i == linhaIgnorada) continue;

            int colunaDestino = 0;
            for (int j = 0; j < n; j++) {
                if (j == colunaIgnorada) continue;

                submatriz[linhaDestino][colunaDestino] = matriz[i][j];
                colunaDestino++;
            }
            linhaDestino++;
        }

        return submatriz;
    }
}