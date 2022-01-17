package commands;

public enum CommandEnum {
	M(new Move()),
	R(new SpinR()),
	L(new SpinL());

	final private Command command;
	
	CommandEnum(Command command) {
		this.command = command;
	}
	public Command getCommand() {
		return command;
	}
	
	
}
