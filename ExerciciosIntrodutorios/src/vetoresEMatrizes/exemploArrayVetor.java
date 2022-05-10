package vetoresEMatrizes;

/*Peguei o exemplo e fiz algumas modifica��es e concertei um bug no �ltimo exemplo.
 Antes i+1 estava fora dos par�nteses, prejudicando a contagem sequencial das notas 1, 2, 3...
 No v�deo d� pra notar esse desafio. A� coloquei entre par�nteses e consegui resolver o problema.
 */

import java.util.Scanner;

public class exemploArrayVetor {
	
	public static void main (String [] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	
	int [] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321}; //1� vetor
	int [] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45}; //2� vetor
	
	float[] nota = new float[5]; //3� vetor
	
	
	//tamanho do array. utiliza��o do comando length que conta o array at� o final.
	if (arrayDois.length >8) {
		System.out.println("O tamanho do 2� vetor (arrayDois) � maior que 8.\n");
	}
	else {
		System.out.println("O tamanho do 2� vetor (arrayDois) � menor que 8.\n");
	}
	
	System.out.println("O tamanho do 1� vetor (arrayUm) �: " + arrayUm.length + "\n");
		
	//utiliza��o do for-each
	System.out.println("Os modelos de carros que comp�em o vetor cars � :\n");
		
	String [] cars = {"Volvo", "", "Fusca", "", "Stilo", "Opala\n"};
		
	for (String i : cars) { //i � a vari�vel que vai contar o �ndice do vetor
		System.out.println(i);
		}	
	
	//populando um array	
	for(int i=0;i<5;i++) {

		System.out.println("Digite uma nota: ");
		nota[i]=entrada.nextFloat();
		}
	entrada.close();	
	// apresentando um array
	for (int i=0;i<5;i++) {
		System.out.println("Nota " + (i+1) + "=" + nota[i]);
		}	
	
	
	}
}
