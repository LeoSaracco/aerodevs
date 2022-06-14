package ar.com.cdt.aerodevs.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Tabla al estilo de histórico
@Entity
@Table(name = "pasaje")
public class Pasaje {

	@Id
	@Column(name = "idPasaje")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPasaje;

	@Column(name = "idReserva")
	private int idReserva;

	@Column(name = "idVuelo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVuelo;

	@Column(name = "nombreApellidoPersona", nullable = false)
	private String nombreApellidoPersona;

	@Column(name = "dniPersona", nullable = false)
	private String dniPersona;

	@Column(name = "fechaReserva", nullable = false)
	private Date fechaReserva;

	@Column(name = "pagoTotal", nullable = false)
	private Boolean pagoTotal;

	public int getIdPasaje() {
		return idPasaje;
	}

	public void setIdPasaje(int idPasaje) {
		this.idPasaje = idPasaje;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getNombreApellidoPersona() {
		return nombreApellidoPersona;
	}

	public void setNombreApellidoPersona(String nombreApellidoPersona) {
		this.nombreApellidoPersona = nombreApellidoPersona;
	}

	public String getDniPersona() {
		return dniPersona;
	}

	public void setDniPersona(String dniPersona) {
		this.dniPersona = dniPersona;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Boolean getPagoTotal() {
		return pagoTotal;
	}

	public void setPagoTotal(Boolean pagoTotal) {
		this.pagoTotal = pagoTotal;
	}

	@Override
	public String toString() {
		return "Pasaje [idPasaje=" + idPasaje + ", idReserva=" + idReserva + ", idVuelo=" + idVuelo
				+ ", nombreApellidoPersona=" + nombreApellidoPersona + ", dniPersona=" + dniPersona + ", fechaReserva="
				+ fechaReserva + ", pagoTotal=" + pagoTotal + "]";
	}
}