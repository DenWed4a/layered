package by.tc.task01.main;





import by.tc.task01.controller.Controller;

public class Main {

	public static void main(String[] args) {
		
		
		
		Controller controller =  new Controller();
		
		String request;
		String responce;
		
		request = "Find type=all POWER_CONSUMPTION=100";
		
		
		
		System.out.println(responce = controller.doAction(request));
		
		request = "Add type=Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5";
		responce = controller.doAction(request);
		System.out.println(responce);
		request = "Remove type=Refrigerator : POWER_CONSUMPTION=1000 WEIGHT=20 FREEZER_CAPACITY=10";
		responce = controller.doAction(request);
		System.out.println(responce);
		
		request = "Remove type=Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5";
		
		responce = controller.doAction(request);
		System.out.println(responce);
	}

}
