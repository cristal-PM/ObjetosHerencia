package POO;

public class Pelicula1 {
private String titulo;
private String genero;
private String director;
private int a�o;
private int duracion;
private boolean visto;
public Pelicula1() {
	super();
}
public Pelicula1(String titulo,  String director) {
	super();
	this.titulo = titulo;
	this.genero = "comedia";
	this.director = director;
	this.a�o = 1999;
	this.duracion = 125;
	this.visto = false;
}
public Pelicula1(String titulo, String genero, String director, int a�o, int duracion) {
	super();
	this.titulo = titulo;
	this.genero = genero;
	this.director = director;
	this.a�o = a�o;
	this.duracion = duracion;
}


}
