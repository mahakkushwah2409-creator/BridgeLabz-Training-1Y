import java.util.*;
class  CheckNumber{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	if(n>0) {
		System.out.println("positive Number");
		}
		
		else if (n<0) {
			System.out.println("Negative Number");
			}
			
			else {
			System.out.println("Zero");
			}
			
			sc.close();
			
		}
	}