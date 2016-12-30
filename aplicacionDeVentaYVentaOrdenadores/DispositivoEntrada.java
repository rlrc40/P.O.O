package aplicacionDeVentaYVentaOrdenadores;

/**
 * Implementacion de un periferico dispositivo de entrada
 * 
 * @author Rnovo
 *
 */
public class DispositivoEntrada extends Periferico {

	private String tipoConector;

	/**
	 * Inicializacion de un periferico dispositivo de entrada con nombre de fabricante,
	 * modelo, precio de venta, puertos validos, y tipo de conector
	 * @see Periferico#Periferico(String, String, float, int[])
	 * @param tipoConector tipo de conector que usa el dispositivo de entrada
	 * @assert.pre tipoConector != null
	 */
	public DispositivoEntrada(String nombreFabricante, String modelo, double precioDeVenta, int[] puertosValidos,
			String tipoConector) {
		super(nombreFabricante, modelo, precioDeVenta, puertosValidos);
		assert (tipoConector != null);
		this.tipoConector = tipoConector;
	}
	
	/**
	 * 
	 * @return tipo de conector del dispositivo de entrada
	 */
	public String getTipoConector(){
		return tipoConector;
	}
}
