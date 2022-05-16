package com.salcedoFawcett.services.Provider.domain.repository;

import com.salcedoFawcett.services.Provider.domain.model.WorkForceProvider;

import java.util.List;
import java.util.Optional;

public interface WorkforceProviderRepository {
    public List<WorkForceProvider> getAll();
    public Optional<WorkForceProvider> getById(int providerId);
    public WorkForceProvider save(WorkForceProvider provider);
    public Optional<WorkForceProvider> update(WorkForceProvider provider);
    Boolean delete(int providerId);
}
