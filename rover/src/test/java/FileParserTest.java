import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import client.Rover;
import utils.CardinalDirection;
import utils.FileParser;
import utils.Plateau;

class FileParserTest {

	@Test
	void testGetPlateau() {
		String line = "5 10";
		Plateau plateau = FileParser.getPlateau(line);
		assertEquals(5, plateau.getX());
		assertEquals(10, plateau.getY());
	}
	

	@Test
	void testGetRover() {
		Plateau plateau = new Plateau(10, 10);
		String line = "5 8 S";
		Rover rover = FileParser.getRover(line, plateau);
		assertEquals(5, rover.getX());
		assertEquals(8, rover.getY());
		assertEquals(CardinalDirection.S, rover.getCardinalDirection());
	}
	
}
