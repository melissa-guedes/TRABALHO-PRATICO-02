/*10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
Melissa Guedes e Laryssa Barbosa. */

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ordem;

        do {
            System.out.print("Digite a ordem da matriz quadrada (1 a 10): ");
            ordem = scan.nextInt();
        } while (ordem <= 0 || ordem > 10);

        double[][] matriz = new double[ordem][ordem];
        double[][] identidade = new double[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextDouble();
            }
            identidade[i][i] = 1;
        }

        boolean temInversa = gaussJordan(matriz, identidade, ordem);

        if (temInversa) {
            System.out.println("\nMatriz Inversa:");
            imprimirMatriz(identidade);
        } else {
            System.out.println("A matriz não possui inversa (divisão por zero detectada).");
        }

        scan.close();
    }

    public static boolean gaussJordan(double[][] matriz, double[][] identidade, int ordem) {
        for (int i = 0; i < ordem; i++) {
            double pivo = matriz[i][i];
            if (pivo == 0) return false;
            
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] /= pivo;
                identidade[i][j] /= pivo;
            }

            for (int k = 0; k < ordem; k++) {
                if (k != i) {
                    double fator = matriz[k][i];
                    for (int j = 0; j < ordem; j++) {
                        matriz[k][j] -= fator * matriz[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }
        return true;
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double val : linha) {
                System.out.printf("%.3f\t", val);
            }
            System.out.println();
        }
    }
}