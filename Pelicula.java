package POO;

public class Pelicula extends Cine{
	private int año;
public Pelicula(String titulo, String director, String genero, int duracion,int año) {
		super(titulo, director, genero, duracion);
		// TODO Auto-generated constructor stub
		this.año=año;
	}

public Pelicula(String titulo, String director, int año) {
	super(titulo, director);
	this.año = año;
}

public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}
@Override
public String toString() {
	return "Pelicula [año=" + año + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero
			+ ", duracion=" + duracion + "]";
}



}
