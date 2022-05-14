package com.salcedoFawcett.services.Provider.persistence.repository;

import com.salcedoFawcett.services.Provider.domain.model.Provider;
import com.salcedoFawcett.services.Provider.domain.repository.ProviderRepository;
import com.salcedoFawcett.services.Provider.persistence.crud.ProductServiceProviderCrudRepository;
import com.salcedoFawcett.services.Provider.persistence.entity.ProductServiceProvider;
import com.salcedoFawcett.services.Provider.persistence.mapper.ProductServiceProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductServiceProviderRepository implements ProviderRepository {

    @Autowired
    private ProductServiceProviderCrudRepository crudRepository;
    @Autowired
    private ProductServiceProviderMapper mapper;

    @Override
    public List<Provider> getAll() {
        return mapper.toProviders((List<ProductServiceProvider>) crudRepository.findAll());
    }

    @Override
    public Optional<Provider> getById(int providerId) {
        return crudRepository.findById(providerId).map(mapper::toProvider);
    }

    @Override
    public Provider save(Provider provider) {
        ProductServiceProvider productServiceProvider = mapper.toProductServiceProvider(provider);
        productServiceProvider.setProvider(productServiceProvider.getProvider().addPaymentMeans());
        return mapper.toProvider(crudRepository.save(productServiceProvider));
    }

    @Override
    public Optional<Provider> update(Provider provider) {
        return crudRepository.findById(provider.getId()).map(providerData -> {
            ProductServiceProvider productServiceProvider = mapper.toProductServiceProvider(provider);
            productServiceProvider.getProvider().setId(providerData.getProvider().getId());
            productServiceProvider.setProvider(productServiceProvider.getProvider().addPaymentMeans());
            return mapper.toProvider(crudRepository.save(productServiceProvider));
        });
    }

    @Override
    public Boolean delete(int providerId) {
        if (crudRepository.existsById(providerId)){
            crudRepository.deleteById(providerId);
            return true;
        } else return false;
    }
}
