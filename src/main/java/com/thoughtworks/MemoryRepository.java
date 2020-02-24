package com.thoughtworks;

import java.util.HashMap;
import java.util.Map;

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
    public void list() {
        for(String key: database.keySet()){
            System.out.println(database.get(key));
        }
    }
}
