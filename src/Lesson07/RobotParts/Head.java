package Lesson07.RobotParts;
import Lesson07.Robot;

public class Head extends Part {

    private final int maxString = 43;

    public Head(Robot robot, String name) {
        super(robot, name);
    }

    public String randomString() {
        String tmpString = "";

        for (int i = 0; i < maxString; i++) {
            int valueAscii = generateRandomBorder(70, 90);
            char tmpChar = (char) valueAscii;
            tmpString += tmpChar;
        }
        return tmpString;
    }
}

