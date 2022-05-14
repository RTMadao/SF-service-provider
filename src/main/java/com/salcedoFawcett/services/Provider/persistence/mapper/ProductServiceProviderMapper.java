package com.salcedoFawcett.services.Provider.persistence.mapper;

import com.salcedoFawcett.services.Provider.domain.model.Provider;
import com.salcedoFawcett.services.Provider.persistence.entity.ProductServiceProvider;
import com.salcedoFawcett.services.Provider.persistence.entity.ProviderPaymentMeans;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProviderPaymentMeansMapper.class})
public interface ProductServiceProviderMapper {
    @Mappings({
            @Mapping(source = "provider.providerTypeId", target = "providerType"),
            @Mapping(source = "address", target = "phisicalAddress"),
            @Mapping(source = "provider.contact", target = "contactData"),
            @Mapping(source = "provider.payment_means", target = "paymentMeans")
    })
    Provider toProvider(ProductServiceProvider provider);
    List<Provider> toProviders(List<ProductServiceProvider> provider);

    @InheritInverseConfiguration()
    ProductServiceProvider toProductServiceProvider(Provider customerParty);
}
