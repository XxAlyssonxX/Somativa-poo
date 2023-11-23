package Produto;

public class Principal {

	public static void main(String[] args) {
		 Livro livro = new Livro("BGA", "desconhecido", 220);

		 System.out.println("Nome = " + livro.getNome());
		 System.out.println("Autor = " + livro.getAutor());
		 System.out.println("pgs = " + livro.getPaginas());
	}

}
