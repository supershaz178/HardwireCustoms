package com.hrdwire.dao;

import org.hibernate.Session;

public interface BaseDao<T> {

	public void create(T createObj);

	public void delete(T deleteObj);

	public void update(T updateObj);

	public T selectById(Integer id);

	public Session getSession();

}
