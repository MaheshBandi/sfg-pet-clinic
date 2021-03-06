package com.springguru.sfgpetclinic.services;

import com.springguru.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findByID(Long id);
   Owner save(Owner owner);
   Set<Owner> findAll();

}
