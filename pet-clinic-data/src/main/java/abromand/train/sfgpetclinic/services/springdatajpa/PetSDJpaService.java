package abromand.train.sfgpetclinic.services.springdatajpa;

import abromand.train.sfgpetclinic.model.Pet;
import abromand.train.sfgpetclinic.repositories.PetRepository;
import abromand.train.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile( "springdatajpa" )
public class PetSDJpaService extends AbstractSDJpaService<Pet, Long> implements PetService{
	public PetSDJpaService( PetRepository petRepository ) {
		this.crudRepository = petRepository;
	}
}
