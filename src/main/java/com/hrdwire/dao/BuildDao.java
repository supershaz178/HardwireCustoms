package com.hrdwire.dao;

import com.hrdwire.persistence.Build;

public interface BuildDao extends BaseDao<Build>
{
	@Override
	public void create(Build build); 
	
	@Override
	public void update(Build build); 

	@Override
	public void delete(Build build); 

	@Override
	public Build selectById(Integer id); 

}
