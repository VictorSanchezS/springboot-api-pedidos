package tech.cognity.almacen.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.cognity.almacen.entity.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer>{
	List<Articulo> findByNombreContaining(String nombre, Pageable page);
	Articulo findByNombre(String nombre);
}
