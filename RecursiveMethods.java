import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Requirement:
 * You are required to implement all methods recursively.
 * You receive a zero if there is any occurrence of a loop (e.g., for, while).  
 */
public class RecursiveMethods {
	/**
	 * Return an array storing the first n numbers in a Fibonacci sequence.
	 * The Fibonacci starts with the first two numbers being 1 and 1, then 
	 * starting from the 3rd number, it is the sum of the previous two numbers.  
	 * You can assume that n is positive.
	 * e.g., fibArray(5) returns an array {1, 1, 2, 3, 5}.
	 * @param n the first n Fibonacci numbers 
	 * @return an array representing the first n Fibonacci numbers
	 * 
	 * You are forbidden to use the fibList method below to solve this problem.
	 * 
	 * Requirement:
	 * You are required to implement all methods recursively.
	 * You receive a zero if there is any occurrence of a loop (e.g., for, while). 
	 * 
	 */
	public void fibH(int index,int[] arr) {
		if(index<arr.length) {
			 arr[index] = arr[index-1]+arr[index-2];
			 fibH(index+1,arr);
		}
	}
	

	public int[] fibArray(int n) {
		/* Your Task. */
		 if (n == 1 ) {
				int[] arr = new int[n];
				arr[0] =1;
			    return arr;
		 }
			int[] arr = new int[n];
			arr[0] = 1;
			arr[1] = 1;
			fibH(2,arr);
			return arr;

			
		 
	
	} 
	
	/**
	 * Return a list storing the first n numbers in a Fibonacci sequence.
	 * The Fibonacci starts with the first two numbers being 1 and 1, then 
	 * starting from the 3rd number, it is the sum of the previous two numbers.  
	 * You can assume that n is positive.
	 * e.g., fibList(5) returns a list {1, 1, 2, 3, 5}.
	 * @param n the first n Fibonacci numbers 
	 * @return a list representing the first n Fibonacci numbers
	 * 
	 * You are forbidden to use the fibArray method above to solve this problem.
	 * 
	 * Requirement:
	 * You are required to implement all methods recursively.
	 * You receive a zero if there is any occurrence of a loop (e.g., for, while).
	 */
	
	public void fibL(int index,List<Integer> fib,int n) {
		if(index<n) {
			 fib.add(fib.get(index-1)+fib.get(index-2));
			 fibL(index+1,fib,n);
		}
	}
	
	
	public List<Integer> fibList(int n) {
		/* Your Task. */
		 if (n == 1 ) {
				List<Integer> fib = new ArrayList<>();
				fib.add(1);
			    return fib;
		 }
			List<Integer> fib = new ArrayList<>();
			fib.add(1);
			fib.add(1);
			fibL(2,fib,n);

		 return fib;
         
	}
	
	/**
	 * Return whether or not an array represents the first n numbers in a Fibonacci sequence.
	 * The Fibonacci starts with the first two numbers being 1 and 1, then 
	 * starting from the 3rd number, it is the sum of the previous two numbers.  
	 * The array may or may not be empty.
	 * e.g., isFibArray({1, 2}) returns false and isFibArray({1, 1, 2, 3, 5, 8}) returns true.
	 * @param a an array
	 * @return true if input array a (of length n) represents the first n Fibonacci numbers; false otherwise.
	 * 
	 * You are forbidden to use the isFibList method below to solve this problem.
	 * 
	 * Requirement:
	 * You are required to implement all methods recursively.
	 * You receive a zero if there is any occurrence of a loop (e.g., for, while).
	 */
	
	public boolean helpIs(int index,int[] a) {
		boolean helper = true;
		if(index<a.length) {
			helper = helper&&helpIs(index+1,a)&&a[index-1]+a[index-2]==a[index];
			
		}
		return helper;  
	}
	
