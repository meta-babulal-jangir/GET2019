public class UseCricket{
    public static void main(String args[]) throws Exception
    {
        int bowls[]=Cricket.findOrderOfBolres(15,3,new int[]{6,5,4});
        for(int x:bowls)
         System.out.println(bowls[x]);
    }
}