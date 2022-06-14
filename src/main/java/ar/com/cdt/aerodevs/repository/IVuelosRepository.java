package ar.com.cdt.aerodevs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.com.cdt.aerodevs.models.Vuelos;

@Repository
public interface IVuelosRepository extends JpaRepository<Vuelos, Integer> {
	
	@Query(nativeQuery = true, value = "SELECT v.* FROM vuelos v WHERE v.estado_vuelo_id=:estado")
	List<Vuelos> findByEstado(@Param("estado") String estado);
}