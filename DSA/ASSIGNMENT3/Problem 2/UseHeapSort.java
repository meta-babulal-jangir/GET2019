import java.io.Console;
public class UseHeapSort{
    	public static void main(String args[])
	    {
		       Console con=System.console();
		       int arr[];
		       System.out.print("Enter No. of Element\t");
		       int n=Integer.parseInt(con.readLine());
		       arr=new int[n];
		       System.out.println("Enter Element ");
		       for(int i=0;i<arr.length;i++)
			          arr[i]=Integer.parseInt(con.readLine());
		
		       System.out.print("\nArray is  :");
		       for(int i=0;i<arr.length;i++)
			          System.out.print(arr[i]+"  ");
		       System.out.println();
		       int arrHeap[]=HeapSort.createHeap(arr);
		       System.out.print("Heap is :");
		       for(int i=0;i<arrHeap.length;i++)
			          System.out.print(arrHeap[i]+"  ");

		       System.out.println();
		       int arrSorted[]=HeapSort.deleteHeap(arrHeap);
		
		       System.out.print("Sorted Array is : ");
		       for(int i=0;i<arrSorted.length;i++)
		 	         System.out.print(arrSorted[i]+"  ");
		       System.out.println();
		
		
	     }

}