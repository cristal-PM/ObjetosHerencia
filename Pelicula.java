package POO;

public class Pelicula extends Cine{
	private int a�o;
public Pelicula(String titulo, String director, String genero, int duracion,int a�o) {
		super(titulo, director, genero, duracion);
		// TODO Auto-generated constructor stub
		this.a�o=a�o;
	}

public Pelicula(String titulo, String director, int a�o) {
	super(titulo, director);
	this.a�o = a�o;
}

public int getA�o() {
	return a�o;
}
public void setA�o(int a�o) {
	this.a�o = a�o;
}
@Override
public String toString() {
	return "Pelicula [a�o=" + a�o + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero
			+ ", duracion=" + duracion + "]";
}



}
