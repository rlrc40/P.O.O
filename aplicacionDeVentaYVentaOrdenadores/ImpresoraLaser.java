package aplicacionDeVentaYVentaOrdenadores;

/**
 * Implementacion de una impresora laser
 * 
 * @author Rnovo
 *
 */
public class ImpresoraLaser extends Impresora {

	private int numPagImpresas;

	/**
	 * Inicializacion de una impresora laser
	 * 
	 * @see Impresora#Impresora(String, String, float, int[], String)
	 * @param numPagImpresas
	 *            numero de paginas impresas desde el ultimo cambio de toner
	 */
	public ImpresoraLaser(String nombreFabricante, String modelo, int precioDeVenta, int[] puertosValidos,
			String tipoCartuchoOToner, int numPagImpresas) {
		// TODO Auto-generated constructor stub
		super(nombreFabricante, modelo, precioDeVenta, puertosValidos, tipoCartuchoOToner);
		// TODO Auto-generated constructor stub
		this.numPagImpresas = numPagImpresas;
	}

	/**
	 * 
	 * @return el numero de paginas impresas desde el ultimo cambio de toner
	 */
	public int getNumPagImpresas() {
		return numPagImpresas;
	}
}
