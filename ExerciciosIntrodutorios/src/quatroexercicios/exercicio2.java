package quatroexercicios;

import java.util.Scanner;

/*2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 * DESCOBRIR PORQUE T� DANDO ERRO NA SEQU�NCIA 
 */

public class exercicio2 {

	public static void main(String[] args) {
		
		double n1, n2, n3;
		
		System.out.print("Digite 3 n�meros que os colocaremos em ordem crescente:\n");
		
		Scanner leia = new Scanner (System.in);
		
		n1 = leia.nextDouble();
		n2 = leia.nextDouble();
		n3 = leia.nextDouble();
		
		if (n1<=n2 && n1<=n3) {
			System.out.println("->" + n1 + "->" + n2 + "->" + n3 ); //123
		}
		
		
		else if (n1<=n2 && n1<=n3 && n2>=n1 && n2>=n3 && n2>=n3 && n3<=n2 && n3>=n1) {
			System.out.println("->" + n1 + "->" + n3 + "->" + n2); //132 -> ESSE DANDO ERRO
		}
		
		else if (n1<=n2 && n1>=n3) {
			System.out.println("->" + n3 + "->" + n1 + "->" + n2); //231
		}
		
		else if (n1>=n2 && n1<=n3) {
			System.out.println("->" + n2 + "->" + n1 + "->" + n3); //213
		}
		
		else if (n1>=n2 && n1>=n3) {
			System.out.println("->" + n2 + "->" + n3 + "->" + n1); //312
		}
		
		else if (n1>=n2 && n1>=n3) {
			System.out.println("->" + n3 + "->" + n2 + "->" + n1); //ERRO TAMB�M
		}
		
		else {
			System.out.println("Voc� digitou um s�mbolo inv�lido para este caso.");
		}
			
		
	}

}
