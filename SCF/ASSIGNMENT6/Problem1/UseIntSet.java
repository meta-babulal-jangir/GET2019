package Problem1;

public class UseIntSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSet obj=new IntSet(new int[]{1,2,3,4,5,8});
		System.out.println(obj.isMember(2));
		System.out.println(obj.isSubSet(new IntSet(new int[]{1,7})));
		System.out.println(obj.isMember(2));
		IntSet obj2=obj.getComplement();
		System.out.println("size is"+obj2.size());
		int []arr=obj2.getSet();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		IntSet obj3=IntSet.union(new IntSet(new int[]{1,7,4,5,6}),new IntSet(new int[]{1,2,5,6}));
		int []arr2=obj3.getSet();
		System.out.println();
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		//System.out.println("\n\n"+obj.union(new IntSet(new int[]{1,7}),new IntSet(new int[]{1,2,7,5,6})));
}
}