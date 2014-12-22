//Sean Staz
//CSci 211
//Java II

import java.util.ArrayList;

public class Lab2 
{
	public static void main(String[] args)
	{
		//Part 1A
		//Created a counter and an ArrayList
		int count =1;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		// Added some numbers to ArrayList
		for (int i = 0; i < 10; i++)
		{
			numList.add(count);
			count++;
		}
			
		//Part 1B
		System.out.println("The ArrayList has " + numList.size() + " objects stored in it.");
		for (int num: numList)
			System.out.print(num + " ");
		
		//Part 1C
		numList.remove(2);
		numList.remove(5);
		
		System.out.println(" ");
		System.out.println("The ArrayList has " + numList.size() + " objects stored in it.");
		for (int num: numList)
			System.out.print(num + " ");
		
		//Part 2A
		final int ROWS = 5;
		final int COLS = 5;
		
		int[][] twoD = new int[ROWS][COLS];
		for (int row = 0; row < ROWS; row++)
		{
			for (int col = 0; col < COLS; col++)
			{
				twoD[row][col] = count;
				count++;
			}
		}		
		
		//Part 2B
		System.out.println();
		System.out.println();
		System.out.println("The data held in the 2-D array is as follows.");
		for (int row = 0; row < ROWS; row++)
		{
			for (int col = 0; col < COLS; col++)
			{
				System.out.print(twoD[row][col] + " ");
			}
			
			System.out.println();
		}
		
		//Part 3A
		int[] list = new int[10];
		list[0] = 6;
		list[1] = 3;
		list[2] = 8;
		list[3] = 2;
		list[4] = 10;
		list[5] = 4;
		list[6] = 9;
		list[7] = 5;
		list[8] = 10;
		list[9] = 1;
		
		//Part 3B
		int startScan;
		int index;
		int minIndex;
		int minValue;
		for (startScan = 0; startScan < (list.length - 1); startScan++)
		{
			minIndex = startScan;
			minValue = list[startScan];
			for(index = startScan + 1; index < list.length; index++)
			{
				if (list[index] < minValue)
				{
					minValue = list[index];
					minIndex = index;
				}
			}
			list[minIndex] = list[startScan];
			list[startScan] = minValue;
		}
		
		//Part 3C
		int first;
		int last;
		int middle;
		boolean found;
		int value = 6;
		
		//Set the initial values.
		first = 0;
		last = list.length - 1;
		found = false;
		
		//Search for the value.
		while (!found && first <= last)
		{
			// Calculate midpoint
			middle = (first + last) / 2;
			
			// if value is found at midpoint...
			if (list[middle] == value)
				found = true;
			// else if value is in lower half...
			else if (list[middle] > value)
				last = middle - 1;
			//else if value is in upper half...
			else
				first = middle + 1;
		}
		
		if (found)
			System.out.println("The value 6 was found.");
		else
			System.out.println("The value 6 was not found.");
	}	
}

