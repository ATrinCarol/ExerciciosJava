package exerciciosrepeticao;

import java.util.*;

/*    4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos 
 * indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: 
 * (WHILE)
    • o número de pessoas calmas; 
    • o número de mulheres nervosas; 
    • o número de homens agressivos; 
    • o número de outros calmos;
    • o número de pessoas nervosas com mais de 40 anos; 
    • o número de pessoas calmas com menos de 18 anos.*/

//EXEMPLO DO AUGUSTO ABAIXO 

public class exercicio4While {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int escolhaSexo, escolhaCarac;
		int qntPessoa = 1, idade;
		int numCal = 0, numMulNer = 0, numHomAgr=0, numOutCal=0, numNerMaior40=0, numCalMenor18=0;
		
		while(qntPessoa <= 150)
		{
			do
			{
				System.out.print("Digite sua idade: ");
				idade = input.nextInt();
				if(idade<0)
					System.out.println("Idade invalida, digite idade maior ou igual a 0");
					
			}while(idade < 0);
			
			do
			{
				System.out.println("Digite a escolha de sexo (1-feminino / 2-masculino / 3-Outros) ");
				escolhaSexo = input.nextInt();
				if(escolhaSexo <= 0 || escolhaSexo > 3)
					System.out.println("Valor invalido, digite valor valido");
			}while(escolhaSexo <= 0 || escolhaSexo > 3);
			
			do
			{
				System.out.println("Digite a escolha da caracteristica (1-calma / 2-nervosa / 3-agressiva). ");
				escolhaCarac = input.nextInt();
				if(escolhaCarac <= 0 || escolhaCarac > 3)
					System.out.println("Valor invalido, digite valor valido");
			}while(escolhaCarac <= 0 || escolhaCarac > 3);
			
			if(escolhaCarac == 1)
				numCal += 1;
			if(escolhaSexo == 1 && escolhaCarac == 2)
				numMulNer =+1;
			if(escolhaSexo == 2 && escolhaCarac == 3)
				numHomAgr +=1;
			if(escolhaSexo == 3 && escolhaCarac == 1)
				numOutCal +=1;
			if(idade > 40 && escolhaCarac == 2)
				numNerMaior40 +=1;
			if(idade < 18 && escolhaCarac == 1)
				numCalMenor18 +=1;
			qntPessoa += 1;
		}
		
		System.out.println("O numero de pessoas calmas são: "+numCal+"\nO numero de mulheres nervosas são: "+numMulNer+"\nO numero de homens agressivos são: "+numHomAgr+
				"\nO numero de outros calmos são: "+numOutCal+"\nO numero de pessoas nervosas com mais de 40 anos são: "+numNerMaior40+"\nO numero de pessoas calmas com menos de 18 anos são: "+numCalMenor18);

	}

}