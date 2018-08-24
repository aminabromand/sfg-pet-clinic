package abromand.train.sfgpetclinic.services.springdatajpa;

import abromand.train.sfgpetclinic.model.Vet;
import abromand.train.sfgpetclinic.repositories.VetRepository;
import abromand.train.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile( "springdatajpa" )
public class VetSDJpaService extends AbstractSDJpaService<Vet, Long> implements VetService {

	public VetSDJpaService( VetRepository vetRepository ) {
		this.crudRepository = vetRepository;
	}
}
