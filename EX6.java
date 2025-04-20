/*6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
Melissa Guedes e Laryssa Barbosa. */

public class EX6 {
    public static void main(String[] args) {

        // Definindo a matriz de String com 2 linhas e 3 colunas
        String[][] matriz = new String[2][3];

        // Atribuindo os valores à matriz
        matriz[0][0] = "Layssa";
        matriz[0][1] = "Hyago";
        matriz[0][2] = "Welligtom";

        matriz[1][0] = "Daniela";
        matriz[1][1] = "Leticia";
        matriz[1][2] = "Alex";

       
        System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
        System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);
    }
}
