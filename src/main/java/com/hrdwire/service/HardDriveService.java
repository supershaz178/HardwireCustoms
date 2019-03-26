package com.hrdwire.service;

import java.util.HashMap;
import java.util.List;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.HardDrive;

public interface HardDriveService extends BaseService<HardDrive>
{
	public HardDrive updateHardDriveDetails(HardDrive updateHD); 
	
	public List<HardDrive> searchByParameters(HashMap<String,String> parmeters); 
	
	public HardDrive removeHardDrive(HardDrive rmHardDrive); 
	
	public Boolean determineCompatibility(HardDrive comHardDrive, Build build);
	
	public Build addHardDriveToBuild(HardDrive addDrive); 
	
	public Build removeHardDriveFromBuild(HardDrive rmDrive); 
	

}
