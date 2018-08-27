package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.PetType;
import abromand.train.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
