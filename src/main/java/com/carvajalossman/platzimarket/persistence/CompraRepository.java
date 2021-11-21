package com.carvajalossman.platzimarket.persistence;

import com.carvajalossman.platzimarket.domain.Purchase;
import com.carvajalossman.platzimarket.domain.repository.PurchaseRepository;
import com.carvajalossman.platzimarket.persistence.crud.CompraCrudRepository;
import com.carvajalossman.platzimarket.persistence.entity.Compra;
import com.carvajalossman.platzimarket.persistence.mapper.PurchaseMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompraRepository implements PurchaseRepository {

  @Autowired
  private CompraCrudRepository compraCrudRepository;

  @Autowired
  private PurchaseMapper mapper;

  @Override
  public Optional<Purchase> getPurchase(int purchaseId) {
    return compraCrudRepository
      .findById(purchaseId)
      .map(compra -> mapper.toPurchase(compra));
  }

  @Override
  public List<Purchase> getAll() {
    return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
  }

  @Override
  public Optional<List<Purchase>> getByClient(String clientId) {
    return compraCrudRepository
      .findByIdCliente(clientId)
      .map(compras -> mapper.toPurchases(compras));
  }

  @Override
  public Purchase save(Purchase purchase) {
    Compra compra = mapper.toCompra(purchase);
    compra.getProductos().forEach(producto -> producto.setCompra(compra));

    return mapper.toPurchase(compraCrudRepository.save(compra));
  }

  @Override
  public void delete(int purchaseId) {
    compraCrudRepository.deleteById(purchaseId);
  }
}
