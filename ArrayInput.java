import java.util.Scanner;
public class ArrayInput {
	public static void main(String[] args) {
		int n, sum =0;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter no. of element you want in array:");
		 n = scanner.nextInt(); 
		 int array[] = new int[10];  
		 System.out.println("Enter all the elements:"); 
		 for (int i=0; i<n; i++) 
		 { 
			 array[i] = scanner.nextInt();
	          sum = sum + array[i];
		 }
	          System.out.println("sum:" +sum);
		  
		   }

	}


