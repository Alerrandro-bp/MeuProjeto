package Arrays;

import java.util.Random;
import java.util.Scanner;
/*
Faça um algoritimo em que um usuário queria fazer um jogo na mega. Compare os numeros escolhidos do jogados
com a estrutura Random em Java e diga a mensagem, você ganhou o premio ! Parabéns
 */
public class MegaSena {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[][] matriz = new int[10][6];
        int numeroComeco = 1;
        System.out.println("Escolha os números da sorte !");

        for (int i = 0; i < 10; i++) { // Quantidade de Linhas !
            for (int j = 0; j < 6; j++) {//Quantidade de colunas !
                matriz[i][j] = numeroComeco;
                numeroComeco++;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int[] numerosUsuario = new int[6];
        int[] numerosSorteados = new int[6];
        Random r1 = new Random();

        //Escolhas do Usuário
        for (int i=0; i < 6; i++){
            int numeroEscolhidoPeloUsuario = s1.nextInt();
            if (numeroEscolhidoPeloUsuario >= 1 && numeroEscolhidoPeloUsuario <= 60){
                numerosUsuario[i] = numeroEscolhidoPeloUsuario;
            }
        }
        //Numeros Sorteados
        int contarNumero = 0;
        for (int i = 0; i < 6; i++){
            if (r1.nextInt(60) > 0 && r1.nextInt(60) <= 60 ){
                System.out.println(r1.nextInt(60));
            } else if (numerosSorteados == numerosUsuario) {
                contarNumero++;
                System.out.println("Você ganhou o premio. Parabéns !");
            }
        }
        s1.close();
    }
}
