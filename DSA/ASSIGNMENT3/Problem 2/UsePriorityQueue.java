import java.util.*;
class UsePriorityQueue implements PriorityQueue{
    private int[] priorityQueue;
    int priority;
    private int start;
    private int end;
    private int sizeOfPriorityQueue;
    Map<Integer,Object> mapPriorityQueue;
    /**
     * Constructor to initialise the PriorityQueue size
     */
    public UsePriorityQueue(int sizeOfPriorityQueue)
    {    
         mapPriorityQueue=new HashMap<Integer,Object>();
         this.sizeOfPriorityQueue=sizeOfPriorityQueue;
         priorityQueue=new int[sizeOfPriorityQueue];
    }
    /** 
     * Method to insert item into PriorityQueue
     * Parameter itemToInsert is item of Object type
     * Returns true if item inserted otherwise false
     * Priority must not be same
     */
    public boolean enque(Object itemToInsert,int priority)
    {
         if(!isFull())
         {    
              mapPriorityQueue.put(priority,itemToInsert); 
              priorityQueue[end]=priority;
              end++;
              priorityQueue=HeapSort.createHeap(priorityQueue);
              return true;  
         }
         else
          return false;
    }
    /** 
     * Method to delete item from PriorityQueue
     * Returns item of Object type if there is exists otherwise null if PriorityQueue is empty
     */
    public Object deque()
    {   
         if(!isEmpty())
         {  
             int tempStart=start;
             int tempData=priorityQueue[tempStart];
             start++;
             int []tempPriorityQueue=priorityQueue;
             priorityQueue=new int[tempPriorityQueue.length];
             for(int i=0;i<tempPriorityQueue.length-1;i++)
                 priorityQueue[i]=tempPriorityQueue[i+1];
             priorityQueue=HeapSort.createHeap(priorityQueue);             
             return mapPriorityQueue.remove(tempData);
         }
         else
          return null;
    }
    /** 
     * Method checks whether PriorityQueue is empty or not 
     * Returns true if PriorityQueue is empty otherwise false
     */
    public boolean isEmpty()
    {    
         if(start==end&&start==0)
             return true;
         else
             return false;
    }
    /** 
     * Method checks whether PriorityQueue is full or not 
     * Returns true if PriorityQueue is full otherwise false
     */
    public boolean isFull()
    {
         if(start==end && end!=sizeOfPriorityQueue-1)
             return true;
         else
             return false;
    }
}