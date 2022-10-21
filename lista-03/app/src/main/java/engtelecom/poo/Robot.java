package engtelecom.poo;

import java.util.Arrays;
import java.util.Random;

/**
 * Class made to simulate a space robot
 * 
 * @author Rhenzo Hideki Silva Kajikawa
 */
public class Robot {
    /** Maximum unities moves that a robot can do per command */
    private final int MAX_MOVES = 100;
    /** Robot's Unique identifier */
    private final String ID;
    /** Area where the robot can explore */
    private final int AREA;
    /** Valid Directions where the robot can point */
    public static final String[] DIRECTIONS = { "North", "East", "South", "West" };
    /** Clockwise attribute */
    public static final String CLOCKWISE = "D";
    /** Anticlockwise attribute */
    public static final String ANTICLOCKWISE = "E";
    /** String with the commands possible to load */
    public static final String COMMANDS = "(.*)E(.*)(.*)D(.*)(.*)M(.*)";

    /** Coordinates where is the robot */
    private int[] coordinatesNow;
    /** Coordinates where the robot was before */
    private int[] coordinatesBefore;
    /** Direction where the robot starts pointing towards */
    private String direction;
    /** Maximum moves that the robot can do before running out of energy */
    private int maxMoves;
    /** Unities that the robot moves per command */
    private int unitsMove;
    /** String that save the list of commands that will run */
    private String loadedCommands;
    // Private Methods

    /**
     * Private method to randomize coordinates
     * 
     * @param area
     * @return
     */
    private int[] randomizeCoordinates() {
        Random r = new Random();
        int[] randomCoordinates = { r.nextInt(AREA), r.nextInt(AREA) };
        return randomCoordinates;
    }

    /**
     * Methods setCoordinatesNow ,
     * Just verifies if conditions
     */
    private void setCoordinatesNow(int[] coordinatesNow) {
        if ((0 <= coordinatesNow[0] && coordinatesNow[0] <= AREA)
                && (0 <= coordinatesNow[1] && coordinatesNow[1] <= AREA)) {
            this.coordinatesNow = coordinatesNow;
        } else {
            this.coordinatesNow = randomizeCoordinates();
        }
    }

    private void setDirection(String direction) {
        if (Arrays.asList(DIRECTIONS).contains(direction)) {
            this.direction = direction;
        } else {
            this.direction = DIRECTIONS[0];
        }
    }

