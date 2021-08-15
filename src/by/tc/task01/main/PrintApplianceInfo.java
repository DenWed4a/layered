package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {

		for(Appliance element : appliance) {
			
			System.out.println(element.toString());
		}
		
	}
	
	// you may add your own code here

}
