package aplicacionDeVentaYVentaOrdenadores;

/**
 * Implementacion de un componente
 * @author Rnovo
 *
 */
public class Componente{
	private String nombreFabricante;
	private String modelo;
	private double precioDeVenta;
	
	/**
	 * Inicializacion de un componente con nombre de fabricante, modelo y precio
	 * de venta
	 * 
	 * @param nombreFabricante
	 *            nombre del fabricante del componente, no puede ser nulo
	 * @param modelo
	 *            asociado al componente, no puede ser nulo
	 * @param precioDeVenta2
	 *            precio de venta del componente, tiene que ser mayor o igual a
	 *            0
	 */
	public Componente (String nombreFabricante, String modelo, double precioDeVenta){
		assert(nombreFabricante != null);
		assert(modelo != null);
		assert(precioDeVenta >= 0);
		this.nombreFabricante = nombreFabricante;
		this.modelo = modelo;
		this.precioDeVenta = precioDeVenta;
	}
	
	/**
	 * 
	 * @return nombre del fabricante del componente
	 */
	public String getNombreFabricante() {
		return nombreFabricante;
	}

	/**
	 * 
	 * @return modelo del componente
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * 
	 * @return precio de venta del componente
	 */
	public double getPrecioDeVenta() {
		return precioDeVenta;
	}
	
	/**
	 * Cambia el valor del precio de venta de un componente
	 * @param precio nuevo que se le va asignar al componente
	 */
	public void setPrecioDeVenta(float precio){
		precioDeVenta = precio;
	}

}
