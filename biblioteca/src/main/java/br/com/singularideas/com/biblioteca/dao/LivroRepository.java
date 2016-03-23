package br.com.singularideas.com.biblioteca.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.singularideas.com.biblioteca.data.Livro;

public class LivroRepository {

	private static LivroRepository instance;
	
	public static LivroRepository getInstance() {
		if (instance == null) {
			instance = new LivroRepository();
		}
		
		return instance;
	}
	
	private LivroRepository() {}
	
	private List<Livro> livros = new ArrayList<Livro>();
	
	public List<Livro> getAll() {
		return livros;
	}
	
	public List<Livro> getSelection(String name, String autor) {
		List<Livro> lv = new ArrayList<Livro>();
		for (Livro l : livros) {
			if (l.getTitulo().contains(name) )
				lv.add(l);
		}
		for (Livro l : livros) {
			if (l.getAutor().contains(autor) )
				lv.add(l);
		}
		return lv;
	}
	
	public void add(final Livro livro) {
		livros.add(livro);
	}
	
	public Livro findByIndex(final int index) {
		return livros.get(index);
	}
	
	public int getNumLivros() {
		return livros.size();
	}
	
	public Livro findByName(final String name) {
		for (Livro lv : livros) {
			if (lv.getTitulo().contains(name) )
				return lv;
		}
		return null;
	}
	
	public Livro findByAutor(final String name) {
		for (Livro lv : livros) {
			if (lv.getAutor().contains(name) )
				return lv;
		}
		return null;
	}
	
}

