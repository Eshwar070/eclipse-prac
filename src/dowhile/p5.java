package dowhile;
import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		do {
			System.out.println("enter a num");
			num=sc.nextInt();
		if( num%2==0) {
			System.out.println("even");
		}else {
				System.out.println("odd");
			}}while(num!=0);
			sc.close();
		
		}
	}
		

	


