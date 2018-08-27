package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Pet;
import abromand.train.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
