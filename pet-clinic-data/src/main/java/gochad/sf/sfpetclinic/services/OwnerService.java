package gochad.sf.sfpetclinic.services;

import gochad.sf.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
