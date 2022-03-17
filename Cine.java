package POO;

public class Cine {
public String titulo;
public String director;
public String genero;
public int duracion;
public static boolean visto;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public boolean isVisto() {
	return visto;
}
public void setVisto(boolean visto) {
	this.visto = visto;
}
public Cine(String titulo, String director, String genero, int duracion, boolean visto) {
	super();
	this.titulo = titulo;
	this.director = director;
	this.genero = genero;
	this.duracion = duracion;
	this.visto = false;
}
public Cine(String titulo, String director) {
	super();
	this.titulo = titulo;
	this.director = director;
	this.genero = "drama";
	this.duracion = 125;
	this.visto = false;
}
public Cine(String titulo, String director, String genero, int duracion) {
	super();
	this.titulo = titulo;
	this.director = director;
	this.genero = genero;
	this.duracion = duracion;
}

}
