package commands;

import client.Rover;
import utils.CardinalDirection;

public class SpinL extends Command {

	@Override
	void executeN(Rover rover) {
		rover.setCardinalDirection(CardinalDirection.W);
	}

	@Override
	void executeS(Rover rover) {
		rover.setCardinalDirection(CardinalDirection.E);
	}

	@Override
	void executeE(Rover rover) {
		rover.setCardinalDirection(CardinalDirection.N);
	}

	@Override
	void executeW(Rover rover) {
		rover.setCardinalDirection(CardinalDirection.S);
	}    

}
