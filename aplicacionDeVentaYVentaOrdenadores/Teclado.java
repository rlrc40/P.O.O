package aplicacionDeVentaYVentaOrdenadores;

/**
 * Implementacion de un dispositivo de entrada teclado
 * @author Rnovo
 *
 */
public class Teclado extends DispositivoEntrada {

	/**
	 * Inicializacion de un teclado con nombre de fabricante,
	 * modelo, precio de venta, puertos validos, y tipo de conector
	 * @see DispositivoEntrada#DispositivoEntrada(String, String, float, int[], String)
	 */
	public Teclado(String nombreFabricante, String modelo, float precioDeVenta, int[] puertosValidos,
			String tipoConector) {
		super(nombreFabricante, modelo, precioDeVenta, puertosValidos, tipoConector);
		// TODO Auto-generated constructor stub
	}

}
