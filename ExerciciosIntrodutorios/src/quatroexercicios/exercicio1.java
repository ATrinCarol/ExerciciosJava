package quatroexercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		

				int n1, n2, n3;
				
				
				System.out.println("Digite tr�s n�meros aleat�rios a seguir e descubra qual o maior:");
				
				Scanner ler = new Scanner(System.in);
			
				
				n1 = ler.nextInt();
				
				n2 = ler.nextInt();
				
				n3= ler.nextInt();
			
				
				if (n1 >n2 && n1>n3 ) {
					System.out.print(n1 + "� o maior n�mero digitado.");
				}
				
				else if (n2 >n1 && n2>n3) {
					System.out.print(n2 + " � o maior n�mero digitado.");
				}
				
				else if (n3>n1 && n3>n2) {
					System.out.print(n3 + " � o maior n�mero digitado");
				}
				
				else {
					System.out.println("\nVoc� digitou algo inv�lido!");
				}
			

			}

}