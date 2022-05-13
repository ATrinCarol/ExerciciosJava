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
		dog.verIdade();
		dog.emitirUmSom();
		dog.Corra(); //lembrar: polimorfismo sobreposição
		
		System.out.println("\n****************************");
		
		horse.nome="Cavalo";
		horse.idade=50;
		horse.som="Hiin in in";
		horse.correr="Cooorre";
		horse.correndo=1;
		horse.escreverNome();
		horse.verIdade();
		horse.emitirUmSom();
		horse.correPocotó();
		
		horse.Corra(); //lembrar: polimorfismo sobreposição
		
		System.out.println("\n****************************");
		
		lazy.nome="Preguiça";
		lazy.idade=200;
		lazy.som="Anh Anh";
		lazy.subiu="Sim!!!";
		lazy.escreverNome();
		lazy.verIdade();
		lazy.emitirUmSom();
		lazy.subaNaArvore();
	}

}
