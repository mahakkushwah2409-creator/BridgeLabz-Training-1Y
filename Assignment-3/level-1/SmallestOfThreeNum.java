import java.util.*;
class SmallestOfThreeNum {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
	/*	if(num1<num2){
			if(num1<num3) {
			System.out.println("First num " + num1 + "is smallest num");
			}
		}
		
		else 
		System.out.println("First num" + num1 + "is not smallest num");
	*/
	
	boolean isSmallest = (num1 <= num2 && num1 <= num3);
	
	System.out.println("is num1 is Smallest " + isSmallest );
		
	sc.close();
		
		}
	}
			
		