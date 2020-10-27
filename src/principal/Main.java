package principal;

import jogo.Jogador;
import jogo.Jogo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Jogo jogo = new Jogo();
        Jogador jogador = new Jogador('X');

        int linha = 1, coluna = 1, checandoValidadeJogada = 0;

        while(jogo.verificaVencedor() == null){

            jogo.mostrarTabela();
            System.out.println("---------------------------------------");
            System.out.println("Rodada Jogador " + jogador);
            System.out.println("---------------------------------------");

            System.out.println("Digite a linha e a coluna na tabela(Exemplo: 1 2) :");
            linha = garantirInteiro(ler);
            coluna = garantirInteiro(ler);

            System.out.println("---------------------------------------");

            checandoValidadeJogada = jogo.adicionarJogada(jogador.getReferencia(), linha - 1, coluna - 1);

            if(checandoValidadeJogada == 0){
                if(jogador.getReferencia() == 'X')
                    jogador.setReferencia('O');
                else {
                    jogador.setReferencia('X');
                }
            }

            for (int i = 0; i < 2; i++) {
                System.out.println();
            }
        }

        jogo.mostrarTabela();
        System.out.println("Vencedor Jogador " + jogo.verificaVencedor());
        ler.close();
    }

    public static int garantirInteiro(Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.println("Digite um numero:");
            scanner.nextLine();
        }
        int numero = scanner.nextInt();
        return numero;
    }
}
