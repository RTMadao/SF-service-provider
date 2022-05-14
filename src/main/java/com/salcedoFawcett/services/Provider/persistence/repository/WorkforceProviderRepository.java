package com.salcedoFawcett.services.Provider.persistence.repository;

import com.salcedoFawcett.services.Provider.persistence.crud.WorkforceProviderCrudRepository;
import com.salcedoFawcett.services.Provider.persistence.entity.WorkforceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WorkforceProviderRepository {
    @Autowired
    private WorkforceProviderCrudRepository crudRepository;

    public WorkforceProvider save(WorkforceProvider provider) {

        return crudRepository.save(provider);
    }
}
