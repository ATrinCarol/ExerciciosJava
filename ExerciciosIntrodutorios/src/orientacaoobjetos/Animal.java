package orientacaoobjetos;

/*Estou usando o abstract aqui porque não vou instanciar um objeto Animal. 
 * Eu só quero criar os atributos e métodos dessa superclasse para poder usar
 * nas subclasses que aí sim, a partir delas, criarei os objetos.
 */
public abstract class Animal {
	
	public String nome;
	public int idade;
	public String som;
	public String nomePet;
	
	public void emitirUmSom() {
		System.out.println("O som que esse animal emite é: " + this.som);
	}
	
	public void escreverNome() {
		System.out.println(this.nome + " é um animal.");
	}
	
	public void verIdade () {
		System.out.println("Esse animal tem " + this.idade + " anos.");
	}
	// MÉTODO POLIMORFO DE SOBRECARGA
	public String chamaONome (String nome1) { //Método com nomes iguais e assinaturas diferentes.
		this.nomePet = nome1;
		return this.nomePet;
	}
	
	public String chamaONome (String nome1, String nome2) { 
		this.nomePet = nome1+nome2;                                        
	    return this.nomePet;
}
	
}

/*chamaONome, viu? Nomes iguais. Mas a assinatura, o parâmetro () o conteúdo que vai
 * dentro dos parênteses, é diferente. Pode ser pela quantidade, ou tipo.
 */