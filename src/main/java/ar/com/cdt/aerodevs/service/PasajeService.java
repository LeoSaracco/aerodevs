package ar.com.cdt.aerodevs.service;

import ar.com.cdt.aerodevs.models.Pasaje;

public interface PasajeService {

	Pasaje save (int idReserva, Boolean pagoTotal);
	
}
