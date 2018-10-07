package abromand.train.sfgpetclinic.services.springdatajpa;

import abromand.train.sfgpetclinic.model.Owner;
import abromand.train.sfgpetclinic.repositories.OwnerRepository;
import abromand.train.sfgpetclinic.repositories.PetRepository;
import abromand.train.sfgpetclinic.repositories.PetTypeRepository;
import abromand.train.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile( "springdatajpa" )
public class OwnerSDJpaService extends AbstractSDJpaService<Owner, Long> implements OwnerService{

	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerSDJpaService( OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository ){
		this.crudRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override public Owner findByLastName( String lastName ){
		return ((OwnerRepository)crudRepository).findByLastName( lastName );
	}

	@Override
	public List<Owner> findAllByLastNameLike(String lastName) {
		return ((OwnerRepository)crudRepository).findAllByLastNameLike(lastName);
	}

//	@Override public Set<Owner> findAll(){
//		Set<Owner> owners = new HashSet<>(  );
//		ownerRepository.findAll().forEach( owners::add );
//		return owners;
//	}
//
//	@Override public Owner findById( Long aLong ){
//		return ownerRepository.findById( aLong ).orElse( null );
//	}
//
//	@Override public Owner save( Owner object ){
//		return ownerRepository.save( object );
//	}
//
//	@Override public void delete( Owner object ){
//		ownerRepository.delete( object );
//	}
//
//	@Override public void deleteById( Long aLong ){
//		ownerRepository.deleteById( aLong );
//	}
}
