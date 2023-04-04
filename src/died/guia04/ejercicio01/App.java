package died.guia04.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Apuesta> apuestas = new ArrayList<Apuesta>();
		byte[]	numApostados1 = {0,1,2,3,4,5};
		Apuesta apuesta1 = new Apuesta("user1",numApostados1);
		apuestas.add(apuesta1);
		byte[]	numApostados2 = {6,7,8,9,10,11};
		Apuesta apuesta2 = new Apuesta("user2",numApostados2);
		apuestas.add(apuesta2);
		byte[]	numApostados3 = {12,13,14,15,16,17};
		Apuesta apuesta3 = new Apuesta("user3",numApostados3);
		apuestas.add(apuesta3);
		Apuesta apuesta4 = new Apuesta("user4",numApostados3);
		apuestas.add(apuesta4);
		
		Sorteo sorteo = new Sorteo(2023, 1, apuestas);
		sorteo.generarSorteo();
		List<Apuesta> ganadores = sorteo.calcularGanadores();
		int maxAciertos = sorteo.getMaxAciertos();
		
		if(maxAciertos == 0) System.out.println("No hay ganadores");
		else{
			for(Apuesta unGanador : ganadores) {
				System.out.println("Ganador: "+unGanador.getUsuario()+" con "+maxAciertos+" aciertos");
			}
		}
	}
}
