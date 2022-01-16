package commands;

import commander.Rover;

public class Move extends Command {
	
	@Override
	void executeN(Rover rover) {
		rover.setY(rover.getY() + 1);
		
	}

	@Override
	void executeS(Rover rover) {
		rover.setY(rover.getY() - 1);
		
	}

	@Override
	void executeE(Rover rover) {
		rover.setX(rover.getX() + 1);
		
	}

	@Override
	void executeW(Rover rover) {
		rover.setX(rover.getX() - 1);
		
	}

}
