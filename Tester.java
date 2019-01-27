import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
 public static void main(String[] args) {
	 RecursiveMethods test = new RecursiveMethods();
	 int[] te = {1,2,3,4,5,6};
		List<Integer> arri = Arrays.stream(te).boxed().collect(Collectors.toList());

	 
	 List<Integer> arr = new ArrayList<>();
	 arr.add(1);
	 arr.add(2);
	 arr.add(3);
	 arr.add(4);
	 arr.add(5);
//	 arri = test.insertIntoSortedList(arr,1);
	List<Integer> newi = new ArrayList<>(arr.size()+1);
	//System.out.println(newi.size());
	 Arrays.asList(te);
	System.out.println( arri.size());


	 

	 int[] tester = new int[5];
	 tester = Arrays.copyOfRange(te, 1, te.length-1);
	 for(int i = 0; i<te.length; i++) {
	 System.out.println(te[i]);
	 

	 }
	 System.out.println("======================================");

	 
	 
	 for(int i = 0; i<tester.length; i++) {
		 System.out.println(tester[i]);
		 

		 }
	 
	 int[] ne = test.insertIntoSortedArray(te,0);
	 System.out.println("======================================");


	 for(int i = 0; i<ne.length; i++) {
		 System.out.println(ne[i]);

		 }
	 System.out.println("======================================");


	 for(int i = 0; i<arri.size(); i++) {
		 System.out.println(arri.get(i));

		 }
	 
	 
 }
}
