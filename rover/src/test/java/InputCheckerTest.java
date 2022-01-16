import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utils.InputChecker;
import utils.Plateau;

class InputCheckerTest {

    @Test
    void checkPlateauTest1() {
    	
        String line = "0 0";
        Exception  exception = assertThrows(IllegalArgumentException.class, () -> {
			InputChecker.checkPlateau(line);
	    });
        
        assertEquals("The plateau's coordinates must be greater than 0", exception.getMessage());
    
    }
    
    @Test
    void checkPlateauTest2() {
    	
        String line = "5";
        Exception  exception = assertThrows(IllegalArgumentException.class, () -> {
			InputChecker.checkPlateau(line);
	    });
        
        assertEquals("The plateau shoud have 2 coordinates", exception.getMessage());
    
    }

    @Test
    void checkRoverTest1() {
    	
        String line = "1 N";
        Plateau plateau = new Plateau(3, 4);
        
        Exception  exception = assertThrows(IllegalArgumentException.class, () -> {
			InputChecker.checkRover(line, plateau);
	    });
        
        assertEquals("The rover shoud have 2 coordinates and one direction", exception.getMessage());
    }
    
    @Test
    void checkRoverTest2() {
    	
        String line = "1 1 X";
        Plateau plateau = new Plateau(3, 4);
        
        Exception  exception = assertThrows(IllegalArgumentException.class, () -> {
			InputChecker.checkRover(line, plateau);
	    });
        
        assertEquals("The rover's direction must be N, E, S or W", exception.getMessage());
    }
    
    @Test
    void checkRoverTest3() {
    	
        String line = "8 6 N";
        Plateau plateau = new Plateau(3, 4);
        
        Exception  exception = assertThrows(IllegalArgumentException.class, () -> {
			InputChecker.checkRover(line, plateau);
	    });
        
        assertEquals("The rover's coordinates must be less than plateau's ones", exception.getMessage());
    }

}
