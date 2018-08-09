package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Pet;
import abromand.train.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet pet) {
        return super.save( pet );
    }
}
