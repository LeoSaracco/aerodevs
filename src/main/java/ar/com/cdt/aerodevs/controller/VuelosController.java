package ar.com.cdt.aerodevs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.aerodevs.models.Vuelos;
import ar.com.cdt.aerodevs.service.VuelosService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/aerodevs")
public class VuelosController {

	@Autowired
	VuelosService vs;
	
	@ApiOperation(value = "access User’s content", notes = "Acceder a contenido si hasRole('USER') o hasRole('MODERATOR') o hasRole('ADMIN').")
	//@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	@GetMapping("/vuelos/getAllVuelos")
	public List<Vuelos> getAllVuelos(){
		return vs.getAllVuelos();
	}
	
	
	@ApiOperation(value = "access User’s content", notes = "Acceder a contenido si hasRole('MODERATOR') o hasRole('ADMIN').")
	//@PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	@PostMapping("/saveVuelo")
	public ResponseEntity<Vuelos> saveNewVuelo(@RequestBody Vuelos vuelos) {
		return new ResponseEntity<Vuelos>(vs.save(vuelos), HttpStatus.CREATED);
	}
}
