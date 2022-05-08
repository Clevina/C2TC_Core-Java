import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArraySortVsSortedSet {

	public static void main(String[] args) {
		int[] arr= {13,7,6,45,6,21,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//return the value as string object
	}

}
class SortedSet1
{
	public static void main(String[] args) {
		SortedSet obj= new TreeSet();
		obj.add(13);
		obj.add(7);
		obj.add(6);
		obj.add(45);
		obj.add(6);
		obj.add(21);
		obj.add(9);
		System.out.println(obj);
		
	}
}