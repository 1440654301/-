package com.dljy.dao;

import java.util.List;

public interface DBdao <T> {
public void add( T t);
public void delete(int id);
public void update( T t);
public T findById(int id); 
public T findByC(T t); 
public  List<T> findAll();
public List<T> findByName(String name);
public List<T> findBySQL(String sql);
}
