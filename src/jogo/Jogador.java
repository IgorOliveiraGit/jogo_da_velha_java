package jogo;


public class Jogador{
    private char referencia;

    public Jogador(char referencia) {
        if(referencia == 'X' || referencia == 'O' ){
            this.referencia = referencia;
        }else{
            this.referencia = 'X';
        }
    }

    public char getReferencia() {
        return referencia;
    }

    public void setReferencia(char referencia) {
        if(referencia == 'X' || referencia == 'O' ){
            this.referencia = referencia;
        }
    }

    @Override
    public String toString() {
        if(referencia == 'O') {
            return "O";
        }else{
            return "X";
        }
    }
}
