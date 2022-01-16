package commands;

import client.Rover;

public abstract class Command {
	
	public void execute(Rover rover) {
		switch(rover.getCardinalDirection()) {
	      case N: 
	        this.executeN(rover);
	        break;
	      case S: 
	    	this.executeS(rover);
	        break;
	      case E:
	    	this.executeE(rover);
	        break;
	      case W:
	    	this.executeW(rover);
	    	break;
	      default:
	        throw new RuntimeException("Invalid move");
	    }
	}
	abstract void executeN(Rover rover);
	abstract void executeS(Rover rover);
	abstract void executeE(Rover rover);
	abstract void executeW(Rover rover);
	
	
}
