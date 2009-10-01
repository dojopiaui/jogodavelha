package jogodavelha;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;

public class JogoDaVelha {
  private char[][] tabuleiro;

  public JogoDaVelha() {
    tabuleiro = new char[3][3];
    preencheTudo(' ');

  }

  public void preencheTudo(char elemento) {
    for (int i = 0; i < tabuleiro.length; i++) {
      Arrays.fill(tabuleiro[i], elemento);
    }
  }

  public char[][] getTabuleiro() {
    return tabuleiro;
  }

  public void preenchePosicao(int x, int y, char elemento) {
    if(x<0 || x>2 || y<0 || y>2){
      throw new IllegalArgumentException("posição invalida");
    }
    if (testeElementoValido(elemento)){
      if (obterPosicao(x, y) == ' ') {
        tabuleiro[x][y] = elemento;
      }
      else
      {
        throw new IllegalArgumentException("Posicao ja preenchida");
      }
    }
    else{
      throw new IllegalArgumentException("Valor invalido");
    }

  }

  public char obterPosicao(int x, int y) {
    return tabuleiro[x][y];
  }

  private boolean testeElementoValido(char elemento) {
    return elemento=='O'||elemento=='X';
  }

  public boolean checaTabuleiroCheio() {
    for (int i = 0; i < getTabuleiro().length; i++) {
      for (int j = 0; j < getTabuleiro()[i].length; j++) {
        if (getTabuleiro()[i][j] == ' ') {
          return false;
        }
      }
    }
    return true;
  }
}
