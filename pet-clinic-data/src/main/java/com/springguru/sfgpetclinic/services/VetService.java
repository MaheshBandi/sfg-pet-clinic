package com.springguru.sfgpetclinic.services;

import com.springguru.sfgpetclinic.model.Pet;
import com.springguru.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByID(Long id);
    Vet save(Pet vet);
    Set<Vet> findAll();
}
