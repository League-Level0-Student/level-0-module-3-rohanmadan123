
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		int i = (int)(51*Math.random());
		//1. Create a new Robot
		Robot randy = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		randy.setPenWidth(10);
		String userColor = JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
		String blue = "blue";
		String red = "red";
		String green = "green";
		String nothing = "";
		randy.penDown();
		randy.setSpeed(10);
		//3. Set the pen width to 10
		if(userColor.equalsIgnoreCase(blue)) {
			randy.setPenColor(0,0,255);
		} 
		if(userColor.equalsIgnoreCase(green)) {
			randy.setPenColor(0,255,0);
		}
		if(userColor.equalsIgnoreCase(red)) {
			randy.setPenColor(255,0,0);
		}
		if(userColor.equalsIgnoreCase(nothing)) {
			randy.setPenColor((int)(256*Math.random()), (int)(256*Math.random()), (int)(256*Math.random()));
		}
		randy.move(100);
		randy.turn(90);
		randy.move(100);
		randy.turn(90);
		randy.move(100);
		randy.turn(90);
		randy.move(100);
		randy.turn(90);
		
		
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
