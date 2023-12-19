//Dalal 1087226		
//Laisa 1089635
package computersInEducation;
import static computersInEducation.Methods.levels;
import static computersInEducation.Methods.list;
import static computersInEducation.Methods.bye;

import java.util.Scanner;


public class Quiz {

	public static void main(String[] args) {
	}
	public static void quiz() {
		Scanner input= new Scanner(System.in);
		//program menu for the questions level
		System.out.println("\t\t\t\tQize Time");
		System.out.println("\t\t\t\tWlcome to Qize"); //Easy uses just 1 digit
		System.out.println("You will be tasted to check your undrestand of the baisc opration in math"); //Intermediate uses 2-3 digits
		System.out.println("There is 3 levels you will start with the easy one with 5 questions and then after you answer them correctly you will be moved to the next level");//Hard uses 1-3 digits and different operators at the same time
		System.out.println("\t\t\t\tDon't cheat");//Exit the program
		
		int count=0;
		int qestions=15;
		
		while(count<14) {
			
			for(int i=0; i<5;i++) {
			int Q=(int)(Math.random()*4);
			switch(Q) {
			case 0:
				
					//Declaring 2 random numbers to test kids addition
					int num1 = (int) (Math.random() * 13);
					int num2 = (int) (Math.random() * 13);
					int answer1=0;
					//if n1 is less than n2 swipe numbers make it easer on student to solve
					do {
					System.out.printf("%2d x %2d =  ", num1, num2); //print the question
					answer1 = input.nextInt();//read student answer
					//if statement to check if the answer is correct 

					if (answer1 == num1 * num2) {//check if the answer is equal to num1 * num2
						//if answer correct print this
						System.out.println("Your answer is correct.\n");
						count++;
						break; // Exit the loop if the answer is correct
					} else {//if answer correct print this
						System.out.println("Try again.");   
					}   
					}while(answer1!=(num1 * num2));
					
				
				break;
			
			case 1:
					//Declaring 2 random numbers to test kids addition
					int num3 = (int) (Math.random() * 11)+1;
					int num4 = (int) (Math.random() * 11)+1;
					int answer2=0;
					//if n1 is less than n2 swipe numbers make it easer on student to solve
					if (num3<num4) {
						int temp = num4; //temp or temporary holds n2 
						num2=num3; //the numbers are swiped n2 takes the value of n1
						num3= temp;//n1 is assigned with the original value of n2
					}
					do {
					System.out.printf("%2d / %2d =  ", num3, num4); //print the question
					answer2 = input.nextInt();//read student answer
					//if statement to check if the answer is correct 

					if (answer2 == num3 / num4) {//check if the answer is equal to num1 / num2
						//if answer correct print this
						System.out.println("Your answer is correct.\n");
						count++;
						break; // Exit the loop if the answer is correct
					} else {//if answer correct print this
						System.out.println("Try again.");   
					}   
					}while(answer2!=(num3 / num4));
				
				break;
			
		
		    case 2:
					//Declaring 2 random numbers to test kids addition
					int num5 = (int) (Math.random() * 11);
					int num6 = (int) (Math.random() * 11);
					int answer3=0;
					do {
					System.out.printf("%2d + %2d =  ", num5, num6); //print the question
					answer3 = input.nextInt();//read student answer
					//if statement to check if the answer is correct 

					if (answer3 == num5 + num6) {//check if the answer is equal to num1 + num2
						//if answer correct print this
						System.out.println("Your answer is correct.\n");
						count++;
						break; // Exit the loop if the answer is correct
					} else {//if answer correct print this
						System.out.println("Try again.");   
					}   
					}while(answer3!=(num5 + num6));
					
				
				break;
			
			
			case 3:
					//Declaring 2 random numbers to teach kids subtraction
					int num7 = (int) (Math.random() * 11);
					int num8 = (int) (Math.random() * 11);
			        
					//if n1 is less than n2 swipe numbers make it easer on student to solve
					if (num7<num8) {
						int temp = num8; //temp or temporary holds n2 
						num8=num7; //the numbers are swiped n2 takes the value of n1
						num7= temp;//n1 is assigned with the original value of n2
					}
					int answer4=0;
					do {
						System.out.printf("%2d - %2d =  ", num7, num8); //print the question
						answer4 = input.nextInt();//read student answer
						//if statement to check if the answer is correct 
						if (answer4 == num7 - num8) {//check if the answer is equal to num1 - num2
							//if answer correct print this
							System.out.println("Your answer is correct.\n");
							count++;
							break; // Exit the loop if the answer is correct
						} else {//if answer correct print this
							System.out.println("Try again.");  
						}
				}while(answer4!=(num7 - num8));
				
				
				break;
			
			}
			}	
			
////////////////////////////////////////////////////////////////////////////////////////////////////
			
	    	System.out.println("\n--------This is the second level the qesutions will be constist of number that have 2 digits --------\n");

	    	for(int j=0; j<5;j++) {
			int QQ=(int)(Math.random()*4);
			switch(QQ) {
			case 0:
				
					//Declaring 2 random numbers to test kids addition
					int num1=(int)(Math.random()*90)+10;	
					int num2=(int)(Math.random()*90)+10;
					int answer1=0;
					do {
					System.out.printf("%2d x %2d =  ", num1, num2); //print the question
					answer1 = input.nextInt();//read student answer
					//if statement to check if the answer is correct 

					if (answer1 == num1 * num2) {//check if the answer is equal to num1 * num2
						//if answer correct print this
						System.out.println("Your answer is correct.\n");
						count++;
						break; // Exit the loop if the answer is correct
					} else {//if answer correct print this
						System.out.println("Try again.");   
					}   
					}while(answer1!=(num1 * num2));
					
				
				break;
			
			case 1:
					//Declaring 2 random numbers to teach kids 
					int num3 = (int) (Math.random()*90)+10;
					int num4 = (int) (Math.random()*90)+10;
					int answer2=0;
					//if n1 is less than n2 swipe numbers make it easer on student to solve
					if (num3<num4) {
						int temp = num4; //temp or temporary holds n2 
						num2=num3; //the numbers are swiped n2 takes the value of n1
						num3= temp;//n1 is assigned with the original value of n2
					}
					do {
					System.out.printf("%2d / %2d =  ", num3, num4); //print the question
					answer2 = input.nextInt();//read student answer
					//if statement to check if the answer is correct 

					if (answer2 == num3 / num4) {//check if the answer is equal to num1 / num2
						//if answer correct print this
						System.out.println("Your answer is correct.\n");
						count++;
						break; // Exit the loop if the answer is correct
					} else {//if answer correct print this
						System.out.println("Try again.");   
					}   
					}while(answer2!=(num3 / num4));
				
				break;
			
		
		    case 2:
					//Declaring 2 random numbers to test kids addition
					int num5 = (int) (Math.random()*90)+10;
					int num6 = (int) (Math.random()*90)+10;
					int answer3=0;
					do {
					System.out.printf("%2d + %2d =  ", num5, num6); //print the question
					answer3 = input.nextInt();//read student answer
					//if statement to check if the answer is correct 

					if (answer3 == num5 + num6) {//check if the answer is equal to num1 + num2
						//if answer correct print this
						System.out.println("Your answer is correct.\n");
						count++;
						break; // Exit the loop if the answer is correct
					} else {//if answer correct print this
						System.out.println("Try again.");   
					}   
					}while(answer3!=(num5 + num6));
					
				
				break;
			
			
			case 3:
					//Declaring 2 random numbers to test kids subtraction
					int num7 = (int) (Math.random()*90)+10;
					int num8 = (int) (Math.random()*90)+10;
			        
					//if n1 is less than n2 swipe numbers make it easer on student to solve
					if (num7<num8) {
						int temp = num8; //temp or temporary holds n2 
						num8=num7; //the numbers are swiped n2 takes the value of n1
						num7= temp;//n1 is assigned with the original value of n2
					}
					int answer4=0;
					do {
						System.out.printf("%2d - %2d =  ", num7, num8); //print the question
						answer4 = input.nextInt();//read student answer
						//if statement to check if the answer is correct 
						if (answer4 == num7 - num8) {//check if the answer is equal to num1 - num2
							//if answer correct print this
							System.out.println("Your answer is correct.\n");
							count++;
							break; // Exit the loop if the answer is correct
						} else {//if answer correct print this
							System.out.println("Try again.");  
						}
				}while(answer4!=(num7 - num8));
				
				
				break;
			
			}
	    	}
////////////////////////////////////////////////////////			
	    	System.out.println("\n--------This is the Challange qize the qesutions will be constist of 2 diffent operators--------\n");
	    	for(int i=0; i<5;i++) {
	    		boolean continueLoop5=true;
					//generate question with 2 different operations
					int n1=(int)(Math.random()*15)+1;
					int n2=(int)(Math.random()*15)+1;
					int n3=(int)(Math.random()*15)+1;
					int operation= (int)(Math.random()*12);
					int operation1= (int)(Math.random()*4);
					
					String operater="";
					int answer=0;
					
					switch(operation1) {
					case 0: 
						operater="*";
						answer=(n1 * n2);
						break;
						
					case 1:
						operater="/";
						answer=(n1 / n2);
						break;
						
					case 2: 
						operater="+";
						answer=(n1 + n2);
						break;
						
					case 3: 
						operater="-";
						
						answer=(n1 - n2);
						break;
						}
					
					String operater1="";
					double answer1=0;
					
					switch(operation1) {
					case 0: 
						operater1="+";
						answer1=answer+n3;
						break;
						
					case 1: 
						operater1="-";
						answer1=answer-n3;
						break;
						
					case 2: 
						operater1="*";
						answer1=answer*n3;
						break;
					case 3: 
						operater1="/";
						answer1=answer/n3;
						break;
					}
					double uans=0;
					do {
					System.out.printf("(%2d %s %2d) %s %2d =  ", n1, operater, n2,operater1, n3);
					uans= input.nextDouble();
					if (uans==answer1) {
						//if answer correct print this
				        System.out.println("Your answer is correct.");
				    } else {//if answer correct print this
				        System.out.println("Try again"); 
					}

				}while(uans!=answer1);

	    	}
			
			 if (count == qestions || count<= qestions) {
		            System.out.printf("\n\nGood job!\nYou got %2d out of 15\n\n",count);
		            break;
		        } else if (count <= 10 || count>5) {
		            System.out.printf("\n\nYou need practice.\nYou got %2d out of 15\n\n",count);
		            break;
		        } else if (count <= 5) {
		            System.out.printf("\n\nStudy more.\nYou got %2d out of 15\n\n",count);
		            break;
		        } else {
		            System.out.println("Keep practicing!\n\n");
		            break;
		        }	
		}
		
	}
}
