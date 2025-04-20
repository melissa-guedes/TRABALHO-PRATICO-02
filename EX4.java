/*4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
Melissa Guedes e Laryssa Barbosa. */

public class EX4{
public static void main(String[] args){
 
int[][] matriz = new int[2][3]; 
 matriz[0][0]=  10;
 matriz[0][1] = 20;
 matriz[0][2] = 30;

 matriz [1][0] = 15;
 matriz[1][1] = 23;
matriz[1][2]= 19;

 System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
 System.out.println(matriz[1][0] + " " +matriz[1][1] + " " + matriz[1][2]);

}

 }