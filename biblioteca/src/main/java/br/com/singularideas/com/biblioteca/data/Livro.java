package br.com.singularideas.com.biblioteca.data;

public class Livro {
	
	public Livro(String titulo, String autor, String local) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.local = local;
	}

	String titulo, autor, local;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	

}
