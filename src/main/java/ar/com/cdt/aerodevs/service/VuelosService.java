package ar.com.cdt.aerodevs.service;

import java.util.List;
import java.util.Optional;

import ar.com.cdt.aerodevs.dto.DTOVuelo;
import ar.com.cdt.aerodevs.dto.DTOVueloStatus;
import ar.com.cdt.aerodevs.models.Vuelos;

public interface VuelosService {

	List<Vuelos> getAllVuelos();

	DTOVuelo save(DTOVuelo vuelos);

	Vuelos updateStatus(DTOVueloStatus dto);

	Optional<Vuelos> getVuelosByID(Integer idVuelo);
	
	List<Vuelos> getVuelosByEstado(String estado);
	
}