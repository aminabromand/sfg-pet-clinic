package abromand.train.sfgpetclinic.repositories;

import abromand.train.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>{
}
