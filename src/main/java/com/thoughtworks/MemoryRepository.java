package com.thoughtworks;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MemoryRepository<T> implements Repository<T> {

    private Map<String, T> database;

    public MemoryRepository() {
        database = new LinkedHashMap<>();
    }

    @Override
    public void save(String id, T t) {
        database.put(id, t);
    }

    @Override
    public T get(String id) {
        return database.get(id);
    }

    @Override
    public void delete(String id) {
        database.remove(id);
    }

    @Override
    public void update(String id, T t) {
        database.put(id, t);
    }

    @Override
    public Collection<T> list() {
        Set<T> allObjects = new LinkedHashSet<>();
        for (String key : database.keySet()) {
            allObjects.add(database.get(key));
        }
        return allObjects;
    }
}
