package quatroexercicios;

import java.util.Scanner;

/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

public class exercicio3 {
	
	public static void main(String[] args) {
		
		int idade;
		
		System.out.println("Digite sua idade para saber em qual categoria se encontra:\n \n "
				+ "10-14 infantil\n 15-17 juvenil\n 18-25 adulto");
		
		
			Scanner ler = new Scanner (System.in);
		
		idade = ler.nextInt();
		
		if (idade >=10 && idade<=14) {
			System.out.println("Você faz parte do público infantil!");
		}
		
		else if (idade >=15 && idade<=17) {
			System.out.println("Você faz parte do público juvenil!");
		}
		
		else if (idade >=18 && idade <=25) {
			System.out.println("Você faz parte do público adulto!\n\n");
		}
		
		else {
			System.out.println("Sua idade não se encaixa nas categorias mencionadas");
		}
		
	}
	
	

}
