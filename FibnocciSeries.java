package assignmet.week1.day1;

public class FibnocciSeries {
	public static void main(String[] args) {
		int range=8 , firstNum=0 , secNum=1 , sum ;
		System.out.println(firstNum  );
		System.out.println(secNum);
		for (int i = 0; i < range; i++) {
			sum=firstNum + secNum;
		    firstNum = secNum;
		    secNum = sum;
			System.out.println(sum);
			
		}
		
	}

}
