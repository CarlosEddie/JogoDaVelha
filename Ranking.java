
public class Ranking {
	int x = 0, o = 0;
	public void atualizar(String jogador) {
		if(jogador == "x") {
			x += 1;
		} else {
			o += 1;
		}
	}
	public void mostrarPontos() {
		System.out.println("O jogador 'x' ganhou " + x + " vezes");
		System.out.println("O jogador 'o' ganhou " + o + " vezes");
		if(x > o) {
			System.out.println("O jogador 'x' est� vencendo");
		} else if(o > x) {
			System.out.println("O jogador 'o' est� vencendo");
		} else {
			System.out.println("Os jogadores est�o empatados");
		}
	}
}
