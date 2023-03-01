package Controller;

public class OperacoesController {
	
	public int quantidade(int N1, int N2) {
		//Condição de parada: Caso a divisão de N1 por 10 for igual a 0, retorna 0;
		if (N1 == 0 ) {
			return 0;
		} else {
			int y = N1 % 10;
			N1 = N1 / 10;
			if (y == N2) {
				return 1 + quantidade(N1, N2);//Caso o resto da divisão de N1 por 10 for igual a N2.
			}
			return quantidade (N1, N2);//Caso o resto da divisão de N1 por 10 não seja igual a N2.
		}
    }
}
