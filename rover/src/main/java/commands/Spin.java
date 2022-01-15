package commands;

import model.Rover;

public abstract class Spin implements Command {

	public abstract void execute(Rover rover);

}
