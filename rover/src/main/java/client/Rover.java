package client;
import utils.*;
import java.util.*;
import commands.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamza
 */


public class Rover {
	private int x;
    private int y;
    private CardinalDirection cardinalDirection;
    private Plateau plateau; 
    private List<Command> commands;
    
	public Rover(int x, int y, CardinalDirection cardinalDirection, Plateau plateau) {
		super();
		this.x = x;
		this.y = y;
		this.cardinalDirection = cardinalDirection;
		this.plateau = plateau;
		this.commands = new ArrayList<>();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		RoverChecker.setRoverXPositionCheker(this, x);
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		RoverChecker.setRoverYPositionCheker(this, y);
		this.y = y;
	}

	public CardinalDirection getCardinalDirection() {
		return cardinalDirection;
	}

	public void setCardinalDirection(CardinalDirection cardinalDirection) {
		this.cardinalDirection = cardinalDirection;
	}

    public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}
	
	public List<Command> getCommands() {
		return commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}
	
	public void placeOrders() {
		for(Command command: commands) {
			command.execute(this);
		}
		// We should clear commands to not re-execute them
		commands.clear();
	}
	
	public void takeOrder(Command command) {
		commands.add(command);
	}
	
}

