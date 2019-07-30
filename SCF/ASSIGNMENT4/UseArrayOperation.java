public class UseArrayOperation{
	public static void main(String args[])
	{
		ArrayOperation obj=new ArrayOperation();
		System.out.println(obj.maxMirror(new int[]{1,2,3,4}));
		System.out.println(obj.countClumps(new int[]{1, 1, 1, 1, 1}));
		System.out.println(obj.splitArray(new int[]{2, 1, 1, 2}));
		int resultArray[]=obj.fixXY(new int[]{5,4, 9, 4, 9, 5},4,5);
		for(int i=0;i<resultArray.length;i++)
		    System.out.print(resultArray[i]);
		
	}
}