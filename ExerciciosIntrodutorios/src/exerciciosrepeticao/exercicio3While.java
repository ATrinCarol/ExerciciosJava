package exerciciosrepeticao; //RESOLVER O PROBLEMA

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class exercicio3While {

	public static void main(String[] args) {
		
		int idade=0, totalMenos21, totalMais50, contadorMenos=0, contadorMais=0;
		
		Scanner leia = new Scanner (System.in);
		
		while (idade>-99)
		{ System.out.println("Digite sua idade: \n");
		idade = leia.nextInt();
			if (idade<21) {
				totalMenos21 = idade;
				contadorMenos++;
			}
			if (idade>50) {
				totalMais50 = idade;
				contadorMais++;
			}
		} 
			System.out.println("Fim do programa!");
			
		System.out.println("O total de pessoas com menos de 21 anos é: " + contadorMenos);
		System.out.println("O total de pessoas com mais de 50 anos é: " + contadorMais);
		
	}
}