package utils;

import model.Rover;

public class SetterChecker {
	
	public static void setRoverXPositionCheker(Rover rover, int x){
		if(x > rover.getPlateau().getX() || x < 0) {
			throw new IllegalArgumentException("The rover's coordinates must not be null or beyond plateau's ones");
		}
	}
	
	public static void setRoverYPositionCheker(Rover rover, int y){
		if(y > rover.getPlateau().getY() || y < 0) {
			throw new IllegalArgumentException("The rover's coordinates must not be null or beyond plateau's ones");
		}
	}
}
