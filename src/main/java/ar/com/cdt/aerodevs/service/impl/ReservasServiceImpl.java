package ar.com.cdt.aerodevs.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cdt.aerodevs.dto.DTOReserva;
import ar.com.cdt.aerodevs.models.Reservas;
import ar.com.cdt.aerodevs.models.Vuelos;
import ar.com.cdt.aerodevs.repository.IReservasRepository;
import ar.com.cdt.aerodevs.repository.IVuelosRepository;
import ar.com.cdt.aerodevs.service.ReservaService;

@Service
public class ReservasServiceImpl implements ReservaService {

	@Autowired
	IReservasRepository reservasRepository;

	@Autowired
	IVuelosRepository vuelosRepository;

	@Override
	public Optional<Reservas> getAllReservaByID(int idReserva) {
		return reservasRepository.findById(idReserva);
	}

	@Override
	public DTOReserva save(DTOReserva dto) {

		Reservas r = new Reservas();
		r.setDniPersona(dto.getDniPersona());
		r.setNombreApellidoPersona(dto.getNombreApellidoPersona());
		r.setFechaReserva(dto.getFechaReserva());
		r.setPagoParcial(dto.getPagoParcial());
		// Seteo el vuelo
		Vuelos v = new Vuelos();
		v.setVueloId(dto.getIdVuelo());
		r.setVuelos(v);

		reservasRepository.save(r);
		// Seteo el id de la reserva
		dto.setIdReserva(r.getIdReserva());
		return dto;
	}

}