package ar.com.cdt.aerodevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.cdt.aerodevs.models.Reservas;

@Repository
public interface IReservasRepository extends JpaRepository<Reservas, Integer> {
}