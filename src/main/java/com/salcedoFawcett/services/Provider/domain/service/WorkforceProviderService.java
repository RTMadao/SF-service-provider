package com.salcedoFawcett.services.Provider.domain.service;

import com.salcedoFawcett.services.Provider.domain.model.Provider;
import com.salcedoFawcett.services.Provider.domain.model.WorkForceProvider;
import com.salcedoFawcett.services.Provider.domain.repository.WorkforceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkforceProviderService {
    @Autowired
    private WorkforceProviderRepository repository;

    public List<WorkForceProvider> getAll(){
        return repository.getAll();
    }

    public Optional<WorkForceProvider> getById(int providerId){
        return repository.getById(providerId);
    }
    public Optional<WorkForceProvider> getByPartyIdentificationId(long partyIdentificationId){
        return repository.getByPartyIdentificationId(partyIdentificationId);
    }
    public WorkForceProvider save(WorkForceProvider provider){
        return repository.save(provider);
    }
    public Optional<WorkForceProvider> update(WorkForceProvider provider){
        return repository.update(provider);
    }
    public boolean delete(int providerId){
        return repository.delete(providerId);
    }
}
