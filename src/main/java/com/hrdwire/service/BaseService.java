package com.hrdwire.service;

public interface BaseService <T>{
	
	public T selectById(Integer id); 
	
	public void delete( T deleteObj); 
	
	public void create( T createObj); 
	
	public void update( T updateObj); 
}
