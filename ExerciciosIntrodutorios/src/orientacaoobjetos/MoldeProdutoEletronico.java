package orientacaoobjetos;

import java.util.*;

public class MoldeProdutoEletronico {
	
	public String tipo;
	public String marca;
	public String cor;
	public double peso;
	public boolean ligado;
	public double preco;
	
	Scanner ler = new Scanner (System.in);
	
	public void getComprar()
	{
		if (this.preco<2.000) {
			System.out.println("Colocar no carrinho!");
		}
		if (this.preco>4.000)
		{
			System.out.println("Muito caro, colocar na lista.");
		}
	}
		
	public void getLigar()
	{
		this.ligado=true;
		}
	
	public void getDesligar()
	{
		this.ligado=false;
	}
	
	public void getCaracteristicas()
	{
		
		System.out.println("As caracter?sticas do produto s?o: ");
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Peso: " + this.peso + "kg.");
		System.out.println("Pre?o: R$" + this.preco);
	}
	
}