package aplicacionDeVentaYVentaOrdenadores;

/**
 * Implementacion de un dispositivo de entrada Raton
 * @author Rnovo
 *
 */
public class Raton extends DispositivoEntrada {

	/**
	 * Inicializacion de un Raton con nombre de fabricante,
	 * modelo, precio de venta, puertos validos, y tipo de conector
	 * @see DispositivoEntrada#DispositivoEntrada(String, String, float, int[], String)
	 */
	public Raton(String nombreFabricante, String modelo, double precioDeVenta, int[] puertosValidos,
			String tipoConector) {
		super(nombreFabricante, modelo, precioDeVenta, puertosValidos, tipoConector);
		// TODO Auto-generated constructor stub
	}

}
