package ejercicios_POO;

import java.util.Formatter;

/**
 * Implementacion basica de un reloj digital
 * 
 * @author Raul
 *
 */
public class Reloj {
	private int segundos;
	private int minutos;
	private int horas;

	/**
	 * Inicializacion de un reloj con horas, minutos, y segundos.
	 * 
	 * @param segundos
	 *            va contando los segundos, tiene que ser mayor que 0 y menor
	 *            que 61
	 * @param minutos
	 *            va contando los minutos, tiene que ser mayor que 0 y menor que
	 *            61
	 * @param horas
	 *            va contando las horas, tiene que ser mayor que 0 y menor que
	 *            25
	 * 
	 * @assert.pre segundos mayor o igual que 0
	 * @assert.pre segundos menor que 60
	 * @assert.pre minutos mayor o igual que 0
	 * @assert.pre minutos menor que 60
	 * @assert.pre horas mayor o igual que 0
	 * @assert.pre horas menor que 24
	 */
	public Reloj(int horas, int minutos, int segundos) {
		assert (segundos >= 0);
		assert (segundos < 60);
		assert (minutos >= 0);
		assert (minutos < 60);
		assert (horas >= 0);
		assert (horas < 24);

		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;
	}

	/**
	 * Inicializacion de un reloj desde 0
	 */
	public Reloj() {
		this.segundos = 0;
		this.minutos = 0;
		this.horas = 0;
	}

	/**
	 * Incrementa una unidad a los segundos
	 */
	public void incrementarSegundos() {
		segundos += 1;
	}

	/**
	 * Incrementa una unidad a los minutos
	 */
	public void incrementarMinutos() {
		minutos += 1;
	}

	/**
	 * Incrementa una unidad a las horas
	 */
	public void incrementarHoras() {
		horas += 1;
	}

	/**
	 * comprueba los segundos
	 * 
	 * @return true si los segundos son correctos, false en su defecto
	 */
	public boolean comprobarSegundos() {
		if (segundos == 60) {
			return false;
		}
		return true;
	}

	/**
	 * comprueba los minutos
	 * 
	 * @return true si los minutos son correctos, false en su defecto
	 */
	public boolean comprobarMinutos() {
		if (minutos == 60) {
			return false;
		}
		return true;
	}

	/**
	 * comprueba las horas
	 * 
	 * @return true si las horas son correctos, false en su defecto
	 */
	public boolean comprobarHoras() {
		if (horas == 24) {
			return false;
		}
		return true;
	}

	/**
	 * Pone el reloj a 0
	 */
	public void Reset() {
		setSegundos(0);
		setMinutos(0);
		setHoras(0);
	}

	/**
	 * pone en hora el reloj en cuestion
	 * 
	 * @param s
	 *            segundos que vamos a establecer
	 * @param m
	 *            minutos que vamos a establecer
	 * @param h
	 *            horas que vamos a establecer
	 * 
	 * @assert.pre s mayor o igual que 0
	 * @assert.pre s menor que 60
	 * @assert.pre m mayor o igual que 0
	 * @assert.pre m menor que 60
	 * @assert.pre h mayor o igual que 0
	 * @assert.pre h menor que 24
	 * 
	 */
	public void ponerEnHora(int s, int m, int h) {
		assert (s >= 0);
		assert (s < 60);
		assert (m >= 0);
		assert (m < 60);
		assert (h >= 0);
		assert (h < 24);
		setSegundos(s);
		setMinutos(m);
		setHoras(h);
	}

	/**
	 * Devuelve un S tring con la hora en ese momento
	 * 
	 * @return la hora en ese momento
	 */
	@Override
	public String toString() {
		@SuppressWarnings("resource")
		Formatter hor = new Formatter();
		@SuppressWarnings("resource")
		Formatter min = new Formatter();
		@SuppressWarnings("resource")
		Formatter seg = new Formatter();
		hor.format("%02d", getHoras());
		min.format("%02d", getMinutos());
		seg.format("%02d", getSegundos());
		return (hor + ":" + min + ":" + seg);
	}

	public void run() throws InterruptedException {
		while (true) {
			incrementarSegundos();
			if (!comprobarSegundos()) {
				setSegundos(0);
				incrementarMinutos();
			}
			if (!comprobarMinutos()) {
				setMinutos(0);
				incrementarHoras();
			}
			if (!comprobarHoras()) {
				setHoras(0);
			}
			System.out.println(toString());
			Thread.sleep(1000);
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
}
