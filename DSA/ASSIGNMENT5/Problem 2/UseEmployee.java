import java.util.*;
public class UseEmployee{
     public static void main(String args[])
     {
         Employee e1=new Employee(1001,"Rakesh","Jaipur");
         Employee e2=new Employee(1002,"Rajesh","Sikar");
         Employee e3=new Employee(1003,"Manish","Jaipur");
         Employee e4=new Employee(1004,"Ramesh","Sikar");
         Employee e5=new Employee(1005,"Nitesh","Sikar");
         TreeSet employeeRocord=new TreeSet();
         employeeRocord.add(e1);
         employeeRocord.add(e2);
         employeeRocord.add(e3);
         employeeRocord.add(e4);
         employeeRocord.add(e5);
         System.out.println(employeeRocord);
         
         TreeSet employeeRocordCustom=new TreeSet(new MyComparator());
         employeeRocordCustom.add(e1);
         employeeRocordCustom.add(e2);
         employeeRocordCustom.add(e3);
         employeeRocordCustom.add(e4);
         employeeRocordCustom.add(e5);
         System.out.println(employeeRocordCustom);
         
         System.out.println(employeeRocord.add(new Employee(1002,"HJ","fig")));
         
     }
}