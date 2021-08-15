package by.tc.task01.controller;



import by.tc.task01.controller.validation.Validator;



public class Controller {

	private final int COMMAND_NAME = 0;
	private final CommandProvider commandProvider = new CommandProvider();

	public String doAction(String request) {
		String responce;
		if (Validator.requestValidator(request)) {
			String[] params = request.split("\\s+", 2);
			String commandName = params[COMMAND_NAME];

			Command command;
			command = commandProvider.takeCommand(commandName);
			responce = command.execute(request);
		} else {
			responce = "request failed validation";
		}
		return responce;

	}
}
