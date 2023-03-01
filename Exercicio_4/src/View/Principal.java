package View;

import java.util.Scanner;

import Controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		OperacoesController Op = new OperacoesController();
		
		int N1; 
		int N2;
		do {
			N1 = sc.nextInt();
		} while (N1 < 10 || N1 > 999999);
		
		do {
			N2 = sc.nextInt();
		} while (N2 < 0 || N2 > 9);
		
		System.out.println(Op.quantidade(N1, N2));
	}

}
