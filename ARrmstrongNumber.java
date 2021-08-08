package assignmet.week1.day1;

public class ARrmstrongNumber {
	public static void main(String[] args) {
		int num =123 , add=0, n ;
		 
		while(num>0) {
			n =num%10;
		    System.out.println(n);
			add = add +n*n*n;
			System.out.println(add);
		    num=num/10;
		    System.out.println(num);
		}
		System.out.println(add);
	}

}
