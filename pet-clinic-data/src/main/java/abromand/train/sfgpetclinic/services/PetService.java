package abromand.train.sfgpetclinic.services;

import abromand.train.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id );

    Pet save( Pet pet );

    Set<Pet> findAll();
}
