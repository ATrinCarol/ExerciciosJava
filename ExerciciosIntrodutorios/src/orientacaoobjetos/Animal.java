package orientacaoobjetos;

public class Animal {
	
	public String nome;
	public int idade;
	public String som;
	
	public void emitirUmSom() {
		
		System.out.println("O som que esse animal emite �: " + this.som);
	}
	public void escreverNome() {
		System.out.println(this.nome + " � um animal.");
	}
	
	public void verIdade () {
		System.out.println("Esse animal tem " + this.idade + " anos.");
	}
	
}
