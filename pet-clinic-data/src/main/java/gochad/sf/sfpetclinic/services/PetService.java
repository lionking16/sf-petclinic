package gochad.sf.sfpetclinic.services;


import gochad.sf.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
