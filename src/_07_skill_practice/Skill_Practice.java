package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill_Practice {
	public static class SkillPractice {
		 public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		 }

		 void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
String Dimes=JOptionPane.showInputDialog("How many dimes do you have?");



		// Tell them how many cents they have (hint multiply by 10)
int dimes=Integer.parseInt(Dimes);
dimes=dimes*10;
JOptionPane.showMessageDialog(null, "You have "+dimes+" cents.");


		// Ask the user how tall they are (inches)
String inches=JOptionPane.showInputDialog("How tall are you?(Inches)");
int Inches=Integer.parseInt(inches);
if (Inches<36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties.");
}


		// If they are shorter than 36 inches, tell them to eat their Wheaties




		 }

		 void skill2() {// Write a loop to print every third number between 1 and 30 to the console 
for (int i = 0; i < 31; i++) {
	if (i%3==0) {
		System.out.println(i);
	}
}






		 }

		 void skill3() {// Get a random number that is less than 20 and print it to the console 
			 int CrazyDiamond = 0;
				Random ran = new Random();
CrazyDiamond=ran.nextInt(20);
System.out.println(CrazyDiamond);
		// Get another random number that is less than 10 and print it to the console 
int num = 0;
Random JOJO = new Random();
num=JOJO.nextInt(10);
System.out.println(num);

		// Using a pop-up, tell the user the difference between the numbers// Hint: use subtraction 
if (num<CrazyDiamond) {
	int finaly=CrazyDiamond-num;
	JOptionPane.showMessageDialog(null, finaly);
}else if(num>CrazyDiamond) {
	int finaly=num-CrazyDiamond;
	JOptionPane.showMessageDialog(null, "the difference between "+num+" and "+CrazyDiamond+" is "+finaly);
}


			}

		 void skill4() {// In a pop-up, ask the user for the city they live in 
String city=JOptionPane.showInputDialog("In what city do you reside?");


		// If they answered "San Diego", tell them they live in America's Finest City 
if (city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's finest city.");
}else {
	JOptionPane.showMessageDialog(null, "Get out of that trash pit and move to San Diego.");
}


		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has.
			 // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String car=JOptionPane.showInputDialog("How many cars does your family have?");
int cars=Integer.parseInt(car);

		// If there is 1 car, use a pop-up to display the make/model of the car 

if (cars==0) {
	JOptionPane.showMessageDialog(null, "I be you use public transportation");
}else if(cars>1) {
	cars=cars*4;
	JOptionPane.showMessageDialog(null, "The number of wheels between your cars are "+cars);
}

		// If there is more than 1 car, use a pop-up to display how many wheels the
			 // cars have between them. 



		 }

		 void skill5() {// In a pop-up, ask the user for the name of their school 

String School=JOptionPane.showInputDialog("What is the name of your school?");
JOptionPane.showMessageDialog(null, "Your school, "+School+", is a fantastic school.");
		// In another pop-up, tell the user, that their school is a fantastic school.// You must include the name of the school in the message. 



		 }
		 }

}
