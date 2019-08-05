public class UseLinearBinarySearch{
    public static void main(String[] args)
    {
        LinearBinarySearch obj=new LinearBinarySearch();
        System.out.println(obj.linearSearch(new int[]{2,5,3,6,8},0,4,8));
        System.out.println(obj.binarySearch(new int[]{2,3,5,6,8},0,4,8)); 
    }
}
