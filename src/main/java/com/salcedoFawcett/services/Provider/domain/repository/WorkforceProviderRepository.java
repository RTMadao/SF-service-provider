package com.salcedoFawcett.services.Provider.domain.repository;

import com.salcedoFawcett.services.Provider.domain.model.WorkForceProvider;

import java.util.List;
import java.util.Optional;

public interface WorkforceProviderRepository {
    List<WorkForceProvider> getAll();
    Optional<WorkForceProvider> getById(int providerId);
    Optional<WorkForceProvider> getByPartyIdentificationId(long partyIdentificationId);
    WorkForceProvider save(WorkForceProvider provider);
    Optional<WorkForceProvider> update(WorkForceProvider provider);
    Boolean delete(int providerId);
}
