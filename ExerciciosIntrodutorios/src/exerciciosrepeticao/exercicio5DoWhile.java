package exerciciosrepeticao;

import java.util.*;

/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

public class exercicio5DoWhile {

	public static void main(String[] args) {

		int num, soma=0, contadornum = 0;
		Scanner leia = new Scanner (System.in);
		
		do{
			System.out.println("Digite um n�mero qualquer: ");
			num = leia.nextInt(); 
			contadornum++;
			soma = num+soma;
			} while (num!=0);
		System.out.println("O n�mero que digitou foi zero");
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
	}
}
		
	
