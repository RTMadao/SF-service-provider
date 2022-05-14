package com.salcedoFawcett.services.Provider.persistence.crud;

import com.salcedoFawcett.services.Provider.persistence.entity.ProductServiceProvider;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductServiceProviderCrudRepository extends CrudRepository<ProductServiceProvider, Integer> {
}
