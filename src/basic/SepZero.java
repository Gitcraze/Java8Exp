package basic;

import java.util.Arrays;

public class SepZero {
	
	static void moveZeroToEnd(int inputArray[])
	{
		System.out.println("Input Array:"+Arrays.toString(inputArray));
		
		//Initialize counter to 0
		int counter = 0;
		
		//Traverse from left to right
		
		for(int i=0; i<inputArray.length;i++)
		{
			//if input array is non-zero
			if(inputArray[i]!=0)
			{
				//Assign inputArray[i] to inputArray[counter]
				inputArray[counter]= inputArray[i];
				
				//Incrementing counter by 1
				
				counter++;
			}
		}
		
		//Assigning zero to remaining elements
		
		while(counter < inputArray.length)
		{
			inputArray[counter] = 0;
			counter++;
		}
		
		System.out.println("Input array after moving zeros to end: ");
		System.out.println(Arrays.toString(inputArray));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
				
	}

	public static void main(String[] args) {
		moveZeroToEnd(new int[] {12, 0 , 7 , 0 , 8 , 0 , 3});

	}

}
