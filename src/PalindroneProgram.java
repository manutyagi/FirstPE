import java.util.Scanner;
public class PalindroneProgram {
	int r,dig=0,rInt=0;
	static int temp;
	String s,t;
	
	public static int scannerInput()  {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		return sc.nextInt();
	}
	
	public String whetherPalindrome(int temp) {
		 if(temp==rInt&&dig>25) {
			  s ="The number is a palindrome and sum of even digits is greater than 25 i.e.";
		  }else if(temp==rInt&&dig<25){
			  s ="The number is a palondrome and sum of even digits is less than 25 i.e. : ";
		  }else {
			  s="The number is not a palindrome";
		  }
		 return s;
	}
	
	public  int checkSumOfEven(int no) {	
		temp=no;
		while(no!=0){    
			   r=no%10;
			   if(r%2==0) {
				   dig+=r;
			   }
			   rInt=(rInt*10)+r;    
			   no=no/10;   
			  }
		return dig;
	}
	
	public static void main(String args[]) {
		int no=scannerInput();
		PalindroneProgram pp=new PalindroneProgram();
		String t = pp.whetherPalindrome(temp);
		int output=pp.checkSumOfEven(no);
		System.out.println(t);
		System.out.println(output);
	}
	
	
	
}
