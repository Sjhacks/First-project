import java.util.Scanner;
public class primeNumber {
//Works at 7691 but not 7692 wtf 
	public static void main(String[] args) {
		
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);	
		int number = sc.nextInt();
		sc.close();
		int[] primeNumberArray = new int[number];
		primeNumberArray[0] = 1;
		int primeArrayCounter = 1;
		int primeIntegration = 0;
		//Creates an array to the size of the number entered 
		
		if( number == 1 || number == 0){
			System.out.println("This is an invalid number");
		//Special scenario if number entered is 0 or 1
		}
		//First looping out all the numbers below the number enter
		//Then looping for division by the existing terms in the prime number array
		
		for (int i = 2; i < number; i++){
			
			for (int j = 1; j < (primeNumberArray.length - 1); j++){
				
				if (primeNumberArray[j] == 0){
					break; 	
				}
				//Breaks the loop upon reaching an empty array value
					
				if (i % primeNumberArray[j] == 0){
					primeIntegration++;
				}
				//The above if integrates the results for all the divisions

			}
			
			if (primeIntegration == 0){
				primeNumberArray[primeArrayCounter] = i;
				primeArrayCounter++;
			}
		
			primeIntegration = 0;
		}
		for (int k = 0; k < primeNumberArray.length; k++){
			
			 if (primeNumberArray[k] == 0){
				break;
			 }
			 
			 else {
				 System.out.print(primeNumberArray[k] + " ");
			 }
		}
	
	}
}
