package com.thoughtworks;

import java.util.Collection;

public class RepositoryUtil {

    public static <T> void printList(Repository<T> repo) {
        Collection<T> col = repo.list();
        for (T t : col) {
            System.out.println(t);
        }
    }

}
