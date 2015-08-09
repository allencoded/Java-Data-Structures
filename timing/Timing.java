/**
 * Allen Hendricks
 * Unit 2 Timing Project
 * 5/28/2011
 * 
*** Unit 2 Project ***
*** Measures the time of execution in Nanoseconds ***
***/

public class Timing {
	public static void main(String[] args){
		
		long start, end;
		double result,difference = 0;
	   	for(int n=1; n<=20; n++){                                                                                                                                                                                                                                                                                                                                                                                                          
			//Calculate the Time for n^2.
		   	start = System.nanoTime();
			//Add code to call method to calculate n^2
			exponential(n);
		   	end = System.nanoTime();
		   	difference = (end - start);	
		   	
		}	
	   	System.out.println("----------------------------------------------------");
	   	System.out.println("The resulting time of n^2 is = " + difference);
	   	System.out.println("----------------------------------------------------");
	   	result = difference;
	   	
 	   	for(int n=1; n<=20; n++){   
		   //Calculate the Time for 2^n.
                                                                                                                                                                                                                                                                                                                                                                                                       
		   	start = System.nanoTime();
		  	//Add code to call method to calculate 2^n
		   	squared(n);
			end = System.nanoTime();
			difference = (end - start);	
		
  	}
 	   System.out.println("----------------------------------------------------");
 	   System.out.println("While the resulting time of 2^n is =  " + difference);
 	   result =  result - difference;
 	   System.out.println("The difference in n^2 and 2^n is " + result);
	}
	
// Add methods to calculate n^2 and 2^n	
	public static void squared(int n){
		double square;
		square=Math.pow(2, n);
		System.out.println(square);
	}
	
	public static void exponential(int n){
		double square;
		square=Math.pow(n, 2);
		System.out.println(square);
	}
}
