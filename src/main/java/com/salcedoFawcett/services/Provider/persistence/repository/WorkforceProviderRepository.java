package com.salcedoFawcett.services.Provider.persistence.repository;


import com.salcedoFawcett.services.Provider.domain.model.WorkForceProvider;
import com.salcedoFawcett.services.Provider.persistence.crud.WorkforceProviderCrudRepository;
import com.salcedoFawcett.services.Provider.persistence.entity.WorkforceProvider;
import com.salcedoFawcett.services.Provider.persistence.mapper.WorkforceProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class WorkforceProviderRepository implements com.salcedoFawcett.services.Provider.domain.repository.WorkforceProviderRepository {
    @Autowired
    private WorkforceProviderCrudRepository crudRepository;
    @Autowired
    private WorkforceProviderMapper mapper;

    @Override
    public List<WorkForceProvider> getAll() {
        return mapper.toProviders((List<WorkforceProvider>) crudRepository.findAll());
    }

    @Override
    public Optional<WorkForceProvider> getById(int providerId) {
        return crudRepository.findById(providerId).map(mapper::toProvider);
    }

    @Override
    public WorkForceProvider save(WorkForceProvider provider) {
        WorkforceProvider workforceProvider = mapper.toWorkforceProvider(provider);
        workforceProvider.setProvider(workforceProvider.getProvider().addPaymentMeans());
        return mapper.toProvider(crudRepository.save(workforceProvider.addProviderWorkforceFamily().addAffiliations()));
    }

    @Override
    public Optional<WorkForceProvider> update(WorkForceProvider provider) {
        return crudRepository.findById(provider.getId()).map(providerData -> {
            WorkforceProvider workforceProvider = mapper.toWorkforceProvider(provider);
            workforceProvider.getProvider().setId(providerData.getProvider().getId());
            workforceProvider.getPersonalInfo().setId(providerData.getPersonalInfo().getId());
            workforceProvider.setProvider(workforceProvider.getProvider().addPaymentMeans());
            return mapper.toProvider(crudRepository.save(workforceProvider.addProviderWorkforceFamily().addAffiliations()));
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
