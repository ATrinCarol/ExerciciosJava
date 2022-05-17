package orientacaoobjetos;


import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		ArrayList <String> estoques = new ArrayList<>();
		
		String estoque1 = "Canetas";
		String estoque2 = "L�pis";
		String estoque3 = "Clipes";
		String estoque4 = "Cadernos";
		
		//armazenar e atualizar (?) dados da lista
		estoques.add(estoque1);
		estoques.add(estoque2);
		estoques.add(estoque3);
		estoques.add(estoque4);
		
		//ver conte�do do ind�ce 2 da lista (lembrando que a primeira posi��o � 0)
		System.out.println("\nMostrando info do ind�ce 2: " + estoques.get(2));
		
		//apresentar todos os dados da lista
		System.out.println("\nApresentando todas info da Lista: " + estoques);
		
		//verificar o tamanho da lista
		System.out.println("\nTamanho da Lista: " + estoques.size());
		
		//remover dados da lista
		estoques.remove(0);
		System.out.println("\nRemovi o ind�ce 0: " + estoques);
		System.out.println("\nTamanho da Lista agora �:  \n" + estoques.size());
		
		//atualizei e mostrei todos os dados novamente
		estoques.add(estoque1);
		System.out.println("\nAdd novamente: " + estoque1);
		System.out.println("\nMostrando toda a Lista: " + estoques);	
		
		//Verifica se tem essa informa��o na lista
		System.out.println("\nVerificando info na lista: " + estoques.contains("Apontador"));
		System.out.println("Verificando info na lista: " + estoques.contains("Cadernos"));
		
		
		
		
		

		
			
	}


}
