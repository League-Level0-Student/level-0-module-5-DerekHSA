package _09_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obidient_robot {
	static Robot Jojo = new Robot("batman");
public static void main(String[] args) {
	Jojo.setSpeed(1000);
	Jojo.setPenWidth(1000);
	String Shape=JOptionPane.showInputDialog("What shape do you want?");
	String Color=JOptionPane.showInputDialog("What color do you want your shape to be?");
	if (Color.equalsIgnoreCase("blue")) {
		Jojo.setPenColor(0, 0, 100);
	}else if (Color.equalsIgnoreCase("red")){
		Jojo.setPenColor(255, 0 ,0);
	}else if (Color.equalsIgnoreCase("Yellow")){
		Jojo.setPenColor(255, 255 ,0);
	}else if (Color.equalsIgnoreCase("green")){
		Jojo.setPenColor(0, 255 ,0);
	}else if (Color.equalsIgnoreCase("purple")){
		Jojo.setPenColor(148, 0 ,211);
	}else if (Color.equalsIgnoreCase("orange")){
		Jojo.setPenColor(255, 165 ,0);
	}else if (Color.equalsIgnoreCase("white")){
		Jojo.setPenColor(255, 255 ,255);
	}else if (Color.equalsIgnoreCase("black")){
		Jojo.setPenColor(0, 0 ,0);
}
  if(Shape.equalsIgnoreCase("Circle")) {
	drawCircle();
	
}else if(Shape.equalsIgnoreCase("Square")) {
	drawSquare();
}else if(Shape.equalsIgnoreCase("Triangle")) {
	drawTriangle();
}
  








}
public static void drawCircle() {
	for (int i = 0; i < 36; i++) {
		Jojo.penDown();
		Jojo.move(10);
		Jojo.turn(10);
	}
	
	
}
public static void drawTriangle() {
	Jojo.penDown();
	Jojo.turn(31);
	Jojo.move(150);
	Jojo.turn(120);
	Jojo.move(150);
	Jojo.turn(120);
	Jojo.move(150);
	
	
}
public static void drawSquare() {
	Jojo.penDown();
	Jojo.move(100);
	Jojo.turn(90);
	Jojo.move(100);
	Jojo.turn(90);
	Jojo.move(100);
	Jojo.turn(90);
	Jojo.move(100);
}

}
	 


