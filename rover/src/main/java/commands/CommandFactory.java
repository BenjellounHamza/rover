package commands;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    static Map<Character, Command> operationMap = new HashMap<Character, Command>();

    static {
        operationMap.put('M', new Move());
        operationMap.put('R', new SpinR());
        operationMap.put('L', new SpinL());
    }
    public static Command getOperation(char operator) {
        return operationMap.get(operator);
    }
}