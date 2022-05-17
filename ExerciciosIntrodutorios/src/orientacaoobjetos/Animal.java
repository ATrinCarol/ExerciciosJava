package orientacaoobjetos;

/*Estou usando o abstract aqui porque n�o vou instanciar um objeto Animal. 
 * Eu s� quero criar os atributos e m�todos dessa superclasse para poder usar
 * nas subclasses que a� sim, a partir delas, criarei os objetos.
 */
public abstract class Animal {
	
	public String nome;
	public int idade;
	public String som;
	public String nomePet;
	
	public void emitirUmSom() {
		System.out.println("O som que esse animal emite �: " + this.som);
	}
	
	public void escreverNome() {
		System.out.println(this.nome + " � um animal.");
	}
	
	public void verIdade () {
		System.out.println("Esse animal tem " + this.idade + " anos.");
	}
	// M�TODO POLIMORFO DE SOBRECARGA
	public String chamaONome (String nome1) { //M�todo com nomes iguais e assinaturas diferentes.
		this.nomePet = nome1;
		return this.nomePet;
	}
	
	public String chamaONome (String nome1, String nome2) { 
		this.nomePet = nome1+nome2;                                        
	    return this.nomePet;
}
	
}

/*chamaONome, viu? Nomes iguais. Mas a assinatura, o par�metro () o conte�do que vai
 * dentro dos par�nteses, � diferente. Pode ser pela quantidade, ou tipo.
 */