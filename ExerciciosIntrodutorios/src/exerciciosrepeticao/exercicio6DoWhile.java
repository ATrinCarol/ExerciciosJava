package exerciciosrepeticao;

import java.util.*;

/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado.
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
 *  Para sair digitar 0(zero).(DO...WHILE)*/

public class exercicio6DoWhile {

	public static void main(String[] args) {
		
		int numeros;
	    double media, numMult3=0.0, soma = 0.0;
	   
		Scanner leia = new Scanner (System.in);
		
		do
		{
			System.out.println("Digite seus n�meros favoritos: ");
			numeros = leia.nextInt();
			
				if (numeros%3==0 && numeros != 0){
				numMult3++;
				soma=soma+numeros;
				}	
			
		}while (numeros!=0);
		System.out.println("Voc� saiu do programa!");
		
		media = soma / numMult3;
		
		System.out.println("Dentre seus n�meros preferidos, a m�dia daqueles que s�o m�ltiplos de 3 �: " + media);

	}

}