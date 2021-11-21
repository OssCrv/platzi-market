package com.carvajalossman.platzimarket.persistence.crud;

import com.carvajalossman.platzimarket.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository
  extends CrudRepository<Producto, Integer> {
  //@Query(value= "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
  List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

  Optional<List<Producto>> findByCantidadStockLessThanAndEstado(
    int cantidadStock,
    boolean estado
  );
}
