package com.wesleyscorrea.springcomviacep.services;

import com.wesleyscorrea.springcomviacep.entities.Address;
import com.wesleyscorrea.springcomviacep.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address findById(Long id) {
       Optional<Address> obj = addressRepository.findById(id);
        return obj.get();
     }
}