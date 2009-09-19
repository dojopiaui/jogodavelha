package jogodavelha;

import java.util.Arrays;
 
public class JogoDaVelha {
  private char[][] tabuleiro;
  
  public JogoDaVelha() {
    tabuleiro = new char[3][3];
    for (int i=0; i < tabuleiro.length; i++) {
      Arrays.fill(tabuleiro[i], ' ');
    }
  }
  
  public char[][] getTabuleiro(){
    return tabuleiro;
  } 

  public void preenchePosicao(int x,int y,char v){
    tabuleiro[x][y] = v;
  }
  public char obterPosicao(int x,int y){
    return tabuleiro[x][y];
  }
}
