import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Scanner;

import commander.Plateau;
import commander.Rover;
import utils.FileParser;

public class Main {
	public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
		  
        String pathToFile = Paths.get(Rover.class.getClassLoader().getResource("input.txt").toURI()).toString();
        File file = new File(pathToFile);
        try (Scanner input = new Scanner(file)) {
			Plateau plateau = FileParser.getPlateau(input.nextLine());
			
			while (input.hasNextLine()) {                
			 Rover rover = FileParser.getRover(input.nextLine(), plateau);
			 FileParser.addOrders(input.nextLine(), rover);
			 rover.placeOrders();
			 System.out.println(rover.getX() + " " + rover.getY() + " " + rover.getCardinalDirection());

			}
		}
	
	}
}
