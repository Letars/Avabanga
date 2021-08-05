package Lesson07;


public class main {

    public static void main(String[] args) {
        Robot robot1 = new Robot("OptimusPrime");
        Robot robot2 = new Robot("Megatron");

        robot1.attackLeft(robot2);
        robot1.attackRight(robot2);
        robot1.speak();

    }

    }

