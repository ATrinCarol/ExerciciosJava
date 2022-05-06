package quatroexercicios;

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

import java.util.Scanner;

public class exercicio4 {
	
	public static void main (String[] args) {
		
		int num;
		
		System.out.println("Digite um número: ");
		
		Scanner leia = new Scanner (System.in);
		num = leia.nextInt();
		
		if (num%2==0) {
			System.out.println("O número é par e a sua raíz quadrada é: " + Math.sqrt(num));
		}
		
		if (num%2==1) {
			System.out.println("O número é ímpar e o seu resultado elevado ao quadrado é: " + num*num);
		}
	}

}
