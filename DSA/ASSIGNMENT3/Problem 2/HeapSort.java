class HeapSort{
		   //craete Heap
	    public static int []createHeap(int array[])
	    {
		       int tempArray[]=new int[array.length];
		       int tempVar=0;
         int sizeOfTempArray=tempArray.length;
		       for(int i=0;i<sizeOfTempArray;i++)
	 	      {		
			          tempArray[i]=array[i];
			          for(int j=i;j>0;)
			          { 	
				             if(j%2==0)
				             {
					                if(tempArray[j]>tempArray[j/3])
					                {
						                   tempVar=tempArray[j/3];
						                   tempArray[j/3]=tempArray[j];
						                   tempArray[j]=tempVar;				
					                }
					                j/=3;
				             }
				             else
				             {
					                if(tempArray[j]>tempArray[j/2])
					                {
						                   tempVar=tempArray[j/2];
						                   tempArray[j/2]=tempArray[j];
						                   tempArray[j]=tempVar;
					                }
					                j/=2;
				             }	
			          }
		          //	for(int k=0;k<temp.length;k++)
		          //	System.out.print(temp[k]+"  ");
		          //	System.out.println("\t\tAfter");
		       }
		       return tempArray;
	    }	
}
