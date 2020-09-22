
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		
	Robot r = new Robot();
		
	r.setPenWidth(10);
	
	String colors = JOptionPane.showInputDialog("What color would you like?");
		
	
	r.setSpeed(15);
	r.move(30);
	r.turn(90);
	r.move(30);
	r.turn(90);
	r.move(42);
	r.turn(90);
	r.move(42);
	r.turn(90);
	r.move(42);
	
	
	
	if(colors.equals("red")) {
		r.setPenColor(Color.red);
	}if(colors.equals("blue")) {
		r.setPenColor(Color.blue);
	}if(colors.equals("yellow")) {
		r.setPenColor(Color.yellow);
	}if(colors.equals("green")) {
		r.setPenColor(Color.green);
	}if(colors.equals("pink")) {
		r.setPenColor(Color.pink);
	}if(colors.equals("orange")) {
		r.setPenColor(Color.orange);
	}else {
		r.setRandomPenColor();
	}
	
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
