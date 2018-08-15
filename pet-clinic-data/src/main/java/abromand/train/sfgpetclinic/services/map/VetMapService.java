package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Vet;
import abromand.train.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
}
