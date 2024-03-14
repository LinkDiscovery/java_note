package trainingTest;

public class leapyear {

	public void leapYeartest(int num) {
		boolean a = false;
		if(num%4 == 0) {
			System.out.println("윤년");
		}else if (num%4 ==0 && num%100==0) {
			System.out.println("평년");
		}else if (num%4 ==0 && num%100==0 && num%400==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
	}

}
