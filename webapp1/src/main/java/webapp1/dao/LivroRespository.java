package webapp1.dao;

import java.util.ArrayList;
import java.util.List;

import webapp1.data.Livro;

public class LivroRespository {

	private static LivroRespository instance;
	
	public static LivroRespository getInstance() {
		if (instance == null) {
			instance = new LivroRespository();
		}
		
		return instance;
	}
	
	private LivroRespository() {}
	
	private List<Livro> livros = new ArrayList<Livro>();
	
	public List<Livro> getAll() {
		return livros;
	}
	
	public void add(final Livro livro) {
		livros.add(livro);
	}
	
	public Livro findByIndex(final int index) {
		return livros.get(index);
	}
	
	public Livro findByName(final String name) {
		// TODO
		return null;
	}
	
}
