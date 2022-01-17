package utils;

import client.*;
import commands.CommandEnum;

public class FileParser {

	public static Plateau getPlateau(String line) throws IllegalArgumentException {
        InputChecker.checkPlateau(line);
		String[] plateauDimension = line.split(" ");
        int plateauX = Integer.parseInt(plateauDimension[0]);
        int plateauY = Integer.parseInt(plateauDimension[1]);
        return new Plateau(plateauX, plateauY);
	}

	public static Rover getRover(String line, Plateau plateau) throws IllegalArgumentException {
        InputChecker.checkRover(line, plateau);
        String[] roverPosition = line.split(" ");
        int roverX = Integer.parseInt(roverPosition[0]);
        int roverY = Integer.parseInt(roverPosition[1]);
        CardinalDirection roverDirection = CardinalDirection.valueOf(roverPosition[2]);
        return new Rover(roverX, roverY, roverDirection, plateau);
	}

	public static void addOrders(String line, Rover rover) {
		InputChecker.checkCommands(line);
		for (String operation: line.split("")) {
             rover.takeOrder(CommandEnum.valueOf(operation).getCommand());
		 }
		
	}
	
}
