import java.util.Scanner;
class SumofArray{
public static void main(String[] args){
    Scanner sa = new Scanner(System.in);
System.out.print("Enter the number of elemnet :");
int num = sa.nextInt();

    int[] arr = new int[num];
    for(int i = 0 ; i < num  ; i++){
        arr[i] = sa.nextInt();
    }
    int sum = 0 ;
    for (int i = 0 ; i<num ; i++){
        sum = sum+arr[i];
       
    }
    System.out.print(sum);


    }
}