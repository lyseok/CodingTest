import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		char c;
		
		if(a >= 90) c = 'A';
		else if(a >= 80) c = 'B';
		else if(a >= 70) c = 'C';
		else if(a >= 60) c = 'D';
		else c = 'F';
		
		System.out.println(c);
	}

}