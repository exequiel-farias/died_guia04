package died.guia04.ejercicio02;

public class Producto {
	private String descripcion;
	private int codigo;
	private double precio;
	private Medida medida;
	
	public Producto(String descripcion, int codigo, double precio, Medida medida) {
		super();
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.precio = precio;
		this.medida = medida;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public Medida getMedida() {
		return medida;
	}
}