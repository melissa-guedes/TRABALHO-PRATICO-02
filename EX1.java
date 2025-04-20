/*1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.
Melissa Guedes e Laryssa Barbosa. */

import java.util.Scanner;

public class EX1 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v1, v2;

        System.out.println("Digite o primeiro valor:");
        v1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        v2 = scan.nextInt();

        
        while (v2 <= v1) {
            System.out.println("Erro: o segundo valor deve ser maior que o primeiro.");
            System.out.println("Digite o segundo valor novamente:");
            v2 = scan.nextInt();
        }

                System.out.println("Valores aceitos: " + v1 + " e " + v2);

        scan.close();    
 }
}
