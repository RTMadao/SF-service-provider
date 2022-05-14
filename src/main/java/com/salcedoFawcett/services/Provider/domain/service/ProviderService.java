package com.salcedoFawcett.services.Provider.domain.service;

import com.salcedoFawcett.services.Provider.domain.model.Provider;
import com.salcedoFawcett.services.Provider.domain.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository repository;

    public List<Provider> getAll(){
        return repository.getAll();
    }
    public Optional<Provider> getById(int providerId){
        return repository.getById(providerId);
    }
    public Provider save(Provider provider){
        return repository.save(provider);
    }
    public Optional<Provider> update(Provider provider){
        return repository.update(provider);
    }
    public boolean delete(int providerId){
        return repository.delete(providerId);
    }
}
