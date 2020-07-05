import java.util.Scanner;

public class Reiniciar {
	Scanner teclado = new Scanner(System.in);
	public boolean jogarNovamente() {
		int res;
		while(true) {
			System.out.printf("Deseja jogar novamente? \n[1]Sim\n[2]Não");
			res = teclado.nextInt();
			if(res == 1 || res == 2) {
				break;
			} else {
				System.out.println("Opção invalida!");
			}
		}
		if(res == 1) {
			System.out.println("Iniciando novo jogo");
			for(int l = 0; l < 3; l++) {
				for(int c = 0; c < 3; c++) {
					Tabuleiro.mat[l][c] = null;
					System.out.print("[ ]");
				}
				System.out.println();
			}
			Jogada.cont = 0;
			return true;
		} else {
			return false;
		}
			
	}
}
