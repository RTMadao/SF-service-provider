package com.salcedoFawcett.services.Provider.persistence.crud;

import com.salcedoFawcett.services.Provider.persistence.entity.ProductServiceProvider;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductServiceProviderCrudRepository extends CrudRepository<ProductServiceProvider, Integer> {
    Optional<ProductServiceProvider> findByPartyIdentificationPartyIdentificationId(long partyIdentificationId);
}
