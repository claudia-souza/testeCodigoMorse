package teste;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import modelo.CodigoMorse;



public class TestarCodigoMorse {
	private CodigoMorse nr;
	
	@Before
	public void setUp() throws Exception {
			
			nr=new CodigoMorse();
			
	}
	@Test
	public void test1( ) {
	    assertEquals("... --- ...",nr.convertToMorse("SOS"));
	   
	}
	@Test
	public void test2( ) {
	    assertEquals(".. ..-. -.-. . / - .. .- -. --. ..- .-"
	    		+ "",nr.convertToMorse("IFCE Tiangua"));
	   
	}
		
	@Test
	public void test3( ) {
	    assertEquals("- . ... - . ... / ..- -. .. - .- .-. .. --- ..."
	    		+ "",nr.convertToMorse("Testes unitarios"));
	   
	}
	
	@Test
	public void test4( ) {
	    assertEquals("-.-. .-.. .- ..- -.. .. .-"
	    		+ "",nr.convertToMorse("Claudia"));
	   
	}

	
	@Test(expected=IllegalArgumentException.class)
	  //lança uma exceção ao receber um texto vazio.
	    public void testOutFaixa( ) {
		   nr.convertToMorse("");
	    }
}
