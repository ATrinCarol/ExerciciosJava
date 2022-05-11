package orientacaoobjetos;

public class Cliente {

	public static void main(String[] args) {

		MoldeCliente cliente1 = new MoldeCliente("Lula", "da Silva", 76, "lula@pt.com.br", 999999999);
		
		System.out.println("ииииииииииииииииииииииииииииии\n");
		System.out.println("Nome cliente: ");
		System.out.println(cliente1.getNomeCompleto());
		System.out.println("ииииииииииииииииииииииииииииии\n");
		System.out.println("Idade cliente: ");
		System.out.println(cliente1.getIdadeCliente());
		System.out.println("ииииииииииииииииииииииииииииии\n");
		System.out.println("Email cliente: ");
		System.out.println(cliente1.getEmailCliente());
		System.out.println("ииииииииииииииииииииииииииииии\n");
		System.out.println("Celular cliente: ");
		System.out.println(cliente1.getCelularCliente());
		
	}

}
