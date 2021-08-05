package Lesson07.RobotParts;
import Lesson07.Robot;

public class Hand extends Part {

    private int damage;

    public Hand(Robot robot, String name, int valueLevel) {
        super(robot, name);
        this.robotLevel = valueLevel;
        this.damage = calculateHandDamage();
    }

    public void giveDamage(Part robotPart) {
        robotPart.getDamage(damage);
        System.out.println(robot.getName() + " > " + nameParts + " give damage to " + robotPart.getNameParts() + " " + damage + " points");
    }

    private int calculateHandDamage() {
        return robotLevel * 2 + generateRandomValue(10);
    }
}

