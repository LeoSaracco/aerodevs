package ar.com.cdt.aerodevs.dto;

import java.sql.Date;

public class DTOReserva {

	private int idReserva;
	
	private String NombreApellidoPersona;

	private String dniPersona;

	private Date fechaReserva;

	private int idVuelo;

	private Boolean pagoParcial;

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

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Boolean getPagoParcial() {
		return pagoParcial;
	}

	public void setPagoParcial(Boolean pagoParcial) {
		this.pagoParcial = pagoParcial;
	}

	@Override
	public String toString() {
		return "DTOReserva [idReserva=" + idReserva + ", NombreApellidoPersona=" + NombreApellidoPersona
				+ ", dniPersona=" + dniPersona + ", fechaReserva=" + fechaReserva + ", idVuelo=" + idVuelo
				+ ", pagoParcial=" + pagoParcial + "]";
	}
}