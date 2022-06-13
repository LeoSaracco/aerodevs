package ar.com.cdt.aerodevs.dto;

public class DTOVueloStatus {

	private int idVuelo;
	private String estadoVuelo;

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getEstadoVuelo() {
		return estadoVuelo;
	}

	public void setEstadoVuelo(String estadoVuelo) {
		this.estadoVuelo = estadoVuelo;
	}

	@Override
	public String toString() {
		return "DTOVueloStatus [idVuelo=" + idVuelo + ", estadoVuelo=" + estadoVuelo + "]";
	}
}