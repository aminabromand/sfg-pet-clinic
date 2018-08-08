package abromand.train.sfgpetclinic.services.map;

import abromand.train.sfgpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

    private Map<ID, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>( map.values() );
    }

    public T findById( ID id ) {
        return map.get( id );
    }

    T save( ID id, T object ) {
        map.put( id, object );
        return object;
    }

    public void deleteById( ID id ) {
        map.remove( id );
    }

    public void delete( T object ) {
        map.entrySet().removeIf( entry -> entry.getValue().equals(object) );
    }
}
