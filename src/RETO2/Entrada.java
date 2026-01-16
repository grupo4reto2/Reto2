package RETO2;

public class Entrada {

	private int idEntrada;
	private Sesion Sesion;
	private int numPersonas;
	private Compra IDCompra;
	
	public Entrada (int idEntrada, Sesion Sesion, int numPersonas, Compra IDCompra) {
		this.idEntrada = idEntrada;
		this.sesion = sesion;
		this.numPersonas = numPersonas;
		this.idCompra = idCompra;
	}

	public Compra getIDCompra() {
		return idCompra;
	}

	public void setIDCompra(Compra idCompra) {
		this.idCompra = idCompra;
	}

		
	public int getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion Sesion) {
		this.sesion = sesion;
	}

	
	public int getnumPersonas() {
		return numPersonas;
	}

	public void setnumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	
	@Override 
	
	public String toString() {
		
		return "ID entrada: " + idEntrada +
			   " Sesión: " + sesion.getSesion() +
			   " Número de personas: " + numPersonas + 
				" ID de Compra: " + compra.getIDCompra();
			 
	}
	
}
