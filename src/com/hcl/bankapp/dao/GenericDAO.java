package com.hcl.bankapp.dao;

import java.util.List;

public interface GenericDAO<T> {

    public T findOne(String id);
    public List<T> findAll();
    public void create(T entity);
    public void update(T entity);
    public void delete(T entity);
    public void deleteById(String entityId);

}
