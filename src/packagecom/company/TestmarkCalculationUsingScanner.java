package packagecom.company;
import java.util.Scanner;

public class TestmarkCalculationUsingScanner {
	
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your  subject1 marks:");
		int subject1 = scan.nextInt();
		System.out.println("enter your  subject2 marks:");
		int subject2 = scan.nextInt();
		System.out.println("enter your subject3 marks:");
		int subject3 = scan.nextInt();
		float percentage = ((subject1+subject2+subject3)/3f);
		System.out.println("percentage:");
		System.out.println(percentage);
	}

}
