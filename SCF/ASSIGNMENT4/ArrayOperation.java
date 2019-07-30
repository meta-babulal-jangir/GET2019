public class ArrayOperation{
    
	/**
	 * Takes one parameter as argument of int  type array
	 * Returns Maximum mirror in the array 
     * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
     * maxMirror([7, 1, 4, 9, 7, 4, 1]) → 2
     * maxMirror([1, 2, 1, 4]) → 3
     * maxMirror([1, 4, 5, 3, 5, 4, 1]) → 7	 
	 */
	public int maxMirror(int[] numbersArray)
    {
		int length = numbersArray.length;
        if (length == 0)
        {
			throw new AssertionError("Array is empty");
		}

		int maxLengthMirror = 0; // contaions max length of mirror
		for (int i = 0; i < length; i++)
        {
			int mirrorLength = 0; // Contaion mirror length
			for (int j = length - 1; j >= 0 && i + mirrorLength < length; j--)
            {
				if (numbersArray[i + mirrorLength] == numbersArray[j])
                {
					mirrorLength++;
				} 
                else
                {
					maxLengthMirror = Math.max(maxLengthMirror, mirrorLength);
					mirrorLength = 0;
				}
			}
			maxLengthMirror = Math.max(maxLengthMirror, mirrorLength);
		}

		return maxLengthMirror;
	}

	/**
	 * Takes one parameter as argument of int  type array
	 * Returns the number of Clumps  
     * countClumps([1, 2, 2, 3, 4, 4]) → 2
     * countClumps([1, 1, 2, 1, 1]) → 2
     * countClumps([1, 1, 1, 1, 1]) → 1
	 */
	public int countClumps(int numbersArray[]) 
	{
		int clumps = 0; // stores no of clumps
		int count = 0;
		int i = 0;
		while (i < numbersArray.length) 
		{
			int temp = numbersArray[i];
            while (i < numbersArray.length && temp == numbersArray[i]) 
			{
				count++;
				i++;
			}
			if (count > 1) {
				clumps++;
			}
			count = 0;

		}
		return clumps;

	}

	/**
	 * Method to swap two values in array 
	 * Takes three parameter as argument of int  type 
	 * Parameter firstIndex and Parameter secondIndex swaped 
	 */
	public void swap(int firstIndex, int secondIndex, int numbersArray[])
	{
		int temp = numbersArray[firstIndex];
		numbersArray[firstIndex] = numbersArray[secondIndex];
		numbersArray[secondIndex] = temp;
	}

	/**
	 * Parameter numbersArray contains integer values
	 * Parameter X contains an integer which is present in array
	 * Parameter Y contains an integer which is present in array And will be placed after X
	 * Returns  an array after fitting X and Y
	 * fixXY([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
     * fixXY([1, 4, 1, 5]) → [1, 4, 5, 1]
     * fixXY([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
	 */
	public int[] fixXY(int numbersArray[], int X, int Y) 
	{

		int len = numbersArray.length;
		if (len == 0) 
		{
			throw new AssertionError("The array is empty");
		}
		boolean flag = false;
		for (int i = 0; i < len - 1; i++) 
		{
			if (numbersArray[i] == X && numbersArray[i + 1] == X) 
			{
				flag = true;
				break;
			}
		}
		if (flag) 
		{
			throw new AssertionError("The array has two adjacents X values");
		}
		if (numbersArray[len - 1] == X) 
		{
			throw new AssertionError(" X occurs at the last index of array");
		}
		int countX = 0, countY = 0;
		for (int i = 0; i < len; i++) 
		{
			if (numbersArray[i] == X) 
			{
				countX++;
			}
			if (numbersArray[i] == Y) 
			{
				countY++;
			}
		}
		if (countX != countY) 
		{
			throw new AssertionError("there are unequal numbers of X and Y in input array");
		}

		for (int i = 1; i < numbersArray.length - 1; i++) 
		{
			if (numbersArray[i - 1] == X && numbersArray[i] == Y)          //for case 45 
			{
				i++;
				continue;
			}
			if (numbersArray[i - 1] == Y && numbersArray[i] == X && numbersArray[i + 1] != Y)           //  for case 543
			{
				swap(i - 1, i + 1, numbersArray);
				i += 2;
				continue;

			}
			if (numbersArray[i - 1] == X)                                      // for case 4325
			{
				for (int j = i; j < numbersArray.length; j++) 
				{
					if (numbersArray[j] == Y) 
					{
						swap(j, i, numbersArray);
						break;
					}

				}
			}

		}
		return numbersArray;
	}

	/**
	 * Parameter numbersArray Contains integer values
	 * Returns index value at which array can be splited ,both sub array's sum is equal otherwise return -1
	 * splitArray([1, 1, 1, 2, 1]) → 3
     * splitArray([2, 1, 1, 2, 1]) → -1
     * splitArray([10, 10]) → 1
 	 */
	public int splitArray(int numbersArray[]) 
	{   
        int length=numbersArray.length; 	
     	if(length == 0)
			{
			    throw new AssertionError("Array is Empty");	
			}
		int totalSum = 0;
		int index=0;
		for(int i=0 ; i<length ;i++)
		{
		   //calculating total sum of array's elements
		   totalSum += numbersArray[i];
		}
		//enter if total sum is even
		if(totalSum%2 == 0)
		{
			int halfSum = totalSum/2;
			int sum = 0;
			//loops until halfSum is not equal to sum
			while(sum != halfSum) 
			{   
				sum += numbersArray[index];
				index++;
				if(sum > halfSum)
				{
					return -1;
				}
			}
			return index;
		}
		return -1;
	}	
}