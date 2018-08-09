package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Vet;
import abromand.train.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet vet) {
        return super.save( vet.getId(), vet );
    }
}
