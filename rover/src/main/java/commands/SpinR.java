package commands;

import model.CardinalDirection;
import model.Rover;

public class SpinR extends Spin {

	@Override
	public void execute(Rover rover) {		
		switch(rover.getCardinalDirection()) {
	      case N: 
	        rover.setCardinalDirection(CardinalDirection.E);
	        break;
	      case E: 
	    	rover.setCardinalDirection(CardinalDirection.S);
	        break;
	      case S:
	    	rover.setCardinalDirection(CardinalDirection.W);
	        break;
	      case W:
	    	rover.setCardinalDirection(CardinalDirection.N);
	    	break;
	      default:
	        throw new RuntimeException("Invalid spin");
	    }
	}

}
