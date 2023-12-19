//This file display the program and takes user input, We have called all file here to be used
//Dalal 1087226	
//Laisa 1089635
package computersInEducation;
//Calling method from files in the same package 
import static computersInEducation.Methods.menu;
import static computersInEducation.Methods.levels;
import static computersInEducation.Methods.list;
import static computersInEducation.Methods.bye;
import static computersInEducation.Methods.bye2;
import static computersInEducation.Learn.Switch;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		//welcoming students
		System.out.println("			Welcome to MATH 4 SMART!");
		System.out.println("This program is created to help elementry student learn the basics of math oprations, + - x / ."
		+"\nThis progrma has 5 types of qustions with 3 diffrent levels that can assest you. There is one rule and only..."
		+ "\n			\"DON'T CHEEAT!!\"");
		
		do {//do while to teach students the basics of math that has the main program

			menu();//calling the menu form the file methods so it will be display it
			
			//ask user to choose one of the options to start learning
			System.out.print("What do you want to learn?");
			int type= input.nextInt();
			
			Switch(type); //calling switch statement form the file learn so it will be display it // the (type) is the user input
			
			if(type==6)// if user choose 6 the code will stop
				break;
		}while(true);
	}
}