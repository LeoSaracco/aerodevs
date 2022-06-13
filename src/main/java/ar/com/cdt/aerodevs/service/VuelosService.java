package ar.com.cdt.aerodevs.service;

import java.util.List;

import ar.com.cdt.aerodevs.models.Vuelos;

public interface VuelosService {

//	List<Categorias> getAllCategorias();
//	
//	Optional<Categorias> getCategoriasByID(Integer idCategoria);
//
//	Categorias save(DTOCategoria c);
//
//	Categorias update(Categorias c);
//
//	Boolean delete(Integer idCategoria);
	
	List<Vuelos> getAllVuelos();
	Vuelos save (Vuelos vuelos);
}