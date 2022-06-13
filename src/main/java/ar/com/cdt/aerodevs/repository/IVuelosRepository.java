package ar.com.cdt.aerodevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.cdt.aerodevs.models.Vuelos;

@Repository
public interface IVuelosRepository extends JpaRepository<Vuelos, Integer> {

}