package RETO2;
import java.time.LocalDateTime;
public class Sesion {

	private int id;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private int sala ;
	private double precio;
	private String pelicula;
	
	
	public Sesion (int id, LocalDateTime fechaInicio, LocalDateTime fechaFin, int sala, double precio, String pelicula) {
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.sala = sala;
		this.precio = precio;
		this.pelicula = pelicula;
	
}


	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public LocalDateTime getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}


	public int getSala() {
		return sala;
	}


	public void setSala(int sala) {
		this.sala = sala;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getPelicula() {
		return pelicula;
	}


	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	@Override
	
	public String toString() {
		return "ID: " + id + " Inicio: " + fechaInicio + " Fin: " + fechaFin + " Sala: " + sala + " Precio: " + precio + " Película: " + pelicula;
	}
	
}