package orientacaoobjetos;

//import java.util.*;

public class ProdutoEletronico {

	public static void main(String[] args) {
		
		MoldeProdutoEletronico produtoEletro1 = new MoldeProdutoEletronico ();
		MoldeProdutoEletronico produtoEletro2 = new MoldeProdutoEletronico ();
		
		
		
		//Scanner ler = new Scanner (System.in);
		
		System.out.println("Sobre os produtos: \n");
			
			System.out.println("Produto 1:");
			produtoEletro1.cor="Preto";
			produtoEletro1.marca="Dell";
			produtoEletro1.tipo="Notebook";
			produtoEletro1.peso=0.400; // ???? n�o t� aparecendo isso no console ????	
			produtoEletro1.preco=1.000;
			produtoEletro1.getCaracteristicas();
			produtoEletro1.getComprar();
			
			System.out.println("\nProduto 2: ");
			produtoEletro2.preco=7.000; 
			produtoEletro2.getComprar();
			
			
			
			
	}

}
