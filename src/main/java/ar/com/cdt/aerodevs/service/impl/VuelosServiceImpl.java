package ar.com.cdt.aerodevs.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.cdt.aerodevs.dto.DTOVuelo;
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
	public DTOVuelo save(DTOVuelo dto) {
		Vuelos v = new Vuelos();
		v.setAeropuertoOrigen(dto.getAeropuertoOrigen());
		v.setAeropuertoDestino(dto.getAeropuertoDestino());
		v.setCapacidad(dto.getCapacidad());
		v.setCodigoMoneda(dto.getCodigoMoneda());
		v.setEstadoVueloId(dto.getEstadoVueloId());
		v.setFecha(dto.getFecha());
		v.setPrecio(dto.getPrecio());
		//Obtengo lo generado
		v = vuelosRepository.save(v);
		dto.setVueloId(v.getVueloId());
		return dto;
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

	@Override
	public List<Vuelos> getVuelosByEstado(String estado) {
		return vuelosRepository.findByEstado(estado);
	}
}