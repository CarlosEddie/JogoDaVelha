import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteJogoDaVelha {
	
	@Test
	public void LocalValido() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		// Quando eu fizer...
		boolean resultado = marcarlocal.marcar(1, 1, "x");
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void LocalInvalido() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		// Quando eu fizer...
		marcarlocal.marcar(1, 1, "x");
		boolean resultado = marcarlocal.marcar(1, 1, "o");
		// Então, eu espero que...
		assertFalse(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarVitoriaL0() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(0, 0, "x");
		marcarlocal.marcar(1, 0, "o");
		marcarlocal.marcar(0, 1, "x");
		marcarlocal.marcar(1, 1, "o");
		marcarlocal.marcar(0, 2, "x");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarVitoriaL1() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(1, 0, "x");
		marcarlocal.marcar(0, 0, "o");
		marcarlocal.marcar(1, 1, "x");
		marcarlocal.marcar(0, 1, "o");
		marcarlocal.marcar(1, 2, "x");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarVitoriaL2() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(2, 0, "x");
		marcarlocal.marcar(0, 0, "o");
		marcarlocal.marcar(2, 1, "x");
		marcarlocal.marcar(0, 1, "o");
		marcarlocal.marcar(2, 2, "x");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarVitoriaC0() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(0, 0, "x");
		marcarlocal.marcar(1, 2, "o");
		marcarlocal.marcar(1, 0, "x");
		marcarlocal.marcar(1, 1, "o");
		marcarlocal.marcar(2, 0, "x");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarVitoriaC1() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(0, 1, "x");
		marcarlocal.marcar(1, 2, "o");
		marcarlocal.marcar(1, 1, "x");
		marcarlocal.marcar(0, 2, "o");
		marcarlocal.marcar(2, 1, "x");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarVitoriaC2() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(0, 2, "x");
		marcarlocal.marcar(1, 0, "o");
		marcarlocal.marcar(1, 2, "x");
		marcarlocal.marcar(0, 0, "o");
		marcarlocal.marcar(2, 2, "x");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarVitoriaDiagonalPrin() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(0, 0, "x");
		marcarlocal.marcar(1, 0, "o");
		marcarlocal.marcar(1, 1, "x");
		marcarlocal.marcar(0, 2, "o");
		marcarlocal.marcar(2, 2, "x");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarVitoriaDiagonalSec() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(0, 2, "x");
		marcarlocal.marcar(1, 0, "o");
		marcarlocal.marcar(1, 1, "x");
		marcarlocal.marcar(0, 1, "o");
		marcarlocal.marcar(2, 0, "x");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertTrue(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
	
	@Test
	public void VerificarEmpate() {
		// Dado que eu tenho...
		MarcarZona marcarlocal = new MarcarZona();
		VerificarResultado conferir = new VerificarResultado();
		// Quando eu fizer...
		marcarlocal.marcar(0, 0, "x");
		marcarlocal.marcar(0, 1, "o");
		marcarlocal.marcar(0, 2, "x");
		marcarlocal.marcar(1, 0, "o");
		marcarlocal.marcar(1, 1, "x");
		marcarlocal.marcar(1, 2, "x");
		marcarlocal.marcar(2, 0, "o");
		marcarlocal.marcar(2, 1, "x");
		marcarlocal.marcar(2, 2, "o");
		boolean resultado = conferir.conferirSeVenceu();
		// Então, eu espero que...
		assertFalse(resultado);
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				Tabuleiro.mat[l][c] = null;
			}
		}
	}
}
