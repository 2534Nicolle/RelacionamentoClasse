package RelacionamentoClasses.Composição;

public class PrincipalLivro {

	public static void main(String[] args) {
		
        Livro livro = new Livro(" A menina que roubava livros");
        Autor autor = new Autor("Marcus Zusak");
		
		System.out.println("O livro " + livro.getTitulo() + " foi criado pelo autor " + autor.getNome());

	}

}
