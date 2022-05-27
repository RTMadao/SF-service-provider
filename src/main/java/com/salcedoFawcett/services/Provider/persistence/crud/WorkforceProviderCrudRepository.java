package com.salcedoFawcett.services.Provider.persistence.crud;

import com.salcedoFawcett.services.Provider.persistence.entity.WorkforceProvider;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WorkforceProviderCrudRepository extends CrudRepository<WorkforceProvider, Integer> {
    Optional<WorkforceProvider> findByPersonalInfoPartyIdentificationPartyIdentificationId(long partyIdentificationId);
}
