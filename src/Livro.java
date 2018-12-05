import java.util.Comparator;

public class Livro implements Comparable<Livro> {

	private String titulo;

	private String isbn;

	private String codigo;

	private int ano;

	public Livro(String codigo, String isbn, int ano, String titulo) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.codigo = codigo;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return String.format("(Ano <%s>, ISBN <%s>, Título <%s>, Código <%s>)", ano, isbn, titulo, codigo);
	}

	@Override
	public int compareTo(Livro o) {
	    return Comparator.comparing(Livro::getAno)
	    		.thenComparing(Livro::getIsbn)
	             .compare(this, o);
	}
	
}
