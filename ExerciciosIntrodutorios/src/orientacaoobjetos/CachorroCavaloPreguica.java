package orientacaoobjetos;

public class CachorroCavaloPreguica {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro ();
		Cavalo horse = new Cavalo ();
		Preguica lazy = new Preguica ();
		
		dog.nome="Cachorro";
		dog.idade=10;
		dog.som="Auau";
		dog.correndo=0;
		dog.escreverNome();
		dog.chamaONome("Slinky.");
		dog.verIdade();
		dog.emitirUmSom();
		dog.Corra(); //lembrar: polimorfismo sobreposi��o
		
		System.out.println("\n****************************");
		
		horse.nome="Cavalo";
		horse.idade=50;
		horse.som="Hiin in in";
		horse.correr="Cooorre";
		horse.correndo=1;
		horse.escreverNome();
		horse.chamaONome("Bala", " no Alvo.");
		horse.verIdade();
		horse.emitirUmSom();
		horse.correPocot�();
		
		horse.Corra(); //lembrar: polimorfismo sobreposi��o
		
		System.out.println("\n****************************");
		
		lazy.nome="Pregui�a";
		lazy.idade=200;
		lazy.som="Anh Anh";
		lazy.subiu="Sim!!!";
		lazy.escreverNome();
		lazy.chamaONome("Cochilo");
		lazy.verIdade();
		lazy.emitirUmSom();
		lazy.subaNaArvore();
	}

}
