package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.model.BaseEntity;
import abromand.train.sfgpetclinic.services.CrudService;

import java.util.*;

abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    private Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>( map.values() );
    }

    public T findById( ID id ) {
        return map.get( id );
    }

    public T save( T object ) {

        if ( object != null ) {
            if ( object.getId() == null ) {
                object.setId( getNextId() );
            }
            map.put( object.getId(), object );
        } else {
            throw new RuntimeException( "Object cannot be null" );
        }
        return object;
    }

    public void deleteById( ID id ) {
        map.remove( id );
    }

    public void delete( T object ) {
        map.entrySet().removeIf( entry -> entry.getValue().equals(object) );
    }

    private Long getNextId() {
        Long nextId;
        try {
            nextId = Collections.max( map.keySet() ) + 1;
        } catch ( NoSuchElementException ex ) {
            nextId = 1L;
        }
        return nextId;
    }
}
