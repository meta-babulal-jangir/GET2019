public class CheckUsePriorityQueue{
    public static void main(String args[])
    {
        UsePriorityQueue queue=new UsePriorityQueue(3);
        //checking for empty
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        
        System.out.println("\n\n"+queue.enque(1,10));
        System.out.println(queue.isEmpty());
        
        //to full 
        System.out.println(queue.enque(2,9));
        System.out.println(queue.enque(3,8));
        
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.enque(4,7));
        
        //deleting
        System.out.println("\n\nremoving\n"+queue.isFull());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
    }
}