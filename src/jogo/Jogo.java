package jogo;

public class Jogo {
    private Jogador[][] tabela;

    public Jogo() {
        tabela = new Jogador[3][3];
    }

    public int adicionarJogada(char referenciaJogador, int linha, int coluna){

        Jogador jogador;

        if(referenciaJogador == 'X' || referenciaJogador == 'O'){
            jogador = new Jogador(referenciaJogador);
        }else{
            System.out.println("jogador invalido");
            return 1;
        }

        if(linha > 2 || linha < 0 || coluna > 2 || coluna < 0 || (tabela[linha][coluna] != null)){
            System.out.println("Jogada invalida");
            return 1;
        }else{
            tabela[linha][coluna] = jogador;
            return 0;
        }
    }


    public Jogador verificaVencedor(){

        if(tabela[0][0] != null && tabela[0][1] != null && tabela[0][2] != null) {
            String possibilidade1 = tabela[0][0].toString() + tabela[0][1].toString() + tabela[0][2].toString();
            if (possibilidade1.equals("XXX") || possibilidade1.equals("OOO"))
                return tabela[0][0];
        }

        if(tabela[1][0] != null && tabela[1][1] != null && tabela[1][2] != null) {
            String possibilidade2 = tabela[1][0].toString() + tabela[1][1].toString() + tabela[1][2].toString();
            if (possibilidade2.equals("XXX") || possibilidade2.equals("OOO"))
                return tabela[1][0];
        }

        if(tabela[2][0] != null && tabela[2][1] != null && tabela[2][2] != null) {
            String possibilidade3 = tabela[2][0].toString() + tabela[2][1].toString() + tabela[2][2].toString();
            if (possibilidade3.equals("XXX") || possibilidade3.equals("OOO"))
                return tabela[2][0];
        }

        if(tabela[0][0] != null && tabela[1][0] != null && tabela[2][0] != null) {
            String possibilidade4 = tabela[0][0].toString() + tabela[1][0].toString() + tabela[2][0].toString();
            if (possibilidade4.equals("XXX") || possibilidade4.equals("OOO"))
                return tabela[0][0];
        }

        if(tabela[0][1] != null && tabela[1][1] != null && tabela[2][1] != null) {
            String possibilidade5 = tabela[0][1].toString() + tabela[1][1].toString() + tabela[2][1].toString();
            if (possibilidade5.equals("XXX") || possibilidade5.equals("OOO"))
                return tabela[0][1];
        }

        if(tabela[0][2] != null && tabela[1][2] != null && tabela[2][2] != null) {
            String possibilidade6 = tabela[0][2].toString() + tabela[1][2].toString() + tabela[2][2].toString();
            if (possibilidade6.equals("XXX") || possibilidade6.equals("OOO"))
                return tabela[0][2];
        }

        if(tabela[0][0] != null && tabela[1][1] != null && tabela[2][2] != null) {
            String possibilidade7 = tabela[0][0].toString() + tabela[1][1].toString() + tabela[2][2].toString();
            if (possibilidade7.equals("XXX") || possibilidade7.equals("OOO"))
                return tabela[0][0];
        }

        if(tabela[0][2] != null && tabela[1][1] != null && tabela[2][0] != null) {
            String possibilidade8 = tabela[0][2].toString() + tabela[1][1].toString() + tabela[2][0].toString();
            if (possibilidade8.equals("XXX") || possibilidade8.equals("OOO"))
                return tabela[0][2];
        }

        return null;
    }

    public void mostrarTabela() {
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                if(tabela[i][j] != null){
                    System.out.print(tabela[i][j] + "    ");
                }else{
                    System.out.print((i+1) + "." + (j+1) + "  ");
                }
            }
            System.out.println();
        }
    }
}
