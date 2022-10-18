package engtelecom.poo;

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
    private String LoadedCommands;
    // Private Methods

    /**
     * Private method to randomize coordinates
     * 
     * @param area
     * @return
     */
    private int[][] randomizeCoordinates(int area) {
        return null;
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
        this.coordinatesNow = coordinatesNow;
        this.direction = direction;
        this.maxMoves = maxMoves;
        this.unitsMove = unitsMove;
    }

    /**
     * Method that gets the Coordinates from the current point and which direction
     * is point
     * 
     * @return - Returns a string coordinates[] and direction pointed
     */
    public String getCoordinatesNow() {
        return null;
    }

    /**
     * Method that gets the past coordinate
     * 
     * @return - Returns a string coodinates[]
     */
    public String getCoordinatesBefore() {
        return null;
    }

    /**
     * Method that changes the direction of the robot
     * 
     * @param rotation - Indicates if the rotation is going to be clockwise or
     *                 anticlockwise
     * @return - Returns a string with the direction that is pointing now
     */
    public String spinRobot(String rotation) {
        return null;
    }

    /**
     * Method that moves the robot
     * 
     * @return - true if possible to move, false if invalid move
     */
    public boolean moveRobot() {
        return true;
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
        return false;
    }

    /**
     * Method that execute the plan
     * 
     * @return - true if able to run , false contrary
     */
    public boolean executePlanRobot() {
        return false;
    }

    /**
     * Method that shows the remaining commands to be executed
     * 
     * @return - a string with the remaining commands
     */
    public String remainingPlanRobot() {
        return null;
    }

}
