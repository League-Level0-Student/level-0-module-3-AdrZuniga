
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		
	Robot r = new Robot();
	r.penDown();
	r.setPenWidth(10);
	
	String colors = JOptionPane.showInputDialog("What color would you like?");
		
	int number=5;
	
	if(number == 5) {
		JOptionPane.showMessageDialog(null, "its five");
	}
	else if(number < 4) {
		JOptionPane.showMessageDialog(null, "its less than four");

	}else {
		JOptionPane.showMessageDialog(null, "its four or a greater number");

	}
	
	
	if(colors.equals("red")) {
		System.out.println("Testing");
		r.setPenColor(Color.red);
	}
	else if(colors.equals("blue")) {
		r.setPenColor(Color.blue);
	}
	else if(colors.equals("yellow")) {
		r.setPenColor(Color.yellow);
	}
	else if(colors.equals("green")) {
		r.setPenColor(Color.green);
	}
	else if(colors.equals("pink")) {
		r.setPenColor(Color.pink);
	}
	else if(colors.equals("orange")) {
		r.setPenColor(Color.orange);
	}
	else {
		r.setRandomPenColor();
	}
	r.setSpeed(15);
	r.move(60);
	r.turn(90);
	r.move(60);
	r.turn(90);
	r.move(67);
	r.turn(90);
	r.move(67);
	r.turn(90);
	r.move(67);
	r.turn(90);
	r.move(71);
	r.turn(90);
	r.move(71);
	r.turn(90);
	r.move(71);
	r.turn(90);
	r.move(71);
	
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
