package Problem1;

/**
 * @author Babulal Jangir
 * Class contains methods to operate on Set of Integers
 * Universal set is 1-1000
 */
public class IntSet {
	private int[] set;

	/**
	 * @param set is integer type array of set ,constructor initialize the set 
	 */
	public IntSet(int[] set) {
		this.set = set;
	}

	/**
	 * @param toCheck is integer value which have to check
	 * @return true if it exits otherwise false
	 */
	public boolean isMember(int toCheck) {
		for (int i = 0; i < size(); i++) {
			if (toCheck == set[i])
				return true;
		}
		return false;
	}

	/**
	 * @return the size of set
	 */
	public int size() {
		return set.length;
	}

	/**
	 * @param subSet is IntSet type which is to check subset of current set
	 * @return true if it exits otherwise false
	 */
	public boolean isSubSet(IntSet subSet) {
		int j = 0;
		for (int i = 0; i < size(); i++) {
			if (j == subSet.size())
				return true;
			if (set[i] == subSet.set[j]) {
				j++;
			} else
				continue;

		}
		return false;
	}

	/**
	 * @return complement of set ,universal set is 1 to 1000
	 */
	public IntSet getComplement() {
		int[] compliment = new int[1000 - size()];
		int counter = 0;
		int counterValue = 1;
		for (int i = 0; i < compliment.length; i++) {
			if (counterValue != set[counter]) {
				compliment[i] = counterValue;
				counterValue++;
			} else {
				i--;
				counterValue++;
				if (counter < size() - 1)
					counter++;
			}
		}
		return new IntSet(compliment);
	}

	/**
	 * @param set1 is first set
	 * @param set2 is second set
	 * @return the union of first and second set
	 */
	public static IntSet union(IntSet set1, IntSet set2) {
		int[] union;
		int[] array1 = set1.getSet();
		int[] array2 = set2.getSet();
		int[] tempUnion = new int[set1.size() + set2.size()];
		boolean flgFind = false;
		int sizeOfUnion = array1.length;
		for (int i = 0; i < set1.size(); i++) {
			tempUnion[i] = array1[i];
		}
		int counterForArray2 = 0;

		for (int i = set1.size(); i < set1.size() + set2.size(); i++) {

			for (int j = 0; j < set1.size(); j++) {
				if (array1[j] == array2[counterForArray2]) {
					flgFind = true;
					break;
				}
			}
			if (!flgFind) {
				tempUnion[i] = array2[counterForArray2];

				sizeOfUnion++;

			}
			flgFind = false;
			counterForArray2++;

		}
		union = new int[sizeOfUnion];
		int tempZero = 0;
		for (int i = 0; i < sizeOfUnion; i++) {
			if (tempUnion[tempZero] != 0) {
				union[i] = tempUnion[tempZero];
			} else {
				i--;
			}
			tempZero++;

		}
		return new IntSet(union);

	}

	/**
	 * @return the set
	 */
	public int[] getSet() {
		return this.set;
	}
}
