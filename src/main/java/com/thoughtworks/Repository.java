package com.thoughtworks;

public interface Repository<T> {

    void save(String id, T t);

    T get(String id);

    void delete(String id);

    void update(String id, T t);

    void list();

}
