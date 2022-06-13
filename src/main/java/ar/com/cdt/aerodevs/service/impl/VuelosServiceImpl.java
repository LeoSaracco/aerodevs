package ar.com.cdt.aerodevs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}