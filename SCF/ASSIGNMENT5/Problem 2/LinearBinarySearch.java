public class LinearBinarySearch{ 
    /**
     * Method search element in given array
     * Parameter array is integer type array
     * Parameter lowerIndex is lower index of array
     * Parameter higherIndex is highest index of array
     * Return index of element if found otherwise -1 
     */
    public int linearSearch(int array[],int lowerIndex,int higherIndex,int elementToSearch)
    {
        if(lowerIndex>higherIndex)
            return -1;
        if(array[lowerIndex]==elementToSearch)
            return lowerIndex;
        return linearSearch(array,lowerIndex+1,higherIndex,elementToSearch);  
    }
    /**
     * Method search element in given array
     * Parameter array is integer type array
     * Parameter lowerIndex is lower index of array
     * Parameter higherIndex is highest index of array
     * Return index of element if found otherwise -1 
     */
   public int binarySearch(int array[], int low, int high, int elementToSearch) 
   {
       int mid = (low + high) / 2;
       if (low > high)
           return -1;
       if (array[mid] == elementToSearch)
           return mid;
       if (array[mid] < elementToSearch) 
           return binarySearch(array, mid + 1, high, elementToSearch);
       else 
           return binarySearch(array, low, mid-1, elementToSearch);
   }
}
