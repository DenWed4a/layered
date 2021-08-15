package by.tc.task01.dao.impl;

import by.tc.task01.bean.util.creator.ApplianceCreator;
import by.tc.task01.bean.util.creator.CreatorProvider;
import by.tc.task01.entity.Appliance;


public class AutoApplianceCreator {
	private final int APPLIANCE_NAME = 0;

	public Appliance create(String stringFromFile) {

		String applianceName = stringFromFile.split(" ")[APPLIANCE_NAME];

		CreatorProvider creatorProvider = new CreatorProvider();
		ApplianceCreator creator = creatorProvider.takeCreator(applianceName);
		Appliance appliance = creator.create(stringFromFile);

		return appliance;
	}

	public Appliance create(String applianceName, String params) {

		CreatorProvider creatorProvider = new CreatorProvider();
		ApplianceCreator creator = creatorProvider.takeCreator(applianceName);
		Appliance appliance = creator.create(params);

		return appliance;

	}

}
