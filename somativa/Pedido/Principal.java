package Pedido;

public class Principal {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1, "Notebook", 5);
		
		System.out.println("id = " + pedido.getId());
		System.out.println("produto = " + pedido.getProduto());
		System.out.println("quantidade = " + pedido.getQuantidade());

	}

}
