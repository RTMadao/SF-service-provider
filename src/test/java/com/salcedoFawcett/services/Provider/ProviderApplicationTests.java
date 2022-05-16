package com.salcedoFawcett.services.Provider;

import com.salcedoFawcett.services.Provider.persistence.entity.*;
import com.salcedoFawcett.services.Provider.persistence.repository.WorkforceProviderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootTest
class ProviderApplicationTests {

	@Autowired
	private WorkforceProviderRepository repository;

	@Test
	void saveProductServiceProvider() {
		Set<ProviderPaymentMeans> paymentMeans = new HashSet<>();
		paymentMeans.add(new ProviderPaymentMeans("13","note"));
		paymentMeans.add(new ProviderPaymentMeans("12","note2"));
		ContactData contact = new ContactData("Carlos","3218765493","6548743","mail@gmail.com","nota");
		Provider providerData = new Provider(1,paymentMeans,contact);
		providerData.addPaymentMeans();

		PartyIdentification identification = new PartyIdentification(11434102,6,31);
		Address address = new Address("0510","05","05002","direccion","CO","Colombia","es");
		Person providerInfo = new Person("Carlos",identification,"M",new Date(),address,"Rural");

		Set<ProviderWorkforceFamily> providerWorkforceFamilies = new HashSet<>();
		providerWorkforceFamilies.add(new ProviderWorkforceFamily(new Person("Maria",identification,"M",new Date(),address,"Rural"),"Esposa"));

		Set<Affiliation> affiliations = new HashSet<>();
		affiliations.add(new Affiliation("ARL","Positiva",1));
		affiliations.add(new Affiliation("EPS","Positiva",2));

		WorkforceProvider provider = new WorkforceProvider("Obnrero",providerInfo,providerData,providerWorkforceFamilies,affiliations);
		//repository.save(provider.addProviderWorkforceFamily().addAffiliations());
	}

	//@Test
	//void getProductServiceProvider() {
	//	List<Provider> list = repository.getAll();
	//	System.out.println(list);
	//}

}
