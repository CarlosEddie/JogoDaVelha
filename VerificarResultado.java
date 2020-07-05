public class VerificarResultado extends MarcarZona{
	public boolean conferirSeVenceu() {
		if(((mat[0][0] == "x") && (mat[0][1] == "x") && (mat[0][2] == "x")) || ((mat[0][0] == "o") && (mat[0][1] == "o") && (mat[0][2] == "o")) ||
		   ((mat[1][0] == "x") && (mat[1][1] == "x") && (mat[1][2] == "x")) || ((mat[1][0] == "o") && (mat[1][1] == "o") && (mat[1][2] == "o")) ||
		   ((mat[2][0] == "x") && (mat[2][1] == "x") && (mat[2][2] == "x")) || ((mat[2][0] == "o") && (mat[2][1] == "o") && (mat[2][2] == "o")) ||
		   ((mat[0][0] == "x") && (mat[1][0] == "x") && (mat[2][0] == "x")) || ((mat[0][0] == "o") && (mat[1][0] == "o") && (mat[2][0] == "o")) ||
		   ((mat[0][1] == "x") && (mat[1][1] == "x") && (mat[2][1] == "x")) || ((mat[0][1] == "o") && (mat[1][1] == "o") && (mat[2][1] == "o")) ||
		   ((mat[0][2] == "x") && (mat[1][2] == "x") && (mat[2][2] == "x")) || ((mat[0][2] == "o") && (mat[1][2] == "o") && (mat[2][2] == "o")) ||
		   ((mat[0][0] == "x") && (mat[1][1] == "x") && (mat[2][2] == "x")) || ((mat[0][0] == "o") && (mat[1][1] == "o") && (mat[2][2] == "o")) ||
		   ((mat[0][2] == "x") && (mat[1][1] == "x") && (mat[2][0] == "x")) || ((mat[0][2] == "o") && (mat[1][1] == "o") && (mat[2][0] == "o"))) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean conferirSeEmpatou() {
		if(!(conferirSeVenceu()) && (Jogada.cont >= 9)) {
			return true;
		} else {
			return false;
		}
	}
}
