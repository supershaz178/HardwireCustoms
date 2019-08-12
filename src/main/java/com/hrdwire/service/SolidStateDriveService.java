package com.hrdwire.service;

import java.util.List;
import java.util.Map;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.SolidStateDrive;

public interface SolidStateDriveService extends BaseService<SolidStateDrive> {

	public List<SolidStateDrive> searchByParameters(
			Map<String, String> parameters);

	public Build removeSolidStateDrive(SolidStateDrive drive);

	public Build determineCompatibility(SolidStateDrive drive);

	public Build addSoidStateDriveToBuild(SolidStateDrive addDrive);

	public List<SolidStateDrive> listAllSolidStateDrives();

}
