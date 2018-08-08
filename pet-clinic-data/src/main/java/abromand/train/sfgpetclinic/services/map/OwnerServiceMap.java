package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Owner;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> {
    @Override
    public Owner save(Owner owner) {
        return super.save( owner.getId(), owner );
    }
}
