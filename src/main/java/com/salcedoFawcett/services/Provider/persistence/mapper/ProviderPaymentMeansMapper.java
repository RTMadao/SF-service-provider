package com.salcedoFawcett.services.Provider.persistence.mapper;

import com.salcedoFawcett.services.Provider.domain.model.PaymentMean;
import com.salcedoFawcett.services.Provider.persistence.entity.ProviderPaymentMeans;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProviderPaymentMeansMapper {

    @Mapping(source = "payment_means_id", target = "paymentMeansId")
    PaymentMean toPaymentMean(ProviderPaymentMeans paymentMean);
    List<PaymentMean> toPaymentMeans(List<ProviderPaymentMeans> paymentMean);

    @Mapping(target = "provider", ignore = true)
    @InheritInverseConfiguration()
    ProviderPaymentMeans toProviderPaymentMeans(PaymentMean paymentMean);
}
