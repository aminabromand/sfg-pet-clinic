package abromand.train.sfgpetclinic.services.springdatajpa;

import abromand.train.sfgpetclinic.model.Speciality;
import abromand.train.sfgpetclinic.repositories.SpecialityRepository;
import abromand.train.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile( "springdatajpa" )
public class SpecialitySDJpaService extends AbstractSDJpaService<Speciality, Long> implements SpecialityService{
	public SpecialitySDJpaService( SpecialityRepository specialityRepository ) {
		this.crudRepository = specialityRepository;
	}
}
