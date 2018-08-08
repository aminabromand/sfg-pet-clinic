package abromand.train.sfgpetclinic.services;

import abromand.train.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName( String lastName );

}
