package vetoresEMatrizes;

/*Peguei o exemplo e fiz algumas modificações e concertei um bug no último exemplo.
 Antes i+1 estava fora dos parênteses, prejudicando a contagem sequencial das notas 1, 2, 3...
 No vídeo dá pra notar esse desafio. Aí coloquei entre parênteses e consegui resolver o problema.
 */

import java.util.Scanner;

public class exemploArrayVetor {
	
	public static void main (String [] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	
	int [] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321}; //1º vetor
	int [] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45}; //2º vetor
	
	float[] nota = new float[5]; //3º vetor
	
	
	//tamanho do array. utilização do comando length que conta o array até o final.
	if (arrayDois.length >8) {
		System.out.println("O tamanho do 2º vetor (arrayDois) é maior que 8.\n");
	}
	else {
		System.out.println("O tamanho do 2º vetor (arrayDois) é menor que 8.\n");
	}
	
	System.out.println("O tamanho do 1º vetor (arrayUm) é: " + arrayUm.length + "\n");
		
	//utilização do for-each
	System.out.println("Os modelos de carros que compõem o vetor cars é :\n");
		
	String [] cars = {"Volvo", "", "Fusca", "", "Stilo", "Opala\n"};
		
	for (String i : cars) { //i é a variável que vai contar o índice do vetor
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
