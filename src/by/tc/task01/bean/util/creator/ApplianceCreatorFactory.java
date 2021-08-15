package by.tc.task01.bean.util.creator;

import by.tc.task01.bean.util.creator.impl.LaptopCreator;
import by.tc.task01.bean.util.creator.impl.OvenCreator;
import by.tc.task01.bean.util.creator.impl.RefrigeratorCreator;
import by.tc.task01.bean.util.creator.impl.SpeakersCreator;
import by.tc.task01.bean.util.creator.impl.TabletPCCreator;
import by.tc.task01.bean.util.creator.impl.VacuumCleanerCreator;
import by.tc.task01.dao.impl.AutoApplianceCreator;

public final class ApplianceCreatorFactory {
	private static final ApplianceCreatorFactory instance = new ApplianceCreatorFactory();
	
	private final AutoApplianceCreator autoApplianceCreator = new AutoApplianceCreator();
	
	private final LaptopCreator laptopCreator = new LaptopCreator();
	private final OvenCreator ovenCreator = new OvenCreator();
	private final RefrigeratorCreator refrigeratorCreator = new RefrigeratorCreator();
	private final SpeakersCreator speakersCreator = new SpeakersCreator();
	private final TabletPCCreator tabletPCCreator = new TabletPCCreator();
	private final VacuumCleanerCreator vacuumCleanerCreator = new VacuumCleanerCreator();
	private ApplianceCreatorFactory() {}
	
	public static ApplianceCreatorFactory getInstance() {
		return instance;
	}
	
	public AutoApplianceCreator getAutoCreator() {
		return autoApplianceCreator;
	}
	
	public OvenCreator getOvenCreator() {
		return ovenCreator;
	}
	
	public RefrigeratorCreator getRefrigeratorCreator() {
		return refrigeratorCreator;
	}
	
	public SpeakersCreator getSpeakersCreator() {
		return speakersCreator;
	}
	
	public TabletPCCreator getTabletPCCreator() {
		return tabletPCCreator;
	}
	
	public VacuumCleanerCreator getVacuumCleanerCreator() {
		return vacuumCleanerCreator;
	}
	
	public LaptopCreator getLaptopCreator() {
		return laptopCreator;
	}
	
	

}
