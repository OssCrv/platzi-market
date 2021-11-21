package com.carvajalossman.platzimarket.domain.repository;

import com.carvajalossman.platzimarket.domain.Purchase;
import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
  Optional<Purchase> getPurchase(int purchaseId);
  List<Purchase> getAll();
  Optional<List<Purchase>> getByClient(String clientId);
  Purchase save(Purchase purchase);

  void delete(int purchaseId);
}
