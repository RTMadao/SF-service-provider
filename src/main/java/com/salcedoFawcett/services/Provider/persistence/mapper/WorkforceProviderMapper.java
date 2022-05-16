package com.salcedoFawcett.services.Provider.persistence.mapper;

import com.salcedoFawcett.services.Provider.domain.model.WorkForceProvider;
import com.salcedoFawcett.services.Provider.persistence.entity.WorkforceProvider;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProviderPaymentMeansMapper.class,AffiliationMapper.class,ProviderWorkforceFamilyMapper.class})
public interface WorkforceProviderMapper {
    @Mappings({
            @Mapping(source = "provider.providerTypeId", target = "providerType"),
            @Mapping(source = "personalInfo.party_identification", target = "partyIdentification"),
            @Mapping(source = "personalInfo.address", target = "phisicalAddress"),
            @Mapping(source = "personalInfo.addressZoneType", target = "addressZoneType"),
            @Mapping(source = "personalInfo.registration_name", target = "registrationName"),
            @Mapping(source = "personalInfo.birthday", target = "birthday"),
            @Mapping(source = "personalInfo.sex", target = "sex"),
            @Mapping(source = "provider.contact", target = "contactData"),
            @Mapping(source = "provider.payment_means", target = "paymentMeans")
    })
    WorkForceProvider toProvider(WorkforceProvider provider);
    List<WorkForceProvider> toProviders(List<WorkforceProvider> provider);

    @InheritInverseConfiguration()
    WorkforceProvider toWorkforceProvider(WorkForceProvider customerParty);
}
