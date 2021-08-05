package Lesson07.RobotParts;
import Lesson07.Robot;

public class Leg extends Part {

    private int speed;

    public Leg(Robot robot, String name, int levelValue) {
        super(robot, name);
        this.robotLevel = levelValue;
        this.speed = calculateSpeed();
    }

    private int calculateSpeed(){
        return robotLevel + generateRandomBorder(robotLevel, nameParts.length());
    }

    public int getSpeed() {
        return speed;
    }
}

