package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Speciality;
import abromand.train.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
