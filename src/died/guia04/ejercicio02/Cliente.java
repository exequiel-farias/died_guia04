package died.guia04.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String email;
	private long cuit;
	private boolean consumidorFinal;
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private Pedido pedidoActual = null;
	
	public Cliente(String nombre, String email, long cuit, boolean consumidorFinal) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.cuit = cuit;
		this.consumidorFinal = consumidorFinal;
	}
	
	public boolean esConsumidorFinal() {
		return consumidorFinal;
	}
	
	public double costoPromedioPedido() {
		double suma = 0;
		for(Pedido unPedido : pedidos) {
			suma += unPedido.precioTotal();
		}
		double promedio = suma / pedidos.size();
		return promedio;
	}
	
	public boolean iniciarPedido() {
		if(pedidoActual != null) return false;
		pedidoActual = new Pedido(this);
		return true;
	}
	
	public boolean agregarProducto(Producto producto, double cantidad) {
		if(pedidoActual == null) return false;
		pedidoActual.addProducto(producto, cantidad);
		return true;
	}
	
	public boolean confirmarPedido() {
		if(pedidoActual != null && pedidoActual.cantidadProductos() != 0) {
			pedidos.add(pedidoActual);
			pedidoActual = null;
			return true;
		}
		return false;
	}
	
	public String productoMasComprado() {
		double maxCant = 0;
		DetallePedido masComprado = null;
		for(Pedido unPedido : pedidos) {
			for(DetallePedido unDetalle : unPedido.getDetallesPedidos()) {
				if(unDetalle.getCantidad() > maxCant) {
					maxCant = unDetalle.getCantidad();
					masComprado = unDetalle;
				}
			}
		}
		return "El producto más comprado son "+masComprado.getCantidad()+
				" "+masComprado.getProducto().getMedida()+" de "+masComprado.getProducto().getDescripcion();
	}
}