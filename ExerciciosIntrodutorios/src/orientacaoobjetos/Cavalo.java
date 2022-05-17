package orientacaoobjetos;

public class Cavalo extends Cachorro { 
	
	/*O Override puxa a sobreposi��o da superclass (extends)
	 Por exemplo, a superclass de Cachorro � Animal. Ent�o a class Cachorro vai herdar tudo que
	 � da class Animal. Mas o m�todo Corra n�o tinha na class Animal (porque pregui�a � um animal
	 que n�o corre). O m�todo Corra s� tinha na class Cachorro, ent�o eu tive que transformar aqui
	 uma subclass da superclass Cachorro, pra usar o m�todo Corra e conseguir dar o @Override.
	*/
	
	public String correr;
	public int correndo;
	
	public void correPocot�() {
		System.out.println(this.correr + ", corre pocot�"); 
		
	}
	
	@Override
	public void Corra() {
		
		if (this.correndo<=0)
		{
			System.out.println("O cavalo est� dormindo!");
		}
			
		else
		{
			System.out.println("O cavalo correu!");
		}
		
		
	}
	
	
	
}













