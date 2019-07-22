public class MarkSheet{
    /**
	 * Takes two parameter as argument 
	 * First parameter is Number of Students in Integer 
	 * Second parameter is array of entires which stores grades of all student
     * Returns average of grades in float	 
	 */
    public float averageOfGrades(int noOfStudent,int[] entries) 
    {
	    float avg=0.0f;
	    for(int i=0;i<noOfStudent;i++)	
	        avg+=entries[i];
        try
        {  
	        return avg/noOfStudent;
        }catch(ArithmeticException e)
        {
            System.out.println("No of Student Can not be Zero");
            return 0;
        }  
    }
    /**
	 * Takes two parameter as argument 
	 * First parameter is Number of Students in Integer 
	 * Second parameter is array of entires which stores grades of all students in integer
     * Returns Maximum grade in integer	 
	 */ 
    public int maximumGrade(int noOfStudent,int[] entries)
    {
	    int maxGrade=entries[0];
	    for(int i=1;i<noOfStudent;i++)
        {
	        if (entries[i]>maxGrade)
	        maxGrade=entries[i];
	    }
        return maxGrade;
    }
    /**
	 * Takes two parameter as argument 
	 * First parameter is Number of Students in Integer 
	 * Second parameter is array of entires which stores grades of all students in integer
     * Returns Minimum grade in integer 	 
	 */ 
    public int minimumGrade(int noOfStudent,int[] entries)
    {
        int minGrade=entries[0];
        for(int i=1;i<noOfStudent;i++)
        {
	        if (entries[i]<minGrade)
		    minGrade=entries[i];
	    }
	    return minGrade;
    }
	/**
	 * Takes two parameter as argument 
	 * First parameter is Number of Students in Integer 
	 * Second parameter is array of entires which stores grades of all students in integer 
     * Returns Percentage of passed student int float
     * A student is paases if he gates 40 or more than 40  	 
	 */ 
    public float percentageOfPassedStudent(int noOfStudent,int[] entries)
    {
        float noOfPassedStudent=0.0f;
        for(int i=0;i<noOfStudent;i++)
        {
            if(entries[i]>=40)
                noOfPassedStudent++;
        }
        try{
            return (noOfPassedStudent/noOfStudent)*100;
        }catch(ArithmeticException e)
        {
            System.out.println("no of Student Can not be Zaro");
            return 0;
        }   
    }
}

