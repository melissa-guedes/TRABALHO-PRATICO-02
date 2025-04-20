/*3. Entrar via teclado com N valores quaisquer. O valor N (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos N valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente S ou N e encerrar o
programa em função dessa resposta.
Melissa Guedes e Laryssa Barbosa. */

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta;

        do {
            int N;

            System.out.println("Digite a quantidade de N (numero de valores):");
            N = scan.nextInt();

            while (N <= 0 || N >= 20) {
                System.out.println("Numero invalido, deve ser maior que 0 e menor que 20.");
                System.out.println("Digite o valor de N novamente:");
                N = scan.nextInt();
            }

            int[] numeros = new int[N];
            int soma = 0;
            int maior = 0;
            int menor = 0;
            int positivos = 0;
            int negativos = 0;
            int totalValidos = 0; 

            for (int i = 0; i < N; i++) {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                int valor = scan.nextInt();
                numeros[i] = valor;
                soma += valor;

                if (i == 0) {
                    maior = menor = valor;
                } else {
                    if (valor > maior) {
                        maior = valor;
                    }
                    if (valor < menor) {
                        menor = valor;
                    }
                }

                if (valor > 0) {
                    positivos++;
                    totalValidos++;  
                } else if (valor < 0) {
                    negativos++;
                    totalValidos++;  
                }
            }

       
            double PorCentPo = (totalValidos > 0) ? (positivos * 100.0) / totalValidos : 0;
            double PorCentNe = (totalValidos > 0) ? (negativos * 100.0) / totalValidos : 0;

            double media = soma / (double) N;

            System.out.println("\nRESULTADOS:");
            System.out.println("Soma dos valores: " + soma);
            System.out.printf("Média dos valores: %.2f\n", media);
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.printf("Porcentagem de positivos: %.2f%%\n", PorCentPo);
            System.out.printf("Porcentagem de negativos: %.2f%%\n", PorCentNe);

            // Perguntar se deseja rodar novamente
            System.out.print("\nDeseja executar novamente? (S/N): ");
            resposta = scan.next().toUpperCase();

        } while (resposta.equals("S"));

        System.out.println("\nPrograma encerrado. Ate logo!");
        scan.close();
    }
}
