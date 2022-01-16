package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FileChecker {

	
	static private Set<String> possibleDirections = new HashSet<>(Arrays.asList("N", "E", "S", "W"));
	static private Set<Character> possibleCommands = new HashSet<>(Arrays.asList('L', 'R', 'M'));
	
	
	public static void checkPlateau(String line) throws IllegalArgumentException{
		String[] plateauDimension = line.split(" ");
		if(plateauDimension.length < 2) {
            throw new IllegalArgumentException("The plateau shoud have 2 coordinates");
		}
        if (Integer.parseInt(plateauDimension[0]) <= 0 || Integer.parseInt(plateauDimension[1]) <= 0) {
            throw new IllegalArgumentException("The plateau's coordinates must be greater than 0");
        }
		
	}

	public static void checkRover(String line, Plateau plateau) throws IllegalArgumentException {
		String[] roverPosition = line.split(" ");
		
		if(roverPosition.length < 3) {
            throw new IllegalArgumentException("The rover shoud have 2 coordinates and one direction");
		}
		if (Integer.parseInt(roverPosition[0]) > plateau.getX() || Integer.parseInt(roverPosition[1]) > plateau.getY()) {
	           throw new IllegalArgumentException("The rover's coordinates must be less than plateau's ones");
	 }
		if (roverPosition[2].isEmpty() || !possibleDirections.contains(roverPosition[2])) {
	           throw new IllegalArgumentException("The rover's direction must be N, E, S or W");
	 }
	}

	public static void checkCommands(String line) throws IllegalArgumentException{
		for (char command: line.toCharArray()) {
            if(!possibleCommands.contains(command)) {
 	           throw new IllegalArgumentException("The rover's commands must be either M, L or R");
            }
		 }
	}

}
