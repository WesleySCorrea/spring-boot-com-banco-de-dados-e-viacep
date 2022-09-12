package com.wesleyscorrea.springcomviacep.resources;

import com.wesleyscorrea.springcomviacep.entities.Address;
import com.wesleyscorrea.springcomviacep.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Resource
@RestController
@RequestMapping(value = "/address")
public class AddressResource {

    @Autowired
    private AddressService service;

    @GetMapping
    public ResponseEntity<List<Address>> findAll(){

        List<Address> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> findById(@PathVariable Long id) {

        Address obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
