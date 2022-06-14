package ar.com.cdt.aerodevs.service;

import java.util.Optional;

import ar.com.cdt.aerodevs.dto.DTOReserva;
import ar.com.cdt.aerodevs.models.Reservas;

public interface ReservaService {

	Optional<Reservas> getAllReservaByID(int idReserva);

	DTOReserva save(DTOReserva dto);
	
}