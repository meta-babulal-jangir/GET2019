package Problem2;

public class UsePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly obj1=new Poly("2x -2x3 -12=0");
		int[] arr=obj1.getEquationArray();
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		System.out.println(obj1.evaluate(2));
		System.out.println(obj1.degree());
		
		System.out.println("\n Sorted");
		arr=obj1.sort(arr);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		System.out.println("/nChecking Addition");
		Poly obj2=new Poly("x2 -2x5 -12=0");
		Poly obj3=new Poly("x +x5 -12=0");
		arr=obj3.addPoly(obj1, obj3);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println("/nChecking Multiplication");
		obj2=new Poly("x +x2=0");
		
		obj3=new Poly("x +x2=0");
		
		
		arr=obj3.multiplyPoly(obj2, obj3);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
