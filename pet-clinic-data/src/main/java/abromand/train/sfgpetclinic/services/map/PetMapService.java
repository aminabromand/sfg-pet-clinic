package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Pet;
import abromand.train.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
