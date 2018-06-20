import java.util.Scanner;

public class Program6 {//sorting non-increasing order
//	 public static void main(String[] args)
//	    {	int num,temp,sum=0;
//	        Scanner sc = new Scanner(System.in);
//	        
//	        System.out.println("Enter the no of digits in the number");
//	        num = sc.nextInt();
//	        int number[]=new int[num];
//	        
//	               	
//	       for(int i=0;i<num;i++) {
//	    	   number[i]=sc.nextInt();
//	    	   if(number[i]%2==0) {
//	    		   sum+=number[i];
//	    	   }
//	       }
//	       for(int i=0;i<num;i++) {
//	    	   for(int j=i+1;j<num;j++) {
//	    		   if(number[j]>number[i]) {
//	    			   temp=number[j];
//	    			   number[j]=number[i];
//	    			   number[i]=temp;
//	    			   
//	    		   }
//	    	   }
//	       }
//	       for(int i=0;i<num;i++) {	    	   
//	    	   System.out.println(number[i]);
//	       }if(sum>15) {
//	    	   System.out.println("Sum is"+sum+"which is greater than 15");
//	       }else {
//	    	   System.out.println("Sum is less than 15");
//	       }
//	     
//}
//}

public int sumCalculator(String num) {
	int n=Integer.parseInt(num);
	int temp,sum=0;
	while(n!=0) {
		temp=n%10;
		n/=10;
		if(temp%2==0) {
			sum+=temp;
		}
	}
	return sum;
}
public String nonDecreasingOrder(String num) {
	//int n=Integer.parseInt(num);
	String temp;
	String[] number=num.split("");
		for(int i=0;i<number.length;i++) {
	    	   for(int j=i+1;j<number.length;j++) {
	    		   if(Integer.parseInt(String.valueOf(number[j]))>Integer.parseInt(String.valueOf(number[i]))) {
	    			   temp=number[j];
	    			   number[j]=number[i];
	    			   number[i]=temp;
	    			   
	    		   }
	    	   }
	       }
		String s="";
		for(int i=0;i<number.length;i++) {
			s=s+number[i];
		}
	
		return s;
	}
public boolean greaterThan15(String num) {
	int n=Integer.parseInt(num);
	int temp,sum=0;
	boolean flag=false;
	while(n!=0) {
		temp=n%10;
		n/=10;
		if(temp%2==0) {
			sum+=temp;
		}if(sum>15) {
			flag=true;
		}else {
			flag=false;
		}
	}
	return flag;
}
public static void main(String[] args) {
	Program6 pp=new Program6();
	System.out.println(pp.nonDecreasingOrder("12345"));
	System.out.println(pp.sumCalculator("12345"));
	System.out.println(pp.greaterThan15("98642"));
}
}


