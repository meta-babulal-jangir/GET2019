public interface PriorityQueue{
    /** 
     * Method to insert item into PriorityQueue
     * Parameter itemToInsert is item of Object type
     * Returns true if item inserted otherwise false
     */
    boolean enque(Object itemToInsert,int priority);
    /** 
     * Method to delete item from PriorityQueue
     * Returns item of Object type if there is exists otherwise null if PriorityQueue is empty
     */
    Object deque();
    /** 
     * Method checks whether PriorityQueue is empty or not 
     * Returns true if PriorityQueue is empty otherwise false
     */
    boolean isEmpty();
    /** 
     * Method checks whether PriorityQueue is full or not 
     * Returns true if PriorityQueue is full otherwise false
     */
     boolean isFull();
}