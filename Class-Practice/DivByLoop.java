import java.util.*

class DivByLoop{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	int n = sc.nextInt();
	
	for(i=0;i<n;i++){
		if(i%5==0) {
		System.out.println("no is divisible by 5 ");
		}
	}
	
	System.out.println("no is not divisible by 5");
	
	sc.close();
	}
}
		
	
	
	
