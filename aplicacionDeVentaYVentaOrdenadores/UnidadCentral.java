package aplicacionDeVentaYVentaOrdenadores;

/**
 * Implementacion de una unidad central
 * 
 * @author Rnovo
 *
 */
public class UnidadCentral extends Componente {

	/**
	 * Inicializacion de un componente unidad central con nombre de fabricante,
	 * modelo y precio de venta
	 * 
	 * @see Componente#Componente(String, String, float)
	 */
	public UnidadCentral(String nombreFabricante, String modelo, float precioDeVenta) {
		super(nombreFabricante, modelo, precioDeVenta);
	}
}
