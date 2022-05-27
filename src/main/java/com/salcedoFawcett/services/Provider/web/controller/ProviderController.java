package com.salcedoFawcett.services.Provider.web.controller;

import com.salcedoFawcett.services.Provider.domain.model.Provider;
import com.salcedoFawcett.services.Provider.domain.model.WorkForceProvider;
import com.salcedoFawcett.services.Provider.domain.service.ProviderService;
import com.salcedoFawcett.services.Provider.domain.service.WorkforceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderService service;
    @Autowired
    private WorkforceProviderService WPService;

    @GetMapping("/materials/all")
    public ResponseEntity<List<Provider>> getAllMaterialsProvider(){
        return new ResponseEntity<>(service.getAll().stream().filter(provider -> provider.getProviderType() == 1).collect(Collectors.toList()), HttpStatus.OK);
    }
    @GetMapping("/services/all")
    public ResponseEntity<List<Provider>> getAllServicesProvider(){
        return new ResponseEntity<>(service.getAll().stream().filter(provider -> provider.getProviderType() == 2).collect(Collectors.toList()), HttpStatus.OK);
    }
    @GetMapping("/workforce/all")
    public ResponseEntity<List<WorkForceProvider>> getAllWorkforceProvider(){
        return new ResponseEntity<>(WPService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/materials/get_by_partyIdentification/{id}")
    public ResponseEntity<Provider> getMaterialProviderByPartyIdentificationId(@PathVariable("id") long id){
        return service.getByPartyIdentificationId(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/services/get_by_partyIdentification/{id}")
    public ResponseEntity<Provider> getServiceProviderByIdPartyIdentificationId(@PathVariable("id") long id){
        return service.getByPartyIdentificationId(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/workforce/get_by_partyIdentification/{id}")
    public ResponseEntity<WorkForceProvider> getByPartyIdentificationId(@PathVariable("id") long id){
        return WPService.getByPartyIdentificationId(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/materials/save")
    public ResponseEntity<Provider> saveMaterials(@RequestBody Provider provider){
        return new ResponseEntity<>(service.save(provider), HttpStatus.CREATED);
    }
    @PostMapping("/services/save")
    public ResponseEntity<Provider> saveServices(@RequestBody Provider provider){
        return new ResponseEntity<>(service.save(provider), HttpStatus.CREATED);
    }
    @PostMapping("/workforce/save")
    public ResponseEntity<WorkForceProvider> saveWorkforce(@RequestBody WorkForceProvider provider){
        return new ResponseEntity<>(WPService.save(provider), HttpStatus.CREATED);
    }
    @PutMapping("/materials/update")
    public ResponseEntity<Provider> updateMaterialsProvider(@RequestBody Provider provider){
        return service.update(provider)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/services/update")
    public ResponseEntity<Provider> updateServicesProvider(@RequestBody Provider provider){
        return service.update(provider)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/workforce/update")
    public ResponseEntity<WorkForceProvider> updateWorkforceProvider(@RequestBody WorkForceProvider provider){
        return WPService.update(provider)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{type}/delete/{id}")
    public  ResponseEntity<?> delete(@PathVariable("type") String type, @PathVariable("id") int id) {
        if (Objects.equals(type, "workforce")) {
            if (WPService.delete(id)) return new ResponseEntity<>(HttpStatus.OK);
        }
        if (service.delete(id)) return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
