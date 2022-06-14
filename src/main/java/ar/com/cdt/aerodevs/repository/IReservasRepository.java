package ar.com.cdt.aerodevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.com.cdt.aerodevs.models.Reservas;

@Repository
public interface IReservasRepository extends JpaRepository<Reservas, Integer> {
	@Query(nativeQuery = true, value = "SELECT r.* FROM reservas r WHERE r.id_reserva=:idReserva")
	Reservas findByID(@Param("idReserva") int idReserva);

}