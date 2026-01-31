import java.util.*;
 class ForContinuous {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your :");
	int n = sc.nextInt();
	for(int i=0 ; i<=9 ; i++) {
	if (i%2==0) {
		continue ;
	}
	else {
		System.out.println(i);
	}
	}
	}
 }
		