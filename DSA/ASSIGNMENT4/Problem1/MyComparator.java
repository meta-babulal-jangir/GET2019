package Problem1;

import java.util.Comparator;

/**
 * @author Babulal Jangir 
 * Class for customize sorting
 *
 */
public class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Employee emp1 = (Employee) obj1;
		Employee emp2 = (Employee) obj2;
		String emp1Name = emp1.getEmpName();
		String emp2Name = emp2.getEmpName();
		return emp1Name.compareTo(emp2Name);
	}
}