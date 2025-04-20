/*5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
Melissa Guedes e Laryssa Barbosa. */

public class EX5 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][2]; 

        matriz[0][0] = 1;
        matriz[0][1] = 19;

        matriz[1][0] = 26;
        matriz[1][1] = 11;

        matriz[2][0] = 44;
        matriz[2][1] = 99;

        System.out.println("Matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
