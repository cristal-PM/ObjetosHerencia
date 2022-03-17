package POO;

public class Serie1 {
private String titulo;
private int  nTemporadas=1;
private boolean visto=false;
private String genero;
private String director;
private int duracion;
public Serie1() {
	super();
}
public Serie1(String titulo,  String director) {
	super();
	this.titulo = titulo;
	this.nTemporadas = 1;
	this.visto = false;
	this.genero = "terror";
	this.director = director;
	this.duracion = 129;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getnTemporadas() {
	return nTemporadas;
}
public void setnTemporadas(int nTemporadas) {
	this.nTemporadas = nTemporadas;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
@Override
public String toString() {
	return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", visto=" + visto + ", genero=" + genero
			+ ", director=" + director + ", duracion=" + duracion + "]";
}

}
