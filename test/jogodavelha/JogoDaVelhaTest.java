package jogodavelha;
import org.junit.*;

import static junit.framework.Assert.*;

public class JogoDaVelhaTest {
  JogoDaVelha jogo;
  @Before
  public void inicializa(){
    jogo = new JogoDaVelha();
  }

  @Test
  public void testaTamanho() {
    assertEquals( 3, jogo.getTabuleiro().length);
    for (int i = 0; i < jogo.getTabuleiro().length; i++){
      assertEquals(3, jogo.getTabuleiro()[i].length);
    }
  }


  @Test
  public void testaInicializacao(){
    for (int i = 0; i < jogo.getTabuleiro().length; i++) {
      for (int j = 0; j < jogo.getTabuleiro()[i].length; j++) {
        assertEquals(' ', jogo.getTabuleiro()[i][j]);
      }
    }
  }

  @Test
  public void testePreenchimentoPosicao() {
    jogo.preenchePosicao(1, 1, 'O');
    assertEquals('O', jogo.obterPosicao(1, 1));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testElementoValido (){
    jogo.preenchePosicao(1, 1, 'f');
  }

  @Test(expected = IllegalArgumentException.class)
  public void testPosicaoJaPreenchida (){
    jogo.preenchePosicao(1, 1, 'O');
    jogo.preenchePosicao(1, 1, 'X');
  }
  @Test(expected = IllegalArgumentException.class)
  public void testPosicaoInvalidaMaiorQueTabuleiro(){
    jogo.preenchePosicao(4, 3, 'O');
  }
  @Test(expected = IllegalArgumentException.class)
  public void testPosicaoInvalidaMaiorQueTabuleiro2(){
    jogo.preenchePosicao(3, 3, 'O');
  }
  @Test(expected = IllegalArgumentException.class)
  public void testPosicaoInvalidaNegativa(){
    jogo.preenchePosicao(-1, 1, 'X');
  }
  
  @Test
  public void testTabuleiroCheio() {
    assertFalse(jogo.checaTabuleiroCheio());
    jogo.preencheTudo('X');
    assertTrue(jogo.checaTabuleiroCheio());
  }
}
