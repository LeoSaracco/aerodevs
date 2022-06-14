package ar.com.cdt.aerodevs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cdt.aerodevs.models.Pasaje;
import ar.com.cdt.aerodevs.models.Reservas;
import ar.com.cdt.aerodevs.repository.IPasajesRepository;
import ar.com.cdt.aerodevs.repository.IReservasRepository;
import ar.com.cdt.aerodevs.service.PasajeService;

@Service
public class PasajeServiceImpl implements PasajeService {

	@Autowired
	IPasajesRepository pasajesRepository;

	@Autowired
	IReservasRepository reservasRepository;

	@Override
	public Pasaje save(int idReserva, Boolean pagoTotal) {
		Reservas aux = reservasRepository.findByID(idReserva);
		Pasaje p = new Pasaje();
		p.setDniPersona(aux.getDniPersona());
		p.setNombreApellidoPersona(aux.getNombreApellidoPersona());
		p.setIdReserva(aux.getIdReserva());
		p.setFechaReserva(aux.getFechaReserva());
		p.setIdVuelo(aux.getVuelos().getVueloId());
		p.setPagoTotal(pagoTotal);
		try {
			// Guardo en la tabla pasaje a modo de histórico
			p = pasajesRepository.save(p);
			Reservas r = new Reservas();
			r.setIdReserva(idReserva);
			// Eliminar reserva
			reservasRepository.delete(r);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return pasajesRepository.save(p);
	}
}