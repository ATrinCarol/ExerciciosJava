package exerciciosrepeticao;

//2- Ler 10 n?meros e imprimir quantos s?o pares e quantos s?o ?mpares. (FOR)

import java.util.*;

public class exercicio2For {

	public static void main(String[] args) {
		
		int num, numPar=0, numImpar=0; 
		Scanner ler = new Scanner (System.in);
		
		
		for (int contador=0;contador<10;contador++) {
			System.out.println("Digite 10 n?meros: ");
			num = ler.nextInt();
			
			if(num%2==0) {
				numPar++;
			}
			
			else {
				numImpar++;
			}
			
		}
		
		System.out.println("A quantidade de n?meros pares digitada ?: \n" + numPar);
		System.out.println("A quantidade de n?meros ?mpares digitada ?: \n" + numImpar);

	}

}
