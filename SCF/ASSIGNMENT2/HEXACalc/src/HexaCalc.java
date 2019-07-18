
public class HexaCalc implements BaseCalc {

	@Override
	public String add(String firstNumber, String secondNumber) {
		// TODO Auto-generated method stub
		int fNumber=toDecimal(firstNumber);
		int sNumber=toDecimal(secondNumber);
		return toBase(fNumber+sNumber);
	}

	@Override
	public String subtract(String firstNumber, String secondNumber) {
		// TODO Auto-generated method stub
		int fNumber=toDecimal(firstNumber);
		int sNumber=toDecimal(secondNumber);
		return toBase(fNumber-sNumber);
	}

	@Override
	public String multiply(String firstNumber, String secondNumber) {
		// TODO Auto-generated method stub
		int fNumber=toDecimal(firstNumber);
		int sNumber=toDecimal(secondNumber);
		return toBase(fNumber*sNumber);
	}

	@Override
	public String divide(String firstNumber, String secondNumber) {
		// TODO Auto-generated method stub
		int fNumber=toDecimal(firstNumber);
		int sNumber=toDecimal(secondNumber);
		return toBase(fNumber/sNumber);
	}

	@Override
	public int toDecimal(String baseNumber) {
		// TODO Auto-generated method stub
		int value=0;
		String str="0123456789ABCDEF";
		baseNumber=baseNumber.toUpperCase();
		int size=baseNumber.length();
		char ch;
		int digit;
		for(int i=0;i<size;i++)
		{
			ch=baseNumber.charAt(i);
			digit=str.indexOf(ch);
			value=16*value+digit;
		}
		return value;
	}

	@Override
	public String toBase(int decimalNumber) {
		// TODO Auto-generated method stub
		String hexaDecimalNumber="";
		char arr[]=new char[100];
		int tempDecimalNumber=decimalNumber;
		int digit;
		int i=0;
		while(tempDecimalNumber!=0)
		{
			digit=tempDecimalNumber%16;
			if(digit<10)
			{
				arr[i]=(char)(digit+48);
			}
			else
			{
				arr[i]=(char)(digit+55);
			}	
			i++;
			tempDecimalNumber/=16;
		}
		for(int j=i-1;j>=0;j--)
		{	
			hexaDecimalNumber+=arr[j];
			
		}
		return hexaDecimalNumber;
	}

}
