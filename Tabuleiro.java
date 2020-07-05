public class Tabuleiro {
	public static String mat[][] = new String[3][3];
	public void mostrarTabuleiro() {
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				if(mat[l][c] == null) {
					System.out.print("[ ]");
				} else {
					System.out.print("[" +  mat[l][c]+ "]");
				}
			}
			System.out.println();
		}
	}
	public String getMat(int linha, int coluna) {
		return mat[linha][coluna];
	}
	
}