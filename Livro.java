package RelacionamentoClasses.Composição;

public class Livro {
	
	private String titulo;
	private Autor autor;
	
	public Livro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
