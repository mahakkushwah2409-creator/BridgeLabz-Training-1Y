import java.util.*;
 class NaturalNumSum {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	if(n >= 1) {
		int sum =0;
		for(int i=0; i<=n ;i++) {
		sum+=i;
		}
	System.out.println("sum of natural num is " + sum);
	}
		else {
	System.out.println("the num" + n + "is not a natural num ");
		
		}
		
		sc.close();
	}
}