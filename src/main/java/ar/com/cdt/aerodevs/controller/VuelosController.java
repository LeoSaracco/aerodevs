package ar.com.cdt.aerodevs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.aerodevs.dto.DTOVuelo;
import ar.com.cdt.aerodevs.dto.DTOVueloStatus;
import ar.com.cdt.aerodevs.models.Vuelos;
import ar.com.cdt.aerodevs.service.VuelosService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/aerodevs")
public class VuelosController {

	@Autowired
	VuelosService vs;

	@ApiOperation(value = "Get vuelos", notes = "Acceder a contenido si hasRole('USER') o hasRole('MODERATOR') o hasRole('ADMIN').")
	// @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	@GetMapping("/vuelos/getAllVuelos")
	public List<Vuelos> getAllVuelos() {
		return vs.getAllVuelos();
	}

	@ApiOperation(value = "Save new vuelo", notes = "Acceder a contenido si hasRole('MODERATOR') o hasRole('ADMIN').")
	// @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	@PostMapping("/vuelos/saveVuelo")
	public ResponseEntity<DTOVuelo> saveNewVuelo(@RequestBody DTOVuelo vuelos) {
		return new ResponseEntity<DTOVuelo>(vs.save(vuelos), HttpStatus.CREATED);
	}

	@ApiOperation(value = "Update estado del vuelo", notes = "Acceder a contenido si hasRole('MODERATOR') o hasRole('ADMIN').")
	// @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	@PutMapping("/vuelos/updateEstadoVuelo")
	public ResponseEntity<Vuelos> updateStateVuelo(@RequestBody DTOVueloStatus dto) {
		return new ResponseEntity<Vuelos>(vs.updateStatus(dto), HttpStatus.CREATED);
	}

	@ApiOperation(value = "Get vuelos según ID", notes = "Acceder a contenido si hasRole('MODERATOR') o hasRole('ADMIN').")
	// @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	@GetMapping("/vuelos/{idVuelo}")
	public Optional<Vuelos> getVueloByID(@PathVariable("idVuelo") int idVuelo) {
		return vs.getVuelosByID(idVuelo);
	}
	
	@ApiOperation(value = "Get vuelos según estado", notes = "Acceder a contenido si hasRole('MODERATOR') o hasRole('ADMIN').")
	// @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	@GetMapping("/vuelos/estado/{estado}")
	public List<Vuelos> getVueloByID(@PathVariable("estado") String estado) {
		return vs.getVuelosByEstado(estado);
	}
}