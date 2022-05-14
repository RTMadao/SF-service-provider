package com.salcedoFawcett.services.Provider.web.controller;

import com.salcedoFawcett.services.Provider.domain.model.Provider;
import com.salcedoFawcett.services.Provider.domain.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderService service;

    @GetMapping("/materials/all")
    public ResponseEntity<List<Provider>> getAllMaterialsProvider(){
        return new ResponseEntity<>(service.getAll().stream().filter(provider -> provider.getProviderType() == 1).collect(Collectors.toList()), HttpStatus.OK);
    }
    @GetMapping("/services/all")
    public ResponseEntity<List<Provider>> getAllServicesProvider(){
        return new ResponseEntity<>(service.getAll().stream().filter(provider -> provider.getProviderType() == 2).collect(Collectors.toList()), HttpStatus.OK);
    }
    @GetMapping("/get_by_id/{id}")
    public ResponseEntity<Provider> getById(@PathVariable("id") int id){
        return service.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/{type}/save")
    public ResponseEntity<Provider> saveProvider(@PathVariable("type") String type, @RequestBody Provider provider){
        return new ResponseEntity<>(service.save(provider), HttpStatus.CREATED);
    }
    @PutMapping("/{type}/update")
    public ResponseEntity<Provider> updateProvider(@PathVariable("type") String type, @RequestBody Provider provider){
        return service.update(provider)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{type}/delete/{id}")
    public  ResponseEntity<?> delete(@PathVariable("type") String type, @PathVariable("id") int id) {
        if (service.delete(id)) return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
