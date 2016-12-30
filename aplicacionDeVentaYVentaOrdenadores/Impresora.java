package aplicacionDeVentaYVentaOrdenadores;

public class Impresora extends DispositivoSalida {
	private String tipoCartuchoOToner;

	/**
	 * Inicializacion de una impresora con nombre de fabricante,
	 * modelo, precio de venta, puertos validos, tipo de cartucho o toner
	 * @see DispositivoSalida#DispositivoSalida(String, String, float, int[])
	 * @param tipoCartuchoOToner tipo de cartucho o toner utilizado
	 * @assert.pre tipoCartuchoOToner != null
	 */
	public Impresora(String nombreFabricante, String modelo, double precioDeVenta, int[] puertosValidos,
			String tipoCartuchoOToner) {
		super(nombreFabricante, modelo, precioDeVenta, puertosValidos);
		assert (tipoCartuchoOToner != null);
		this.tipoCartuchoOToner = tipoCartuchoOToner;
	}

	/**
	 * 
	 * @return tipo de cartucho o toner utilizado en la impresora
	 */
	public String getTipoCartuchoOToner() {
		return tipoCartuchoOToner;
	}

}
