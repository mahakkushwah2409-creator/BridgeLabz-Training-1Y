import java.util.*;
class ArrayExample{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = {26,14,24,5,28};
		System.out.println("Using for each loop");
		for(int i : marks) {
			System.out.println(""+i);
		}
		
		System.out.println(marks[1]);// Accessing element at specifc index
	System.out.println("Update Array Element :");
	marks[3]=100;// Update element by their index
	
	System.out.println("Array element:");
	for (int i=0 ; i<marks.length; i++) {
		System.out.println(+marks[i]); //printin Element
	}
		
		System.out.println("Enter your Element :");
		int m =sc.nextInt();
	for (int i=0 ; i<marks.length; i++) {
		if(marks[i]==m) {
			System.out.println("Number found at index : " +i);// index specific element
		}
	}
	
	}
}
		
		
		
	 