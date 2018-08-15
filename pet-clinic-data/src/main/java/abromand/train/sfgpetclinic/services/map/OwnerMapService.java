package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Owner;
import abromand.train.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
