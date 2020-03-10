package gochad.sf.sfpetclinic.services;

import gochad.sf.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName();

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
