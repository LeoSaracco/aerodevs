package ar.com.cdt.aerodevs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.aerodevs.dto.DTOReserva;
import ar.com.cdt.aerodevs.models.Reservas;
import ar.com.cdt.aerodevs.service.ReservaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/aerodevs")
public class ReservaController {

	@Autowired
	ReservaService rs;

	@ApiOperation(value = "Get reserva By ID", notes = "Acceder a contenido si hasRole('USER') o hasRole('MODERATOR') o hasRole('ADMIN').")
	// @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	@GetMapping("/reservas/{idReserva}")
	public Optional<Reservas> getAllVuelos(@PathVariable("idReserva") int idReserva) {
		return rs.getAllReservaByID(idReserva);
	}
	
	@ApiOperation(value = "Save new vuelo", notes = "Acceder a contenido si hasRole('MODERATOR') o hasRole('ADMIN').")
	// @PreAuthorize("hasRole('MODERATOR') or hasRole('ADMIN')")
	@PostMapping("/reservas/saveReserva")
	public ResponseEntity<DTOReserva> saveNewReserva(@RequestBody DTOReserva dto) {
		return new ResponseEntity<DTOReserva>(rs.save(dto), HttpStatus.CREATED);
	}
}
