package Lesson04;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static int countGameLevel = 1;

    public static char player = '$';
    public static int playerPosX;
    public static int playerPosY;
    public static int playerHP = 10;
    public static int PlayerSteps = 0;
    public static boolean configurationRandomFirstPos = false;

    public static final int moveUp = 1;
    public static final int moveDown = 2;
    public static final int moveLeft = 3;
    public static final int moveRight = 4;

    public static char emptyCell = '_';
    public static char readyCell = '*';

    public static char enemy = 'X';
    public static int enemyDamage;
    public static int enemyDamageMin = 2;
    public static int enemyDamageMax = 4;

    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapWidth = 3;
    public static int mapHeight = 3;


    public static void main(String[] args) {

        while (isAlivePlayer()) {
            System.out.println(" === Start! Level " + countGameLevel + " === ");
            gameCycle();
            countGameLevel++;
        }
        scanner.close();
        System.out.println(" === Game over! Count Level: " + countGameLevel + ". Count steps: " + PlayerSteps + " ===");

    }

    public static void gameCycle() {
        initMap();
        createPlayer(configurationRandomFirstPos);
        createEnemies();

        while (true) {
            printMap();
            System.out.println("Step: " + PlayerSteps + ". Health: " + playerHP);
            movePlayer();

            if (isFullMap()) {
                System.out.println("OK. Next level");
                break;
            }

            if (!isAlivePlayer()) {
                System.out.println("Player is dead");
                printMap();
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[mapHeight][mapWidth];
        invisibleMap = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = emptyCell;
            }
        }
    }

    public static void createPlayer(boolean isRandom) {
        if (isRandom) {
            playerPosX = randomRange(0, mapWidth - 1);
            playerPosY = randomRange(0, mapHeight - 1);
        } else {
            playerPosX = mapWidth / 2;
            playerPosY = mapHeight / 2;
        }
        map[playerPosY][playerPosX] = player;
    }

    public static void createEnemies() {
        enemyDamage = randomRange(enemyDamageMin, enemyDamageMax);

        int x;
        int y;

        int countEnemies = (mapWidth + mapHeight) / 4;

        for (int i = 0; i < countEnemies; i++) {

            do {
                x = random.nextInt(mapWidth);
                y = random.nextInt(mapHeight);
            } while (x == playerPosX && y == playerPosY);

            invisibleMap[y][x] = enemy;
        }
        System.out.println("Enemies count: " + countEnemies + ". Enemy damage: " + enemyDamage);
    }

    public static void movePlayer() {
        int currentX = playerPosX;
        int currentY = playerPosY;
        int playerDestination;

        do {

            System.out.print("Enter your move (up = " + moveUp + ", down = " + moveDown +
                    ", left = " + moveLeft + ", right = " + moveRight + ") ->>> ");
            playerDestination = scanner.nextInt();

            switch (playerDestination) {
                case moveUp:
                    playerPosY -= 1;
                    break;
                case moveDown:
                    playerPosY += 1;
                    break;
                case moveLeft:
                    playerPosX -= 1;
                    break;
                case moveRight:
                    playerPosX += 1;
                    break;
            }

        } while (!isValidNextMove(currentY, currentX, playerPosY, playerPosX));

        playerNextMoveAction(currentY, currentX, playerPosY, playerPosX);
        ++PlayerSteps;
    }

    public static boolean isFullMap() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] == emptyCell) return false;
            }
        }
        return true;
    }

    public static void playerNextMoveAction(int currentY, int currentX, int nextY, int nextX) {
        if (invisibleMap[nextY][nextX] == enemy) {
            playerHP -= enemyDamage;
            System.out.println("Enemy give damage > " + enemyDamage + ". Player HP = " + playerHP);
        }

        map[currentY][currentX] = readyCell;
        map[playerPosY][playerPosX] = player;
        invisibleMap[playerPosY][playerPosX] = readyCell;

        if (randomActionBuff()) {
            healPlayer(randomRange(10, 20));
        }
    }

    public static boolean isValidNextMove(int currentY, int currentX, int nextY, int nextX) {
        if (nextY >= 0 && nextY < mapHeight && nextX >= 0 && nextX < mapWidth) {
            System.out.println("Player move to [" + (nextX + 1) + ":" + (nextY + 1) + "] success");
            return true;
        } else {
            playerPosY = currentY;
            playerPosX = currentX;
            System.out.println("Invalid move. Please try again!");
            return false;
        }
    }

    public static boolean randomActionBuff() {
        return random.nextInt(100) < 10;
    }

    public static void healPlayer(int value) {
        playerHP += value;
        System.out.println("Player heal on " + value + ". Player HP = " + playerHP);
    }


    public static void printMap() {
        System.out.println("======================");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("======================");
    }

    public static boolean isAlivePlayer() {
        return playerHP > 0;
    }

    public static int randomRange(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

}




