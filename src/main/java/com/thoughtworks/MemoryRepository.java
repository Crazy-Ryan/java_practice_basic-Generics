package com.thoughtworks;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MemoryRepository<T> implements Repository<T> {

    private Map<String, T> database;

    public MemoryRepository() {
        database = new HashMap<>();
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
        Set<T> allObjects = new HashSet<>();
        for (String key : database.keySet()) {
            allObjects.add(database.get(key));
        }
        return allObjects;
    }
}
