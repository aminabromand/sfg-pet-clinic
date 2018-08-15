package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.PetType;
import abromand.train.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
