// 20220922: I saw your comment (copied below) and am ok with the solution you have provided.
// Passed input/output tests. I opted not to use some of the orginal code written and made my own.

//Ashley Grafner
//CSC 10606080, Computer Science 1 (Java)
//9/8/2022
//This program will print 25 prime numbers, each on a new line.

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner( System.in );
		
    int Temp=1; //condtional
    int Prime=3; //use to find remainder in formula
    int count = 2; //start at 2 because we aren't including prime #2 in formula
		
			System.out.println("Prime numbers "); 
			System.out.println(2);//Prints 2 because isnt included in formula

    
		do{ 
			for (int x=2;x<=Math.sqrt(Prime);x++){
				if(Prime%x==0){ //non-prime numbers
					Temp=0;
					break;
				}
			}
			  if (Temp!=0){ // prime numbers
				  System.out.println(Prime); //prints each prime number
				   count++; //adds 1 to count because we printed 1 number
			}
    
      Temp=1; //sets temp back to 1
			Prime++; //adds 1 to prime every loop
      
    }while(count<=25);// Continues to loop up until 25
		}
	}
