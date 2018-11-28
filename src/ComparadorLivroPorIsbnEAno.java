import java.util.Comparator;

public class ComparadorLivroPorIsbnEAno implements Comparator<Livro>{
	@Override
	public int compare(Livro o1, Livro o2) {
		int isbnComparar = o1.getIsbn().compareTo(o2.getIsbn());
		int anoComparar =  o1.getAno().compareTo(o2.getAno());
		
		if(isbnComparar == 0) {
			return ((anoComparar == 0) ? isbnComparar : anoComparar);
		}else {
			return isbnComparar;
		}
	}

}
