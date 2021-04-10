package com.carvajalossman.platzimarket.persistence.mapper;

import com.carvajalossman.platzimarket.domain.PurchaseItem;
import com.carvajalossman.platzimarket.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProducto" , target = "productId"),
            @Mapping(source = "cantidad" , target = "quantity"),
            //@Mapping(source = "total" , target = "total"),
            @Mapping(source = "estado" , target = "active")
    })
    PurchaseItem toPurchaseITem(ComprasProducto producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "id.idCompra", ignore = true),
    })
    ComprasProducto toComprasProducto(PurchaseItem item);

}
