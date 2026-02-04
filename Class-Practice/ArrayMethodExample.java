import java.util.Arrays;
class ArrayMethodExample {
	public static void main (String[] args) {
	int num[] ={10,20,30,40};
	System.out.println("original array:");
	System.out.println(num);
	System.out.println(Arrays.toString(num)) ;
//Arrays.sort(num);
//System.out.println("sorted array:");
	int index = Arrays.binarySearch(num,30);
	System.out.println("index of 30: " + index);
	
	int[] arr={10,20,3,40};
	boolean isEqual = Arrays.equals(num ,arr );
		System.out.println("boh array are equal : " + isEqual );
		
		int[] arr2 = new int[5];
		
		Arrays.fill(arr2 , 7;
		System.out.println("filled Array);
		System.out.println(Arrays.toString(arr2));
		
	
}
}