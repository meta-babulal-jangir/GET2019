public class HcfLcm{
    int common=1; 
    /**
     * Method calculates HCF of two number
     * Parameter firstNumber is integer type
     * Parameter secondNumber is integer type
     * Returns the HCF of first and second Number 
     */
    public int hcf(int firstNumber,int secondNumber)
    {
        while(firstNumber!=secondNumber)
        {
            if(firstNumber>secondNumber)
            {
                return
                    hcf(firstNumber-secondNumber,secondNumber);     
            }
            else
            {
                return 
                    hcf(firstNumber,secondNumber-firstNumber);    
            }
        }
        return firstNumber; 
    }
    /**
     * Method calculates LCM of two number
     * Parameter firstNumber is integer type
     * Parameter secondNumber is integer type
     * Returns the LCM of first and second Number 
     */
    public int lcm(int firstNumber,int secondNumber)
    {
        
        if(common%firstNumber==0 && common%secondNumber==0)
        {
             return common;
        }
        common++;
        return common;
    }
}
