package ar.com.cdt.aerodevs.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "reservas")
public class Reservas {

	@Id
	@Column(name = "idReserva")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReserva;
	@Column(name = "NombreApellidoPersona", nullable = false)
	private String NombreApellidoPersona;
	@Column(name = "dniPersona", nullable = false)
	private String dniPersona;
	@Column(name = "estadoVueloId", nullable = false)
	private String estadoVueloId;
	@Column(name = "fechaReserva", nullable = false)
	private Date fechaReserva;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vuelo")
	@JsonBackReference
	private Vuelos vuelos;

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getNombreApellidoPersona() {
		return NombreApellidoPersona;
	}

	public void setNombreApellidoPersona(String nombreApellidoPersona) {
		NombreApellidoPersona = nombreApellidoPersona;
	}

	public String getDniPersona() {
		return dniPersona;
	}

	public void setDniPersona(String dniPersona) {
		this.dniPersona = dniPersona;
	}

	public String getEstadoVueloId() {
		return estadoVueloId;
	}

	public void setEstadoVueloId(String estadoVueloId) {
		this.estadoVueloId = estadoVueloId;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Vuelos getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelos vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String toString() {
		return "Reservas [idReserva=" + idReserva + ", NombreApellidoPersona=" + NombreApellidoPersona + ", dniPersona="
				+ dniPersona + ", estadoVueloId=" + estadoVueloId + ", fechaReserva=" + fechaReserva + ", vuelos="
				+ vuelos + "]";
	}
}