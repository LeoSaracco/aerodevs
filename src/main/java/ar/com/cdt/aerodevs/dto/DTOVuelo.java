package ar.com.cdt.aerodevs.dto;

import java.sql.Date;

public class DTOVuelo {

	private int vueloId;

	private String aeropuertoDestino;

	private String aeropuertoOrigen;

	private int capacidad;

	private String codigoMoneda;

	private String estadoVueloId;

	private Date fecha;

	private int precio;

	public int getVueloId() {
		return vueloId;
	}

	public void setVueloId(int vueloId) {
		this.vueloId = vueloId;
	}

	public String getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(String aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public String getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(String aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getCodigoMoneda() {
		return codigoMoneda;
	}

	public void setCodigoMoneda(String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}

	public String getEstadoVueloId() {
		return estadoVueloId;
	}

	public void setEstadoVueloId(String estadoVueloId) {
		this.estadoVueloId = estadoVueloId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "DTOVuelo [vueloId=" + vueloId + ", aeropuertoDestino=" + aeropuertoDestino + ", aeropuertoOrigen="
				+ aeropuertoOrigen + ", capacidad=" + capacidad + ", codigoMoneda=" + codigoMoneda + ", estadoVueloId="
				+ estadoVueloId + ", fecha=" + fecha + ", precio=" + precio + "]";
	}
}