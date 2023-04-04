package died.guia04.ejercicio01;

public class Apuesta {
	private String usuario;
	private byte[] numeros;
	
	public Apuesta(String usuario, byte[] numerosApostados) {
		super();
		this.usuario = usuario;
		this.numeros = numerosApostados;
	}
	
	public int calcularAciertos(byte[] numerosSorteados) {
		int aciertos = 0;
		for(byte unNumero : numerosSorteados) {
			for(byte unNumeroApostado : this.numeros) {
				if(unNumeroApostado == unNumero) {
					aciertos++;
					break;
				}
			}
		}
		return aciertos;
	}
	
	public String getUsuario() {
		return usuario;
	}
}
