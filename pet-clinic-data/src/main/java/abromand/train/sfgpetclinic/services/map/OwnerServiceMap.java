package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Owner;
import abromand.train.sfgpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner owner) {
        return super.save( owner.getId(), owner );
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
