package ar.com.cdt.aerodevs.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cdt.aerodevs.dto.DTOVueloStatus;
import ar.com.cdt.aerodevs.models.Vuelos;
import ar.com.cdt.aerodevs.repository.IVuelosRepository;
import ar.com.cdt.aerodevs.service.VuelosService;

@Service
public class VuelosServiceImpl implements VuelosService {

	@Autowired
	IVuelosRepository vuelosRepository;

	@Override
	public List<Vuelos> getAllVuelos() {
		return vuelosRepository.findAll();
	}

	@Override
	public Vuelos save(Vuelos vuelos) {
		return vuelosRepository.save(vuelos);
	}

	@Override
	public Vuelos updateStatus(DTOVueloStatus dto) {
		Vuelos vuelo = vuelosRepository.getById(dto.getIdVuelo());
		vuelo.setEstadoVueloId(dto.getEstadoVuelo());
		return vuelosRepository.save(vuelo);
	}

	@Override
	public Optional<Vuelos> getVuelosByID(Integer idVuelo) {
		return vuelosRepository.findById(idVuelo);
	}
}