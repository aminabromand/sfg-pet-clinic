package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.Speciality;
import abromand.train.sfgpetclinic.model.Vet;
import abromand.train.sfgpetclinic.services.SpecialityService;
import abromand.train.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet object) {
        Vet savedVet = null;
        if(object != null) {
            if (object.getSpecialities() != null) {
                object.getSpecialities().forEach(speciality -> {
                    if(speciality.getId() == null) {
                        Speciality savedSpeciality = specialityService.save(speciality);
                        speciality.setId(savedSpeciality.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }
}
