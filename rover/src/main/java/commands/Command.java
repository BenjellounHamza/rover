package commands;

import model.Rover;

public interface Command {
	
	public void execute(Rover rover);
	
}
