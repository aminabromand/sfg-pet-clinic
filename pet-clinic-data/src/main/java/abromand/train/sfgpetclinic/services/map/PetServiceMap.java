package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Pet;
import abromand.train.sfgpetclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet pet) {
        return super.save( pet.getId(), pet );
    }
}
