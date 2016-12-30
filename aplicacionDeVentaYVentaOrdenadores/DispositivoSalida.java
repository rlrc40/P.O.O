package aplicacionDeVentaYVentaOrdenadores;

/**
 * Implementacion de un periferico dispositivo de salida
 * 
 * @author Rnovo
 *
 */
public class DispositivoSalida extends Periferico {

	/**
	 * Inicializacion de un periferico dispositivo de salida con nombre de
	 * fabricante, modelo, precio de venta, puertos validos
	 * 
	 * @see Periferico#Periferico(String, String, float, int[])
	 */
	public DispositivoSalida(String nombreFabricante, String modelo, double precioDeVenta, int[] puertosValidos) {
		// TODO Auto-generated constructor stub
		super(nombreFabricante, modelo, precioDeVenta, puertosValidos);
	}

}
