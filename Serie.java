package POO;

public class Serie extends Cine {
private int nTemporadas=1;
	public Serie(String titulo, String director, String genero, int duracion,int nTemporadas) {
		super(titulo, director, genero, duracion);
		// TODO Auto-generated constructor stub
		this.nTemporadas=nTemporadas;
	}
	public Serie(String titulo, String director, int nTemporadas) {
		super(titulo, director);
		this.nTemporadas = nTemporadas;
	}
	public int getnTemporadas() {
		return nTemporadas;
	}
	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}
	@Override
	public String toString() {
		return "Serie [nTemporadas=" + nTemporadas + ", titulo=" + titulo + ", director=" + director + ", genero="
				+ genero + ", duracion=" + duracion + "]";
	}

}
