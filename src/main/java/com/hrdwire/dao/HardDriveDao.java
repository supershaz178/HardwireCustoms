/**
 * @author Shahroz
 *
 */
package com.hrdwire.dao;

import java.util.List;

import com.hrdwire.persistence.HardDrive;

public interface HardDriveDao extends BaseDao<HardDrive>
{
	public HardDrive selectByFullName(String hardDriveName);
	
	public List<HardDrive> searchByPartialName(String partialName);
	
	public List<HardDrive> searchBySeriesName(String seriesName);
	
	public List<HardDrive> searchByBrandName(String brandName); 
	
	public List<HardDrive> searchByRatings(Integer rating); 
	
	public List<HardDrive> searchByCapacity(Integer capacity);
	
	public List<HardDrive> searchByFormFactor(Double formFactor); 
	
	public List<HardDrive> searchByRPM(Integer rpm); 
	
	public List<HardDrive> searchByInterfaceType(String InterfaceType); 
	
	public List<HardDrive> searchByCapacityAndRPM(Integer capacity, Integer rpm);
	
	public List<HardDrive> searchByPartialNameAndBrandAndSeries(String partialName, String brand, String series);
	
	public List<HardDrive> searchByCapacityAndFormFactor(Integer capacity, Double formFactor);
}
