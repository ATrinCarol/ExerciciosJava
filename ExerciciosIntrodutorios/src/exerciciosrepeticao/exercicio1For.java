package exerciciosrepeticao;

/*1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

public class exercicio1For {

	public static void main(String[] args) {
			
		System.out.println("A seguir todos os n�meros de 1000 a 1999 que quando divididos por 11 o resto � 5: \n");
		
		for (int n=1000; n<=1999; n++) {
			
			if (n%11==5) {
				System.out.println(" " + n);
			}		
			
		}

		System.out.println("Pr�ximo!!!");
	}

}
