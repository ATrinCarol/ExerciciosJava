package exerciciosrepeticao;

import java.util.*;

/*6- Escrever um programa que receba vários números inteiros no teclado.
 * E no final imprimir a média dos números múltiplos de 3.
 *  Para sair digitar 0(zero).(DO...WHILE)*/

public class exercicio6DoWhile {

	public static void main(String[] args) {
		
		int numeros;
	    double media, numMult3=0.0, soma = 0.0;
	   
		Scanner leia = new Scanner (System.in);
		
		do
		{
			System.out.println("Digite seus números favoritos: ");
			numeros = leia.nextInt();
			
				if (numeros%3==0 && numeros != 0){
				numMult3++;
				soma=soma+numeros;
				}	
			
		}while (numeros!=0);
		System.out.println("Você saiu do programa!");
		
		media = soma / numMult3;
		
		System.out.println("Dentre seus números preferidos, a média daqueles que são múltiplos de 3 é: " + media);

	}

}