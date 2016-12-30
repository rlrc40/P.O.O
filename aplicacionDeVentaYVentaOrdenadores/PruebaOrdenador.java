package aplicacionDeVentaYVentaOrdenadores;

public class PruebaOrdenador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] puertosValidos = {2,3,1,2};	
		UnidadCentral miUnidadCentral = new UnidadCentral("DELL", "CXS", 150);
		ImpresoraLaser miImpresora = new ImpresoraLaser("HP", "XXSDA", 30, puertosValidos, "Cartucho", 3);
		Raton miRaton = new Raton("Logitech", "XC", 10.50, puertosValidos, "USB");
		Componente [] misComponentes = {miUnidadCentral, miImpresora, miRaton};
		
		Ordenador miOrdenador = new Ordenador(misComponentes);
		
		System.out.println(miOrdenador.getPrecioVenta());
		
		miOrdenador.addPeriferico(new Pantalla("Philips", "XCVAS", 70.30, puertosValidos));
		
		System.out.println(miOrdenador.getPrecioVenta());
	}

}
