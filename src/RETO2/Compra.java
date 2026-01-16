package RETO2;

import java.time.LocalDateTime;

public class Compra {

	private int idCompra;

	private Entrada numEntradas;

	private Cliente cliente;

	private  Cliente dniCliente;

	private LocalDateTime fechaHora;

	private double descuento;

	private double importe;

	
	public Compra (int idCompra, Entrada numEntradas, Cliente cliente, Cliente dniCliente, LocalDateTime fechaHora, double precio, double descuento, double importe) {

		this.idCompra = idCompra;

		this.numEntradas = numEntradas;

		this.cliente = cliente;

		this.dniCliente = dniCliente

		this.fechaHora = fechaHora;

		this.descuento = descuento;

		this.importe = importe;

	}

	
	public int getIdCompra() {
		return idCompra;

	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;

	}

	public Entrada getNumEntradas() {
		return numEntradas;

	}

	public void setNumEntradas(Entrada numEntradas) {
		this.numEntradas = numEntradas;

	}

	public Cliente getCliente() {
		return cliente;

	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;

	}

	public Cliente getDNICliente() {
		return cliente;

	}

	public void setDNICliente(Cliente dniCliente) {
		this.dniCliente = dniCliente;

	}

	public LocalDateTime getFechaHora() {
		return fechaHora;

	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;

	}

	public double getPrecio() {
		return precio;

	}

	public void setPrecio(double precio) {
		this.precio = precio;

	}

	public double getDescuento() {
		return descuento;
	}
	
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getImporte() {
		return importe;
	}
	
	public void setDescuento(double descuento) {
		this.importe = importe;
	}

	@Override 

	public String toString() {
		
		return "ID compra: " + idCompra +
				" Número entradas: " + numEntradas.getNumEntradas() + 
				" Cliente: " + cliente.getNombre() + cliente.getApellido() +
				" DNICliente: " + dniCliente.getdniCliente() +
				" Fecha y hora de la compra: " + fechaHora.getFechaHora () +
				" Importe de la compra: " + importe +
				" Descuento aplicado: " + descuento;
				
	}

}
