package com.thoughtworks;

import java.util.Collection;

public interface Repository<T> {

    void save(String id, T t);

    T get(String id);

    void delete(String id);

    void update(String id, T t);

    Collection<T> list();

}
