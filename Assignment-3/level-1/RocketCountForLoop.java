import java.util.*;
	class RocketCountForLoop {
		public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter Count number :");
		 int countNum = sc.nextInt();
		 
		 if (countNum<=0) {
			System.out.println("Please enter positive number ");
			sc.close();
			return;
			}
			
			for(int countNum ;countNum>=1; countNum--) {
				System.out.println(countNum);
				}
				
				sc.close();
			}
		}