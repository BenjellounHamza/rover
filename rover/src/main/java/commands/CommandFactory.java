package commands;

public enum CommandFactory {
	M(new Move()),
	R(new SpinR()),
	L(new SpinL());

	final private Command command;
	
	CommandFactory(Command command) {
		this.command = command;
	}
	public Command getCommand() {
		return command;
	}
	
	
}
