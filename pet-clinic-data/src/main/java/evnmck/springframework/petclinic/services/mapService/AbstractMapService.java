package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.services.CrudService;

import java.util.*;

public abstract class AbstractMapService <T, ID> implements CrudService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T object) {
        return map.put(id, object);
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(entry -> Objects.equals(entry.getValue(), object));
    }
}
