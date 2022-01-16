package commands;

import commander.Rover;
import utils.CardinalDirection;

public class SpinR extends Command {

	@Override
	void executeN(Rover rover) {
		rover.setCardinalDirection(CardinalDirection.E);
		
	}

	@Override
	void executeS(Rover rover) {
		rover.setCardinalDirection(CardinalDirection.W);
		
	}

	@Override
	void executeE(Rover rover) {
		rover.setCardinalDirection(CardinalDirection.S);
		
	}

	@Override
	void executeW(Rover rover) {
		rover.setCardinalDirection(CardinalDirection.N);
		
	}

}
