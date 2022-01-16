import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import client.*;
import commands.*;
import utils.*;

class CommandsTest {
	
	Plateau plateau;
	Rover rover;
	
	@BeforeEach 
    public void init() {
		plateau = new Plateau(5, 5);
		rover = new Rover(1, 2, CardinalDirection.N, plateau);
    }

	@Test
	void testMove() {
		Command command = new Move();
		rover.takeOrder(command);
		assertSame(rover.getCommands().get(rover.getCommands().size() - 1), command);
		rover.placeOrders();;
		assertEquals(1, rover.getX());
		assertEquals(3, rover.getY());
		assertEquals(rover.getCardinalDirection(), CardinalDirection.N);
	}
	
	@Test
	void testSpinR() {
		Command command = new SpinR();
		rover.takeOrder(command);
		assertSame(rover.getCommands().get(rover.getCommands().size() - 1), command);
		rover.placeOrders();;
		assertEquals(1, rover.getX());
		assertEquals(2, rover.getY());
		assertEquals(rover.getCardinalDirection(), CardinalDirection.E);
	}
	
	@Test
	void testSpinL() {
		Command command = new SpinL();
		rover.takeOrder(command);
		assertSame(rover.getCommands().get(rover.getCommands().size() - 1), command);
		rover.placeOrders();;
		assertEquals(1, rover.getX());
		assertEquals(2, rover.getY());
		assertEquals(rover.getCardinalDirection(), CardinalDirection.W);
	}
	
	@Test
	void testMoveExceptionY() {
		rover.setY(5);
		Command command = new Move();
		rover.takeOrder(command);
		assertThrows(IllegalArgumentException.class, () -> {
			rover.placeOrders();
	    });
		
	}
	
	@Test
	void testMoveExceptionX() {
		rover.setX(5);
		rover.setCardinalDirection(CardinalDirection.E);
		Command command = new Move();
		rover.takeOrder(command);
		assertThrows(IllegalArgumentException.class, () -> {
			rover.placeOrders();
	    });
		
	}

}
