package commands;

import model.Rover;

public class Move implements Command {

	public void execute(Rover rover) {		
		switch(rover.getCardinalDirection()) {
	      case N: 
	        rover.setY(rover.getY() + 1);
	        break;
	      case S: 
	    	rover.setY(rover.getY() - 1);
	        break;
	      case E:
	    	rover.setX(rover.getX() + 1);
	        break;
	      case W:
	    	rover.setX(rover.getX() - 1);
	    	break;
	      default:
	        throw new RuntimeException("Invalid move");
	    }
	}

}