	public boolean isFibArray(int[] a) {
		/* Your Task. */
		if(a.length==0) {
			return true;
		}
		if(a.length==1) {
			return a[0]==1;
		}
		
		return helpIs(2,a)&&(a[0]==1)&&(a[1]==1);
	}
	
	/**
	 * Return whether or not a list represents the first n numbers in a Fibonacci sequence.
	 * The Fibonacci starts with the first two numbers being 1 and 1, then 
	 * starting from the 3rd number, it is the sum of the previous two numbers.  
	 * The array may or may not be empty.
	 * e.g., isFibList({1, 2}) returns false and isFibList({1, 1, 2, 3, 5, 8}) returns true.
	 * @param a an array
	 * @return true if input list a (of length n) represents the first n Fibonacci numbers; false otherwise.
	 * 
	 * You are forbidden to use the isFibArray method above to solve this problem.
	 * 
	 * Requirement:
	 * You are required to implement all methods recursively.
	 * You receive a zero if there is any occurrence of a loop (e.g., for, while).
	 */
	public boolean helpList(int index,List<Integer> list) {
		boolean helper = true;
		if(index <list.size()) {
			helper = helper&&helpList(index+1,list)&& list.get(index-1)+list.get(index-2) == list.get(index);
			
		}
		return helper;
	}
	public boolean isFibList(List<Integer> list) {
		/* Your Task. */
		boolean fibL = true;
		if(list.isEmpty()) {
			return true;
		}
		if(list.size() == 1) {
			return list.get(0)==1;
		}
		return helpList(2,list)&list.get(0)==1&&list.get(1)==1;
		
	}
	
	/**
	 * Given a sorted input array a, return a sorted array of size a.length + 1, 
	 * consisting of all elements of array a and integer i.
	 * @param a an array that is sorted in a non-descending order
	 * @param i an integer
	 * @return a sorted array of size a.length + 1, consisting of all elements of array a and integer i.
	 * e.g., insertIntoSortedArray({1, 2, 4, 5}, 3) returns a sorted array {1, 2, 3, 4, 5}.
	 * 
	 * You are forbidden to use the insertIntoSortedList method below to solve this problem.
	 * 
	 * Requirement:
	 * You are required to implement all methods recursively.
	 * You receive a zero if there is any occurrence of a loop (e.g., for, while).
	 */
	public int[] insertIntoSortedArray(int[] a, int i) {
		/* Your Task. */
		if(a.length==0) {
			int[] arr = new int[1];
			arr[0] = i;
			return arr;
		}
	
		int[] arr = new int[a.length+1];
		if(a[0]>=i) {
			arr[0] = i;
		}
		
		List<Integer> arri = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

			
		helpSortedList(list,arri,i);
		int[] array = new int[arri.size()];
		for (int j = 0; j < list.size(); j++) {
		    array[j] = arri.get(j);            
		}

		
		return arr;
	}
	
	public void helpSortedArray(int[] a,int[] arr, int i) {	
		
		if(a.length==0) {
			return;
		}
		if(a.length!=1&&a[0]<i&&i<=a[1]) {
			arr[0] = a[0];
			arr[1] = i;
		}
		if(a.length==1&&a[0]<i) {
			arr[0] = a[0];
			arr[1] = i;
		}
		else {
			arr[0] = a[0];
		}
		

	
		
		
	}
	
	
	/**
	 * Given a sorted input list, return a sorted list of size list.size() + 1, 
	 * consisting of all elements of the input list and integer i.
	 * @param list a list that is sorted in a non-descending order
	 * @param i an integer
	 * @return a sorted list of size list.size() + 1, consisting of all elements of the input list and integer i.
	 * e.g., insertIntoSortedList({1, 2, 4, 5}, 3) returns a sorted list {1, 2, 3, 4, 5}.
	 * 
	 * You are forbidden to use the insertIntoSortedArray method above to solve this problem.
	 * 
	 * Requirement:
	 * You are required to implement all methods recursively.
	 * You receive a zero if there is any occurrence of a loop (e.g., for, while).
	 */
	public List<Integer> insertIntoSortedList(List<Integer> list, int i) {
		/* Your Task. */

		if(list.isEmpty()) {
			List<Integer> arr = new ArrayList<>();
			arr.add(i);
			return arr;
		}
		List<Integer> arr = new ArrayList<>(list.size()+1);

		if(list.get(0)>=i) {
			arr.add(i);
		}
	
		helpSortedList(list,arr,i);
		
		return arr;
	}
	public void helpSortedList(List<Integer> list,List<Integer> arr, int i) {
		if(list.isEmpty()) {
			
 			return;
		}
		
	    if(list.size()!=1&&i>list.get(0)&&i<=list.get(1)) {
			arr.add(list.get(0));
			arr.add(i);
		}
	    else if(list.size()==1&&list.get(0)<i) {
			//arr.add( list.get(0));
	    	arr.add( list.get(0));
			arr.add(i);
		}
		 else {
		arr.add(list.get(0));
		       }
		
	    helpSortedList(list.subList(1, list.size()),arr,i);
		
		
	}
	
