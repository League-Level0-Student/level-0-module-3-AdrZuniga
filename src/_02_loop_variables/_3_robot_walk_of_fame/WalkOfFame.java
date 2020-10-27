
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.hide();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(195);
		
		rob.penDown();
		rob.setPenWidth(8);
		rob.setRandomPenColor();
		rob.setSpeed(20);
		
		
		rob.turn(144);
		rob.move(130);
		rob.turn(144);
		rob.move(130);
		rob.turn(-48);
		rob.move(130);
		rob.turn(141);
		rob.move(130);
		rob.turn(-84);
		rob.move(142);
		rob.turn(154);
		rob.move(142);
		rob.turn(-74);
		rob.move(122);
		rob.turn(-224);
		rob.move(122);
		rob.turn(-80);
		rob.move(115);
		rob.turn(150);
		rob.move(134);

		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
