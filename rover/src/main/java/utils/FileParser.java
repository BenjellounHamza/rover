package utils;

import commands.CommandFactory;
import model.*;

public class FileParser {

	public static Plateau getPlateau(String line) throws IllegalArgumentException {
        FileChecker.checkPlateau(line);
		String[] plateauDimension = line.split(" ");
        int plateauX = Integer.parseInt(plateauDimension[0]);
        int plateauY = Integer.parseInt(plateauDimension[1]);
        return new Plateau(plateauX, plateauY);
	}

	public static Rover getRover(String line, Plateau plateau) throws IllegalArgumentException {
        FileChecker.checkRover(line, plateau);
        String[] roverPosition = line.split(" ");
        int roverX = Integer.parseInt(roverPosition[0]);
        int roverY = Integer.parseInt(roverPosition[1]);
        CardinalDirection roverDirection = CardinalDirection.valueOf(roverPosition[2]);
        return new Rover(roverX, roverY, roverDirection, plateau);
	}

	public static void addOrders(String line, Rover rover) {
		
		FileChecker.checkCommands(line);
		for (char operation: line.toCharArray()) {
             rover.takeOrder(CommandFactory.getOperation(operation));
		 }
		
	}
	
}
