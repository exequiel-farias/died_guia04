package died.guia04.ejercicio02;

public class DetallePedido {
	private Producto producto;
	private double cantidad;

	public DetallePedido(Producto producto, double cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public double precio() {
		return producto.getPrecio() * cantidad;
	}

	public Producto getProducto() {
		return producto;
	}
	
	public double getCantidad() {
		return cantidad;
	}
}