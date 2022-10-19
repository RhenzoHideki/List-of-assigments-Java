package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RobotTest {

    // Inconclusive tests , Might as well test the other fuctions instead of
    // constructor
    // @Test
    // public void robotTest() {
    // // DONE: Do constructor tests
    // Robot walle = new Robot("Wall-e", 200, new int[]{5,2}, "North", 30, 3);

    // // If valid positive position
    // assertEquals( new int[]{3,2} + "North", );

    // }

    // DONE: Do tests that involve the moving methods
    @Test
    public void moveRobotTest() {
        Robot walle = new Robot("Wall-e", 200, new int[] { 5, 2 }, "North", 30, 3);

        // Valid position : Expected True;
        assertTrue(walle.moveRobot());

        walle = new Robot("Wall-e", 200, new int[] { 5, 200 }, "North", 30, 30);

        // Invalid position: Expected False;
        assertFalse(walle.moveRobot());

    }

    // DONE: Do tests with getCoordinatesNow and getCoordinatesBefore
    @Test
    public void getCoordinatesTest() {
        Robot walle = new Robot("Wall-e", 200, new int[] { 5, 2 }, "North", 30, 3);

        assertEquals("5, 2" + "North", walle.getCoordinatesNow());

        walle.moveRobot();

        assertEquals("5, 5" + "North", walle.getCoordinatesNow());

        assertEquals("5, 2", walle.getCoordinatesBefore());

    }

    // DONE: Do tests that involve the rotation methods
    @Test
    public void spinRobotTest() {
        Robot walle = new Robot("Wall-e", 200, new int[] { 5, 2 }, "North", 30, 3);

        assertEquals("5, 2" + "North", walle.getCoordinatesNow());

        walle.spinRobot("E");
        assertEquals("5, 2" + "West", walle.getCoordinatesNow());

        walle.spinRobot("D");
        assertEquals("5, 2" + "North", walle.getCoordinatesNow());

        walle.spinRobot("D");
        assertEquals("5, 2" + "East", walle.getCoordinatesNow());

        walle.spinRobot("D");
        assertEquals("5, 2" + "South", walle.getCoordinatesNow());

    }

    // DONE: Do tests with remaining moves
    @Test
    public void getRemainingMovesTest() {
        Robot walle = new Robot("Wall-e", 200, new int[] { 5, 2 }, "North", 30, 3);

        assertEquals(30, walle.getRemainingMoves());

        walle.moveRobot();

        assertEquals(29, walle.getRemainingMoves());
    }

    @Test
    public void robotPlanTest() {
        // DONE: Do tests that involve the planning methods
        Robot walle = new Robot("Wall-e", 200, new int[] { 5, 2 }, "North", 30, 3);

        String plan = new String("MEDMEEMDM");

        /*
         * Initial thoughts about the test
         * // Load list of commands
         * assertTrue(walle.loadPlanRobot("MEDMEEMDM"));
         * // Execute one command of the list
         * assertTrue(walle.executePlanRobot());
         * // Show remaining commands
         * assertEquals("EDMEEMDM", walle.remainingPlanRobot());
         */

        // More elaborated test
        assertTrue(walle.loadPlanRobot("MEDMEEMDM"));

        for (int i = plan.length(); i > 0; i--) {
            // Execute one command of the list
            assertTrue(walle.executePlanRobot());
            plan = plan.substring(1, plan.length());
            // Show remaining commands
            assertEquals(plan, walle.remainingPlanRobot());
        }
    }
}
