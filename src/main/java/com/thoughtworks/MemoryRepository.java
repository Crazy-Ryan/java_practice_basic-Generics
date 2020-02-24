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

    }

    @Override
    public T get(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, T t) {

    }

    @Override
    public void list() {

    }
}
