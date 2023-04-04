package died.guia04.ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteo {
	private int anio;
	private int semanaSorteo;
	private List<Apuesta> apuestas = new ArrayList<Apuesta>();
	private byte[] sorteo = new byte[6];
	private int maxAciertos;
	
	public Sorteo(int anio,int semana,List<Apuesta> apuestas) {
		this.anio = anio;
		this.semanaSorteo = semana;
		this.apuestas = apuestas;
	}
	
	public void generarSorteo() {
		Random random = new Random(System.currentTimeMillis());
		for(int i=0; i<this.sorteo.length; i++) this.sorteo[i] = (byte) random.nextInt(43);
	}
	
	public List<Apuesta> calcularGanadores(){
		List<Apuesta> ganadores = new ArrayList<Apuesta>();
		for(Apuesta unaApuesta : this.apuestas) {
			if(unaApuesta.calcularAciertos(sorteo) > this.maxAciertos) this.maxAciertos = unaApuesta.calcularAciertos(sorteo);
		}
		if(this.maxAciertos == 0) return ganadores;
		for(Apuesta unaApuesta : this.apuestas) {
			if(unaApuesta.calcularAciertos(sorteo) == this.maxAciertos) ganadores.add(unaApuesta);
		}
		return ganadores;
	}
	
	public int getMaxAciertos() {
		return maxAciertos;
	}
	
	public byte[] getSorteo() {
		return sorteo;
	}
}