	/**
	 * Given two sorted arrays left and right, 
	 * return a sorted array of size left.length + right.length, 
	 * consisting of all elements of arrays left and right.
	 * @param left a sorted array
	 * @param right a sorted array 
	 * @return a sorted array of size left.length + right.length, consisting of all elements of arrays left and right.
	 * e.g., mergeSortedArrays({1, 3, 5, 7}, {2, 4, 6, 8}) returns a sorted array {1, 2, 3, 4, 5, 6, 7, 8}.
	 * 
	 * You are forbidden to use the mergeSortedLists method below to solve this problem.
	 * 
	 * Requirement:
	 * You are required to implement all methods recursively.
	 * You receive a zero if there is any occurrence of a loop (e.g., for, while).
	 */
	public int[] mergeSortedArrays(int[] left, int[] right) {
		/* Your Task. */
		int final = new int[left.length+right.length];
		if(left.length==0&&right.length==0) {
			return final;
		}
		else if(left.length==0) {
			final = right;
			return final;
		}
		else if(right.length==0) {
			final = left;
			return final;
		}
		
		mergeAH(left,right,final,0,0,0);
		return final;
		
		
	}
	public void mergeAH(int[] l, int[] r, int[] final,int i,int j, int k) {
		
		if(i<l.length&&j<r.length&&k<final.length) {
			if(l[i]<=right[j]) {
				final[k]=l[i];
				mergeAH(l,r,final,i+1,j,k+1);
			}
			else if (l[i]>r[i]) {
				final[k] = right[j];
				mergeAH(l,r,final,i,j+1,k+1);

				
			}}
			else if(i<left.length&&k<final.length) {
				final[k] left[i];
				mergeAH(l,r,final,i+1,j,k+1);

				
			}
			else if (j<r.length&& k<final.length) {
				final[k] = right[j];
				mergeAH(l,r,final,i,j+1,k+1);
		}
		
		
	}}
	
	
	
	
	
	
	
	/**
	 * Given two sorted lists left and right, 
	 * return a sorted list of size left.size() + right.size(), 
	 * consisting of all elements of lists left and right.
	 * @param left a sorted list
	 * @param right a sorted list 
	 * @return a sorted list of size left.size() + right.size(), consisting of all elements of lists left and right.
	 * e.g., mergeSortedLists({1, 3, 5, 7}, {2, 4, 6, 8}) returns a sorted list {1, 2, 3, 4, 5, 6, 7, 8}.
	 * 
	 * You are forbidden to use the mergeSortedArrays method above to solve this problem.
	 * 
	 * Requirement:
	 * You are required to implement all methods recursively.
	 * You receive a zero if there is any occurrence of a loop (e.g., for, while).
	 */
	public List<Integer> mergeSortedLists(List<Integer> left, List<Integer> right) {
		return null;
	}
}
