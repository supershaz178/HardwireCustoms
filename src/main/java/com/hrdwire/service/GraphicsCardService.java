package com.hrdwire.service;

import java.util.List;
import java.util.Map;

import com.hrdwire.persistence.Build;
import com.hrdwire.persistence.GraphicsCard;

public interface GraphicsCardService extends BaseService<GraphicsCard> {

	public List<GraphicsCard> searchByParameters(Map<String, String> parameters);

	public Build addGraphicsCardToBuild(Build build, GraphicsCard gCard);

	public Build removeGraphicsCardFromBuild(Build build, GraphicsCard rmGCard);

	public Boolean isSLIConfigured(Build build);

	public List<GraphicsCard> listAllGraphicsCards();
}
