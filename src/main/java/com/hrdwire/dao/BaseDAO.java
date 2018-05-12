package com.hrdwire.dao;

public interface BaseDAO
{
	public void create(Object createObj); 
	
	public void delete(Object deleteObj); 
	
	public void update(Object updateObj); 
	
	public Object select(Object getObj); 
}
