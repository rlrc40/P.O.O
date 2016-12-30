package aplicacionDeVentaYVentaOrdenadores;

import java.util.ArrayList;

/**
 * Implementacion de un ordenador
 * 
 * @author Rnovo
 *
 */
public class Ordenador {
	private ArrayList<Componente> componentes;
	private double precioVenta;

	/**
	 * Inicializacion de un ordenador con componentes y precio de venta
	 * 
	 * @param componentes
	 *            array formado por componentes, minimo una unidad central, un
	 *            periferico de salida y otro de entrada
	 * @param precioVenta
	 *            precio total del ordenador, suma de todos los precios de los
	 *            componentes, tiene que ser mayor que 0
	 */
	public Ordenador(Componente[] componentes) {
		assert (contieneDispositivoEntrada(componentes));
		assert (contieneDispositivoSalida(componentes));
		assert (contieneUnidadCentral(componentes));
		assert (sumaDePrecios() > 0);
		this.componentes = volcar(componentes);
		this.precioVenta = sumaDePrecios();
	}

	/**
	 * Aniade un periferico de entrada o salida a los componentes del ordenador
	 * 
	 * @param periferico
	 *            periferico que deseamos aniadir a los componentes
	 */
	public void addPeriferico(Periferico periferico) {
		componentes.add(periferico);
	}

	/**
	 * Elimina un periferico de entrada o salida a los componentes del ordenador
	 * 
	 * @param periferico
	 *            periferico que deseamos eliminar de los componentes
	 */
	public void removePeriferico(Periferico periferico) {
		componentes.remove(periferico);
	}
	
	/**
	 * 
	 * @return suma de los precios de los componentes del ordenador
	 */
	private double sumaDePrecios() {
		double total = 0;
		for (int i = 0; i < componentes.size(); i++) {
			total += componentes.get(i).getPrecioDeVenta();
		}
		return total;
	}

	/* Vuelca el contenido del array de puertos en el arraylist de puertos */
	private ArrayList<Componente> volcar(Componente[] componentes) {
		ArrayList<Componente> a = new ArrayList<Componente>();
		for (int i = 0; i < componentes.length; i++) {
			a.add(componentes[i]);
		}
		return a;
	}

	private boolean contieneDispositivoSalida(Componente[] componentes) {
		for (int i = 0; i < componentes.length; i++) {
			if (componentes[i] instanceof DispositivoSalida) {
				return true;
			}
		}
		return false;
	}

	private boolean contieneDispositivoEntrada(Componente[] componentes) {
		for (int i = 0; i < componentes.length; i++) {
			if (componentes[i] instanceof DispositivoEntrada) {
				return true;
			}
		}
		return false;
	}

	private boolean contieneUnidadCentral(Componente[] componentes) {
		for (int i = 0; i < componentes.length; i++) {
			if (componentes[i] instanceof UnidadCentral) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}
	
	/**
	 * 
	 * @return el precio de venta del ordenador
	 */
	public double getPrecioVenta () {
		return sumaDePrecios();
	}
	
	/**
	 * Establece un nuevo precio de venta
	 */
	public void setPrecioVenta () {
		precioVenta = sumaDePrecios();
	}


	

}
