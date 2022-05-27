package com.salcedoFawcett.services.Provider.domain.repository;

import com.salcedoFawcett.services.Provider.domain.model.Provider;
import java.util.List;
import java.util.Optional;

public interface ProviderRepository {
    public List<Provider> getAll();
    public Optional<Provider> getById(int providerId);
    Optional<Provider> getByPartyIdentificationId(long partyIdentificationId);
    public Provider save(Provider provider);
    public Optional<Provider> update(Provider provider);
    Boolean delete(int providerId);
}
