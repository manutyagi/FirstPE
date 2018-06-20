import java.util.Scanner;

public class Program2 {
		public static void main(String args[]) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter any number");
			int no =sc.nextInt();
			if(!(no%2==0)&&(no>20&&no<30)){
				System.out.println("Tom");
			}else if((no%2==0)&&(no>20&&no<30)) {
				System.out.println("Jerry");
			}
}
}