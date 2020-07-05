import java.util.Scanner;
public class MarcarZona extends Tabuleiro{
	Scanner teclado = new Scanner(System.in);
	public boolean marcar(int l, int c, String simbolo) {
		if(mat[l][c] == null) {
			mat[l][c] = simbolo;
			return true;
		} else {
			return false;
		}
	}
}
