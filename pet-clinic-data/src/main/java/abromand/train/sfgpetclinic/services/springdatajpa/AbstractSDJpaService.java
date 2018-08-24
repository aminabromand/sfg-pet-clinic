package abromand.train.sfgpetclinic.services.springdatajpa;

import abromand.train.sfgpetclinic.model.BaseEntity;
import abromand.train.sfgpetclinic.services.CrudService;
import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;
import java.util.Set;

abstract class AbstractSDJpaService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

	protected CrudRepository<T, ID> crudRepository;

	public Set<T> findAll(){
		Set<T> found = new HashSet<>(  );
		crudRepository.findAll().forEach( found::add );
		return found;
	}

	public T findById( ID aLong ){
		return crudRepository.findById( aLong ).orElse( null );
	}

	public T save( T object ){
		return crudRepository.save( object );
	}

	public void delete( T object ){
		crudRepository.delete( object );
	}

	public void deleteById( ID aLong ){
		crudRepository.deleteById( aLong );
	}
}
