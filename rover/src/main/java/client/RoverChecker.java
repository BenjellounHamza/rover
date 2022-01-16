package client;

public class RoverChecker {
	
	public static void setRoverXPositionCheker(Rover rover, int x){
		if(x > rover.getPlateau().getX() || x < 0) {
			throw new IllegalArgumentException("We can't move outside the plateau");
		}
	}
	
	public static void setRoverYPositionCheker(Rover rover, int y){
		if(y > rover.getPlateau().getY() || y < 0) {
			throw new IllegalArgumentException("We can't move outside the plateau");
		}
	}
}
