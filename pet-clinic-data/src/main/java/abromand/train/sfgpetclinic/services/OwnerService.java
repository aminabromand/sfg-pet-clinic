package abromand.train.sfgpetclinic.services;

import abromand.train.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName( String lastName );
    List<Owner> findAllByLastNameLike(String lastName);

}
