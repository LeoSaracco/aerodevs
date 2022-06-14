package ar.com.cdt.aerodevs.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "vuelos")
public class Vuelos {
	@Id
	@Column(name = "id_vuelo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vueloId;
	@Column(name = "aeropuertoDestino", nullable = false)
	private String aeropuertoDestino;
	@Column(name = "aeropuertoOrigen", nullable = false)
	private String aeropuertoOrigen;
	@Column(name = "capacidad", nullable = false)
	private int capacidad;
	@Column(name = "codigoMoneda", nullable = false)
	private String codigoMoneda;
	@Column(name = "estadoVueloId", nullable = false, columnDefinition = "varchar(255) default 'ABIERTO'")
	private String estadoVueloId;
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	@Column(name = "precio", nullable = false)
	private int precio;

	@OneToMany(mappedBy = "vuelos", cascade = { CascadeType.ALL, CascadeType.REMOVE }, orphanRemoval = true)
	@JsonManagedReference
	private List<Reservas> reservas = new ArrayList<>();

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

	public List<Reservas> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reservas> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Vuelos [vueloId=" + vueloId + ", aeropuertoDestino=" + aeropuertoDestino + ", aeropuertoOrigen="
				+ aeropuertoOrigen + ", capacidad=" + capacidad + ", codigoMoneda=" + codigoMoneda + ", estadoVueloId="
				+ estadoVueloId + ", fecha=" + fecha + ", precio=" + precio + ", reservas=" + reservas + "]";
	}
}