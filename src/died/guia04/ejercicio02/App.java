package died.guia04.ejercicio02;

public class App {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("exequiel","exequiel-farias@outlook.com",11111111111L,true);
		if(cliente.iniciarPedido()) System.out.println("Se inició un pedido");
		
		Producto agua = new Producto("agua",1,50,Medida.LITRO);
		Producto pan = new Producto("pan",2,100,Medida.KILO);
		Producto carne = new Producto("carne",3,500,Medida.KILO);
		
		if(cliente.agregarProducto(agua, 1)) System.out.println("Se agregó un producto");
		if(cliente.agregarProducto(pan, 2)) System.out.println("Se agregó un producto");
		if(cliente.agregarProducto(carne, 3)) System.out.println("Se agregó un producto");
		
		if(cliente.confirmarPedido()) System.out.println("Se confirmó el pedido");
		
		System.out.println("El costo promedio pedido "+cliente.costoPromedioPedido());
		
		System.out.println(cliente.productoMasComprado());
	}
}