import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************************************************************************************");
		System.out.println("*************************Find the Largest number*****************************************");
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the Second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		System.out.println("The entered numbers are "+a+" "+b+" and"+c+".");
		int result= 0;
		if (a<b) {
			if(c<b) {
				result = b;
			}else result = c;
		}else {
			if(a<c) {
				result=c;
			}else { result = a;} 
		}
		
		System.out.println("The largest number from the given numbers is "+result+" .");
		
	}

}
