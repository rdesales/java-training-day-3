package com.hcl.bankapp.dao;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAO<T> {

	protected ArrayList<T> items; 
	
	
	public GenericDAO(ArrayList<T> items) {
		this.setItems(items);
	}
	/**
	 * @return the items
	 */
	public ArrayList<T> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<T> items) {
		this.items = items;
	}

    public abstract T findOne(String id);
    
    public List<T> findAll() {
    	return items;
    }
    
    public void create(T entity) {
    	items.add(entity);
    }
    
    public void update(T entity) {
    	for (T t : items) {
    		if (t.equals(entity)) {
    			t = entity;
    			break;
    		}
    	}
    }
    public void delete(T entity) {
    	for (T t : items) {
    		if (t.equals(entity)) {
    			items.remove(t);
    			break;
    		}
    	}
    }
    public abstract void deleteById(String entityId);

}
