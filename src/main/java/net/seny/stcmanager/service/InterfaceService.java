package net.seny.stcmanager.service;

import java.util.List;

public interface InterfaceService<T>{
    void save(T item);
    List<T> getAll();
    T getById(long id);
    void update(T item, long id);
    void delete(long id);
}
