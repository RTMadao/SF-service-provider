package com.salcedoFawcett.services.Provider.persistence.mapper;

import com.salcedoFawcett.services.Provider.domain.model.Affiliation;
import com.salcedoFawcett.services.Provider.domain.model.PaymentMean;
import com.salcedoFawcett.services.Provider.persistence.entity.ProviderPaymentMeans;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AffiliationMapper {
    Affiliation toAffiliation(com.salcedoFawcett.services.Provider.persistence.entity.Affiliation affiliation);
    List<Affiliation> toAffiliations(List<com.salcedoFawcett.services.Provider.persistence.entity.Affiliation> affiliation);

    @Mapping(target = "provider", ignore = true)
    @InheritInverseConfiguration()
    com.salcedoFawcett.services.Provider.persistence.entity.Affiliation toAffiliations(Affiliation affiliation);
}
