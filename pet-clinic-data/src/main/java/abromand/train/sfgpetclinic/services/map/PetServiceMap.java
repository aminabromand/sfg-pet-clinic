package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Pet, Long>{

    @Override
    public Pet save(Pet pet) {
        return super.save( pet.getId(), pet );
    }
}
