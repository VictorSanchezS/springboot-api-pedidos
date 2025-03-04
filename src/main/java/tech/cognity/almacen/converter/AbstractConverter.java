package tech.cognity.almacen.converter;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractConverter<E,D> {
	public abstract D fromEntity(E entity);
	public abstract E fromDTO(D dto);
	
	public List<D> fromEntity(List<E> entities){
		return entities.stream()
				.map(e -> fromEntity(e))
				.collect(Collectors.toList());
	}
	
	public List<E> fromDTO(List<D> dtos){
		return dtos.stream()
				.map(e -> fromDTO(e))
				.collect(Collectors.toList());
	}
}
