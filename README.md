Using While-Do statement, write a program that will print 25 prime numbers, each on a new line.

 

Sample run:

Prime numbers

2

3

5

7

11

13

...





    import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner( System.in );
		
		//initialize variables
		int Number= 25;
    int Temp=1;
    int Prime=3;
		
		
		if (Number>=1){
			System.out.println("Prime numbers");
			System.out.println(2);
		}
		
		for (int count=2;count<=Number;){
			for (int x=2;x<=Math.sqrt(Prime);x++){
        
				if(Prime%x==0){
					Temp=0;
					break;
				}
			}
			if (Temp!=0)
			{
				System.out.println(Prime);
				count++;
			}
			Temp=1;
			Prime++;
		}
	}

}