package died.guia04.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<DetallePedido> detalles = new ArrayList<DetallePedido>();
	private Cliente cliente;
	
	public Pedido(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public double precioSubtotal() {
		double subtotal = 0;
		for(DetallePedido unDetalle : this.detalles) subtotal += unDetalle.precio();
		return subtotal;
	}
	
	public double precioTotal() {
		return (cliente.esConsumidorFinal()) ? precioSubtotal() * 1.21 : precioSubtotal();
	}
	
	public void addProducto(Producto producto, double cantidad) {
		detalles.add(new DetallePedido(producto, cantidad));
	}
	
	public int cantidadProductos() {
		return detalles.size();
	}
	
	public List<DetallePedido> getDetallesPedidos(){
		return detalles;
	}
}