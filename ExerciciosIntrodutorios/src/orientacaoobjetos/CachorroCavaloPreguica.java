package orientacaoobjetos;

public class CachorroCavaloPreguica {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro ();
		Cavalo horse = new Cavalo ();
		Preguica lazy = new Preguica ();
		
		dog.nome="Cachorro";
		dog.idade=10;
		dog.som="Auau";
		dog.correr=0;
		dog.escreverNome();
		dog.verIdade();
		dog.emitirUmSom();
		dog.Corra();
		
		System.out.println("\n****************************");
		
		horse.nome="Cavalo";
		horse.idade=50;
		horse.som="Hiin in in";
		horse.correr="Cooorre";
		horse.escreverNome();
		horse.verIdade();
		horse.emitirUmSom();
		horse.correPocot�();
		
		System.out.println("\n****************************");
		
		lazy.nome="Pregui�a";
		lazy.idade=200;
		lazy.som="Anh Anh";
		lazy.subiu="Sim!!!";
		lazy.escreverNome();
		lazy.verIdade();
		lazy.emitirUmSom();
		lazy.subaNaArvore();
	}

}