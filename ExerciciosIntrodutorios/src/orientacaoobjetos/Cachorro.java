package orientacaoobjetos;

public class Cachorro extends Animal {
	
	public int correndo;
	
	
	public void Corra() {
		
		if (this.correndo<=0)
		{
			System.out.println("O cachorro est� dormindo!");
		}
			
		else
		{
			System.out.println("\nO cachorro correu!");
		}
	}
}

