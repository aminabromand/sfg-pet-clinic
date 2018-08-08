package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Vet;

public class VetServiceMap extends AbstractMapService<Vet, Long> {
    @Override
    public Vet save(Vet vet) {
        return super.save( vet.getId(), vet );
    }
}
