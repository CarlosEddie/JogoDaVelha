import java.util.Scanner;
public class Jogada{
	
	public static int escolhaLinha, escolhaColuna, cont = 0;
	VerificarResultado resultado = new VerificarResultado();
	boolean posicao;
	Tabuleiro mostra = new Tabuleiro();
	Scanner teclado = new Scanner(System.in);
	MarcarZona zona = new MarcarZona();
	Ranking pontos =  new Ranking();
	Reiniciar novaPartida = new Reiniciar();
	String simbJogador;
	
	public void jogadaValida() {
		mostra.mostrarTabuleiro();
		while(cont < 9) {
			if(cont % 2 == 0) {
				simbJogador = "x";
			} else {
				simbJogador = "o";
			}
			System.out.println("Desaja marcar em qual posição jogador '" + simbJogador + "' ?");
			System.out.print("Linha [0, 1 ou 2]:");
			escolhaLinha = teclado.nextInt();
			System.out.print("Coluna [0, 1 ou 2]:");
			escolhaColuna = teclado.nextInt();
			while(escolhaLinha > 2 || escolhaColuna > 2) {
				System.out.println("Area fora do limite tente novamente");
				System.out.print("Linha [0, 1 ou 2]:");
				escolhaLinha = teclado.nextInt();
				System.out.print("Coluna [0, 1 ou 2]:");
				escolhaColuna = teclado.nextInt();
			}
			posicao = zona.marcar(escolhaLinha, escolhaColuna, simbJogador);
			if(posicao == true) {
				mostra.mostrarTabuleiro();
				cont++;
				if(cont >= 5) {
					boolean terminou = resultado.conferirSeVenceu();
					if(terminou == true) {
						System.out.println("Fim de Jogo");
						System.out.println("Jogador '" + simbJogador + "' venceu");
							pontos.atualizar(simbJogador);
							pontos.mostrarPontos();
						boolean novoJogo = novaPartida.jogarNovamente();
						if(novoJogo == false) {
							System.out.println("Saindo...");
							break;
						}
					} else if(resultado.conferirSeEmpatou()) {
						System.out.println("Fim de Jogo");
						System.out.println("Deu velha");
						pontos.mostrarPontos();
						boolean novoJogo = novaPartida.jogarNovamente();
						if(novoJogo == false) {
							System.out.println("Saindo...");
							break;
						}
					}
				}	
			} else {
				JogadaInvalida();
				mostra.mostrarTabuleiro();
				cont++;
				if(cont >= 5) {
					boolean terminou = resultado.conferirSeVenceu();
					if(terminou == true) {
						System.out.println("Fim de Jogo");
						System.out.println("Jogador '" + simbJogador + "' venceu");
							pontos.atualizar(simbJogador);
							pontos.mostrarPontos();
						boolean novoJogo = novaPartida.jogarNovamente();
						if(novoJogo == false) {
							System.out.println("Saindo...");
							break;
						}
					} else if(resultado.conferirSeEmpatou()) {
						System.out.println("Fim de Jogo");
						System.out.println("Deu velha");
						pontos.mostrarPontos();
						boolean novoJogo = novaPartida.jogarNovamente();
						if(novoJogo == false) {
							System.out.println("Saindo...");
							break;
						}
					}
				}	
			}
		}
	}
	
	public void JogadaInvalida() {
		do {
			System.out.println("Area ja marcada tente de novo");
			System.out.print("Linha [0, 1 ou 2]:");
			Jogada.escolhaLinha = teclado.nextInt();
			System.out.print("Coluna [0, 1 ou 2]:");
			Jogada.escolhaColuna = teclado.nextInt();
			while(Jogada.escolhaLinha > 2 || Jogada.escolhaColuna > 2) {
				System.out.println("Area fora do limite tente novamente");
				System.out.print("Linha [0, 1 ou 2]:");
				Jogada.escolhaLinha = teclado.nextInt();
				System.out.print("Coluna [0, 1 ou 2]:");
				Jogada.escolhaColuna = teclado.nextInt();
			}
		} while(mostra.getMat(Jogada.escolhaLinha, Jogada.escolhaColuna) != null);
		Tabuleiro.mat[Jogada.escolhaLinha][Jogada.escolhaColuna] = simbJogador;
	}
}
