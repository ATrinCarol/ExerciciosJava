package orientacaoobjetos;

public class Cavalo extends Cachorro { 
	
	/*O Override puxa a sobreposição da superclass (extends)
	 Por exemplo, a superclass de Cachorro é Animal. Então a class Cachorro vai herdar tudo que
	 é da class Animal. Mas o método Corra não tinha na class Animal (porque preguiça é um animal
	 que não corre). O método Corra só tinha na class Cachorro, então eu tive que transformar aqui
	 uma subclass da superclass Cachorro, pra usar o método Corra e conseguir dar o @Override.
	*/
	
	public String correr;
	public int correndo;
	
	public void correPocotó() {
		System.out.println(this.correr + ", corre pocotó"); 
		
	}
	
	@Override
	public void Corra() {
		
		if (this.correndo<=0)
		{
			System.out.println("O cavalo está dormindo!");
		}
			
		else
		{
			System.out.println("O cavalo correu!");
		}
		
		
	}
	
	
	
}













