package orientacaoobjetos;

public class Cachorro extends Animal {
	
	public int correr;
	
	public void Corra() {
		
		if (this.correr<=0)
		{
			System.out.println("O cachorro est� dormindo!");
		}
			
		else
		{
			System.out.println("\nO cachorro correu!");
		}
	}
}

