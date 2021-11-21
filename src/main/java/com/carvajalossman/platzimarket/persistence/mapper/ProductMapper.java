package com.carvajalossman.platzimarket.persistence.mapper;

import com.carvajalossman.platzimarket.domain.Product;
import com.carvajalossman.platzimarket.persistence.entity.Producto;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = { CategoryMapper.class })
public interface ProductMapper {
  @Mappings(
    {
      @Mapping(source = "idProducto", target = "productId"),
      @Mapping(source = "nombre", target = "name"),
      @Mapping(source = "idCategoria", target = "categoryId"),
      @Mapping(source = "precioVenta", target = "price"),
      @Mapping(source = "cantidadStock", target = "stock"),
      @Mapping(source = "estado", target = "active"),
      @Mapping(source = "categoria", target = "category"),
    }
  )
  Product toProduct(Producto producto);

  List<Product> toProducts(List<Producto> productos);

  @InheritInverseConfiguration
  @Mapping(target = "codigoBarras", ignore = true)
  Producto toProducto(Product product);
}
