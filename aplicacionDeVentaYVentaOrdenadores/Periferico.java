package aplicacionDeVentaYVentaOrdenadores;

import java.util.ArrayList;

/**
 * Implementacion de un componente periferico
 * 
 * @author Rnovo
 *
 */
public class Periferico extends Componente {
	private ArrayList<Integer> puertosValidos;

	/**
	 * Inicializacion de un componente periferico con nombre de fabricante,
	 * modelo, precio de venta y puertos validos
	 * @see Componente#Componente(String, String, float)
	 * @param puertosValidos
	 *            array de enteros que contiene los puertos validos del periferico 
	 * @assert.pre(puertosValidos.length != 0)
	 */
	public Periferico(String nombreFabricante, String modelo, double precioDeVenta, int[] puertosValidos) {
		super(nombreFabricante, modelo, precioDeVenta);
		assert (puertosValidos.length != 0);
		this.puertosValidos = volcar(puertosValidos);
	}


	/* Vuelca el contenido del array de puertos en el arraylist de puertos */
	private ArrayList<Integer> volcar(int[] puertos) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < puertos.length; i++) {
			a.add(puertos[i]);
		}
		return a;
	}
	
	public ArrayList<Integer> getPuertosValidos() {
		return puertosValidos;
	}

}
