public class StringClass{
    private int stringLength;
    private int counter;
    private String tempString; 
	/**
	 * Takes two parameter as argument in String
	 * This methos compares two string   
	 * Returns 1 if both string are equal
     * Returns 0 if both string are not equal	 
	 */ 
    public int checkEquals(String stringFirst,String stringSecond)
    {   
        if(lengthOfString(stringFirst)==lengthOfString(stringSecond))
        {         
            while(counter!=stringLength)
            {    
                if(stringFirst.charAt(counter)!=stringSecond.charAt(counter))
                {  
                    return 0;
                } 
                counter++;
            }
            return 1;
        }
        else
            return 0;
    }
	/**
	 * Takes one parameter as argument in String
	 * This methos computes length of string   
	 * Updates counter to 0
     * Updates stringLength to length of input String	 
	 */ 
    public int lengthOfString(String string)
    {
        counter=0;
        try{
            while(true)
            {
                string.charAt(counter);
                counter++;
            }
        }
        catch(IndexOutOfBoundsException exception)
        {   
            stringLength=counter;
            counter=0;  
            return stringLength; 
        }      
    }
	/**
	 * Takes one parameter as argument in String
	 * Returns the inverse of input String	 
	 */
    public String reverseString(String string)
    {
        tempString="";
        lengthOfString(string);
        counter=stringLength-1; 
        while(counter!=-1)
        { 
            tempString+=string.charAt(counter);
            counter--;
        }
        return tempString;   
    }
	/**
	 * Takes one parameter as argument in String
	 * Returns string of changed case of each letter in input string that is if letter is Capital than change to small and vice-versa. 	 
	 */
    public String changeCase(String string)
    {
        tempString="";
        lengthOfString(string); 
        while(counter!=stringLength)
        {
            if(string.charAt(counter)>=65&&string.charAt(counter)<=90)
                tempString+=(char)(string.charAt(counter)+32);
            else
                if(string.charAt(counter)>=97&&string.charAt(counter)<=122) 
                    tempString+=(char)(string.charAt(counter)-32);     
            counter++;    
        }
        return tempString;    
    }
	/**
	 * Takes one parameter as argument in String
	 * Returns the largest word in String.
     * If there are two same length word (largest) then it returns last one.  	 
	 */
    public String getLargestWord(String string)
    {
        int tempStringLength=lengthOfString(string);
        int tempCounter=counter;
        String largestWord="";  
        while(tempCounter!=tempStringLength)
        {    
            tempString="";
            while(tempCounter!=tempStringLength)
            {
                if(string.charAt(tempCounter)==' ')
                {
                    tempCounter++;
                    break;
                }
                else
                {
                    tempString+=string.charAt(tempCounter);
                    tempCounter++;
                } 
            }
            if(lengthOfString(tempString)>=lengthOfString(largestWord))
                largestWord=tempString;     
        }
        return largestWord; 
    } 
}