    static int binarySearch(String[] arr, String x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Public Methods

    /**
     * Contructive method Robot
     * 
     * @param id          - Unique identifier
     * @param lenght      - Area where the robot can explore
     * @param coordinates - Initial coordinates where the robot starts
     * @param direction   - Direction where the robot starts pointing towards
     * @param maxMoves    - Maximum moves that the robot can do before running out
     *                    of energy
     * @param unitsMove   - Unities that the robot moves per command
     */
    public Robot(String id, int area, int[] coordinatesNow, String direction, int maxMoves, int unitsMove) {
        ID = id;
        AREA = area;
        this.setCoordinatesNow(coordinatesNow);
        this.setDirection(direction);
        this.maxMoves = maxMoves;
        this.unitsMove = unitsMove;
        this.coordinatesBefore = this.coordinatesNow;
    }

    /**
     * Method Only used for debug
     * 
     * @return - Returns the coordinates in Array
     */
    public int[] getCoordinates() {
        return (this.coordinatesNow);
    }

    /**
     * Method that gets the Coordinates from the current point and which direction
     * is point
     * 
     * @return - Returns a string coordinates[] and direction pointed
     */
    public String getCoordinatesNow() {
        return (this.coordinatesNow[0] + ", " + this.coordinatesNow[1] + " " + this.direction);
    }

    /**
     * Method that gets the past coordinate
     * 
     * @return - Returns a string coodinates[]
     */
    public String getCoordinatesBefore() {
        return (this.coordinatesBefore[0] + ", " + this.coordinatesBefore[1]);
    }

    /**
     * Method that changes the direction of the robot
     * 
     * @param rotation - Indicates if the rotation is going to be clockwise or
     *                 anticlockwise
     * @return - Returns a string with the direction that is pointing now
     */
    public String spinRobot(String rotation) {
        // Objective, change de direction where the robot is looking;
        // Get the position where
        int pos = binarySearch(DIRECTIONS, this.direction);
        // 75454693

        if (rotation == CLOCKWISE) {
            if (pos + 1 >= DIRECTIONS.length)
                this.direction = DIRECTIONS[0];
            else
                this.direction = DIRECTIONS[pos + 1];

        } else if (rotation == ANTICLOCKWISE) {

            if (pos - 1 < 0)
                this.direction = DIRECTIONS[DIRECTIONS.length - 1];
            else
                this.direction = DIRECTIONS[pos - 1];
        }
        return this.direction;
    }

    /**
     * Method that moves the robot
     * 
     * @return - true if possible to move, false if invalid move
     */
    public boolean moveRobot() {
        // DONE: Work in the moveRobot() method
        // Objective, be able to read the direction of the robot and move towards that
        // direction
        // North , East , Weast , South
        boolean ableToMove = false;
        // TODO: Simplify this IFs for 2 methods that receives an int ( 0 for x , 1 for
        // y ) one that goes foward and other goes back
        switch (this.direction) {
            case "North":
                if (this.coordinatesNow[1] + this.unitsMove <= this.AREA) {
                    this.coordinatesBefore = this.coordinatesNow.clone();
                    this.coordinatesNow[1] = this.coordinatesNow[1] + this.unitsMove;
                    ableToMove = true;
                }

                break;

            case "East":
                if (this.coordinatesNow[0] + this.unitsMove <= this.AREA) {
                    this.coordinatesBefore = this.coordinatesNow.clone();
                    this.coordinatesNow[0] = this.coordinatesNow[0] + this.unitsMove;
                    ableToMove = true;
                }

                break;
            case "West":
                if (this.coordinatesNow[0] - this.unitsMove >= 0) {
                    this.coordinatesBefore = this.coordinatesNow.clone();
                    this.coordinatesNow[0] = this.coordinatesNow[0] + this.unitsMove;
                    ableToMove = true;
                }

                break;
            case "South":
                if (this.coordinatesNow[1] - this.unitsMove >= 0) {
                    this.coordinatesBefore = this.coordinatesNow.clone();
                    this.coordinatesNow[1] = this.coordinatesNow[1] + this.unitsMove;
                    ableToMove = true;
                }
                break;
        }
        if (ableToMove)
            this.maxMoves--;
        return ableToMove;
    }

    /**
     * Method that get the remaining moves
     * 
     * @return value of the remaining moves
     */
    public int getRemainingMoves() {
        return maxMoves;
    }

    /**
     * Method that loads a plan to be executed
     * 
     * @param plan - A series of commands
     * @return - true if able to load , false contrary
     */
    public boolean loadPlanRobot(String plan) {
        // DONE: Work in the method loadPlanRobot()
        // Objective : be able to load Valid commands
        // return false case someone tries to load invalid commands
        boolean check = plan.matches(COMMANDS);
        if (check)
            this.loadedCommands = plan;
        return check;
    }

    /**
     * Method that execute the plan
     * 
     * @return - true if able to run , false contrary
     */
    public boolean executePlanRobot() {
        // DONE: Work in the method executePlanRobot()
        // Objective: be able to execute Valid commands
        // return false case some commands break robot rules , like passing limits
        char first = this.loadedCommands.charAt(0);
        boolean check = false;
        if (first == this.COMMANDS.charAt(0) || first == this.COMMANDS.charAt(1)) {
            this.spinRobot(this.loadedCommands.substring(0));
            check = true;
        } else {
            this.moveRobot();
            check = true;
        }
        this.loadedCommands = this.loadedCommands.substring(1, this.loadedCommands.length());
        return check;
    }

    /**
     * Method that shows the remaining commands to be executed
     * 
     * @return - a string with the remaining commands
     */
    public String remainingPlanRobot() {
        return this.loadedCommands;
    }

}
