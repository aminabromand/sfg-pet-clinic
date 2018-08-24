package abromand.train.sfgpetclinic.services.springdatajpa;

import abromand.train.sfgpetclinic.model.PetType;
import abromand.train.sfgpetclinic.repositories.PetTypeRepository;
import abromand.train.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile( "springdatajpa" )
public class PetTypeSDJpaService extends AbstractSDJpaService<PetType, Long> implements PetTypeService{
	public PetTypeSDJpaService( PetTypeRepository petTypeRepository ) {
		this.crudRepository = petTypeRepository;
	}
}
