//Dalal 1087226			
//Laisa 1089635
package computersInEducation;
import static computersInEducation.Quiz.quiz;
import static computersInEducation.Methods.bye2;


import java.util.Scanner;

public class Learn {

	public static void main(String[] args) {}
	
	public static void Switch(int n) { //define new method called switch 
		Scanner input= new Scanner(System.in);

		switch(n) { 
					case 1: //case one has the multiplication table
						System.out.println("			Multiplication Table");
						//for loop to generate multiplication table for the 12 numbers	
						for (int num = 1; num <= 12; num++) {  //num is the numbers that will be multiplied with 
							for (int i = 1; i <=12 ; i++) {	//i is the the multiplication table of number. e.g: multiplication table of 2    
								System.out.printf("%2d x %2d = %3d  ", i, num, num * i);	// this will print the table %2d and %3d are for adding space to make suer that the numbers are align correctly
							}
							System.out.println();//print line after executing the for loop	
						}
						
						System.out.println("\n\nTo learn how to mulitply, just add the number mltiple time.\nFor example 3 x 2 is the same as 3+3 which equals to 6!\n");

						int time3=0;
						while (time3<3) {
							//Declaring 2 random numbers to teach kids addition
							int num1 = (int) (Math.random() * 13);//the random numbers range between 0 and 6 so the students just use their 10 fingers
							int num2 = (int) (Math.random() * 13);//the random numbers range between 0 and 6 so the students just use their 10 fingers
							int answer2=0;
							//if n1 is less than n2 swipe numbers make it easer on student to solve
							do {
							System.out.printf("%2d x %2d =  ", num1, num2); //print the question
							answer2 = input.nextInt();//read student answer
							//if statement to check if the answer is correct 

							if (answer2 == num1 * num2) {//check if the answer is equal to num1 + num2
								//if answer correct print this
								System.out.println("Your answer is correct.\n");
								break; // Exit the loop if the answer is correct
							} else {//if answer correct print this
								System.out.println("Try again.");   
							}   
							}while(answer2!=(num1 * num2));
							time3++;
						}
						
						break;//break so it do not go to the next case	
					case 2: 
						System.out.println("				Division Table");
						//for loop to generate division table for the 12 numbers
						for (int num = 1; num <= 12; num++) { //num is the numbers that will be divide by 
							for (int i = 1; i <=12 ; i++) { //i is the the division table of number. e.g: division table of 2
					        
								System.out.printf("%2d / %2d = %3d  ", i, num, i / num);
							}
							System.out.println();  //print line after executing the for loop
						}
						System.out.println("\n\nTo learn how to divid, imagen cirles and add to each cirle the number you want to divide.\nFor example 6/3 in gen 3 circle and add to each cirle 1 until to reach 6\n");
						int time2=0;
						while (time2<3) {
							//Declaring 2 random numbers to teach kids addition
							int num1 = (int) (Math.random() * 30);//the random numbers range between 0 and 6 so the students just use their 10 fingers
							int num2 = (int) (Math.random() * 30);//the random numbers range between 0 and 6 so the students just use their 10 fingers
							int answer2=0;
							//if n1 is less than n2 swipe numbers make it easer on student to solve
							if (num1<num2) {
								int temp = num2; //temp or temporary holds n2 
								num2=num1; //the numbers are swiped n2 takes the value of n1
								num1= temp;//n1 is assigned with the original value of n2
							}
							do {
							System.out.printf("%2d / %2d =  ", num1, num2); //print the question
							answer2 = input.nextInt();//read student answer
							//if statement to check if the answer is correct 

							if (answer2 == num1 / num2) {//check if the answer is equal to num1 + num2
								//if answer correct print this
								System.out.println("Your answer is correct.\n");
								break; // Exit the loop if the answer is correct
							} else {//if answer correct print this
								System.out.println("Try again.");   
							}   
							}while(answer2!=(num1 / num2));
							time2++;
						}
						break;//break so it do not go to the next case
					
					case 3: 
						System.out.println("				Addition");
						System.out.println("To learn how to add, you can use your ten fingers to help you.");
						//while loop to generate easy addition question for learning
						int time1=0;
						while (time1<3) {
							//Declaring 2 random numbers to teach kids addition
							int num1 = (int) (Math.random() * 7);//the random numbers range between 0 and 6 so the students just use their 10 fingers
							int num2 = (int) (Math.random() * 7);//the random numbers range between 0 and 6 so the students just use their 10 fingers
							int answer=0;
							do {
							System.out.printf("%2d + %2d =  ", num1, num2); //print the question
							answer = input.nextInt();//read student answer
							//if statement to check if the answer is correct 

							if (answer == num1 + num2) {//check if the answer is equal to num1 + num2
								//if answer correct print this
								System.out.println("Your answer is correct.");
								break; // Exit the loop if the answer is correct
							} else {//if answer correct print this
								System.out.println("Try again.");   
							}   
							}while(answer!=(num1 + num2));
							time1++;
						}
						//print line after executing the for loop
						System.out.println();		
						break;//break so it do not go to the next case
						
					case 4: 
						System.out.println("				Subtraction");
						System.out.println("To learn how to subtract, use your ten fingers to help you.");
						//while loop to generate easy subtraction question for learning
						int time=0;
						while (time<3) {
							//Declaring 2 random numbers to teach kids subtraction
							int n1 = (int) (Math.random() * 11);//the random numbers range between 0 and 10 so the students just use their 10 fingers
							int n2 = (int) (Math.random() * 11);//the random numbers range between 0 and 10 so the students just use their 10 fingers
					        
							//if n1 is less than n2 swipe numbers make it easer on student to solve
							if (n1<n2) {
								int temp = n2; //temp or temporary holds n2 
								n2=n1; //the numbers are swiped n2 takes the value of n1
								n1= temp;//n1 is assigned with the original value of n2
							}
							int ans=0;
							do {
								System.out.printf("%2d - %2d =  ", n1, n2); //print the question
								ans = input.nextInt();//read student answer
								//if statement to check if the answer is correct 
								if (ans == n1 - n2) {//check if the answer is equal to num1 - num2
									//if answer correct print this
									System.out.println("Your answer is correct.\n");
									break; // Exit the loop if the answer is correct
								} else {//if answer correct print this
									System.out.println("Try again.");  
								}
						}while(ans!=(n1 - n2));
							time++;
						}
						System.out.println();  //print line after executing the for loop
						break;//break so it do not go to the next case
					case 5:
						quiz();
						break;
					
					case 6:
						bye2();
						break;
					}
			}
	}