package com.salcedoFawcett.services.Provider.persistence.mapper;

import com.salcedoFawcett.services.Provider.domain.model.WorkforceFamily;
import com.salcedoFawcett.services.Provider.persistence.entity.ProviderWorkforceFamily;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProviderWorkforceFamilyMapper {
    @Mappings({
            @Mapping(source = "familyMember.party_identification", target = "partyIdentification"),
            @Mapping(source = "familyMember.address", target = "phisicalAddress"),
            @Mapping(source = "familyMember.addressZoneType", target = "addressZoneType"),
            @Mapping(source = "familyMember.registration_name", target = "registrationName"),
            @Mapping(source = "familyMember.birthday", target = "birthday"),
            @Mapping(source = "familyMember.sex", target = "sex"),
            @Mapping(source = "familyMember.id", target = "personId")
    })
    WorkforceFamily toWorkforceFamily(ProviderWorkforceFamily workforceFamily);
    List<WorkforceFamily> toWorkforceFamilies(List<ProviderWorkforceFamily> workforceFamily);

    @Mapping(target = "provider", ignore = true)
    @InheritInverseConfiguration()
    ProviderWorkforceFamily toProviderWorkforceFamilies(WorkforceFamily workforceFamily);
}
