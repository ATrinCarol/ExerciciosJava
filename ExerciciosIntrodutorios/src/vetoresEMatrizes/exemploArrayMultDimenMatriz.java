package vetoresEMatrizes;

import java.util.Scanner;

public class exemploArrayMultDimenMatriz {

	public static void main(String[] args) {
		
		int [] [] matriz = new int [3] [3];
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Matriz [3][3]\n");
		
		for (int linha =0;linha <3;linha++){
			for (int coluna =0; coluna <3; coluna++) {		
				System.out.printf("Digite os n�meros para compor o quadro Matriz:[%d][%d] ", linha+1, coluna+1);
				matriz[linha][coluna]=entrada.nextInt();
	
			}
		}
		entrada.close();
		
		System.out.println("Matriz preenchida a seguir: ");
		for (int linha=0;linha<3;linha++) {
			for (int coluna=0;coluna<3;coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			
			System.out.println();
		}	

	}

}
