package ar.com.cdt.aerodevs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.aerodevs.models.Pasaje;
import ar.com.cdt.aerodevs.service.PasajeService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/aerodevs")
public class PasajeController {

	@Autowired
	PasajeService ps;

	@ApiOperation(value = "Save new pasaje", notes = "Acceder a contenido si hasRole('MODERATOR') o hasRole('ADMIN').")
	// @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	@PostMapping("/pasajes/{idReserva}/{pagoTotal}")
	public ResponseEntity<Pasaje> saveNewPasaje(@PathVariable("idReserva") int idReserva,
			@PathVariable("pagoTotal") Boolean pagoTotal) {
		return new ResponseEntity<Pasaje>(ps.save(idReserva, pagoTotal), HttpStatus.CREATED);
	}
}
