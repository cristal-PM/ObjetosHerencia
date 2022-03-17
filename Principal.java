package POO;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Pelicula> peli= new ArrayList<Pelicula>();
ArrayList <Serie> seri= new ArrayList<Serie>();
Pelicula p1= new Pelicula("Casa de papel","Roberto Orozco",1999);
Pelicula p2= new Pelicula("Cortina de humo","Roberto Sanchez",1959);
Pelicula p3= new Pelicula("Coro","Roberto Sanchez",1989);
Pelicula p4= new Pelicula("Casa del terror","Lis Sarti",2009);
Pelicula p5= new Pelicula("Corva","Jose Macs",1945);
peli.add(p1); peli.add(p2); peli.add(p3); peli.add(p4); peli.add(p5);
Serie se1=new Serie("Coro","Medellin espinoza",2);
Serie se2=new Serie("Cancion","Mole espinoza",3);
Serie se3=new Serie("Coco","Corina Ruiz",1);
Serie se4=new Serie("Centauro","Muegano",4);
Serie se5=new Serie("Culma","Tamaulio Seb",2);
seri.add(se1); seri.add(se2); seri.add(se3); seri.add(se4); seri.add(se5);
int m = peli.get(0).getAño();
Pelicula cr = null;
	for(int i=0;i<peli.size();i++) {
		if (peli.get(i).getAño() > m) {
			m = peli.get(i).getAño();
			cr=peli.get(i);
		}
	}
	System.out.println("la pelicula con mayor año es: "+cr.toString());
	int m1 = seri.get(0).getnTemporadas();
	Serie cr1 = null;
		for(int i=0;i<seri.size();i++) {
			if (seri.get(i).getnTemporadas() > m1) {
				m = seri.get(i).getnTemporadas();
				cr1=seri.get(i);
			}
		}
		System.out.println("la serie con mayor numero de temporadas  es: "+cr1.toString());
		}
	}
	

