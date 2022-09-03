package CodingTest.sep;

public class S1 {

	public static void main(String[] args) {
		//		**********
		//		**********
		//		**********
		//		**********
		//		**********
		//		출력하는 프로그램을 만드시요
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j <10 ; j++) {
				System.out.print("*");
			}
		}		
				
		
		System.out.println("--------------");
		
		//		**********
		//		*        *
		//		*        *
		//		*        *
		//		**********
		//		출력하는 프로그램을 만드시요
	
		String asteriskSingle = "*";
		String blank = " ";
	
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
			
			
		//		1
		//		12
		//		123
		//		1234
		//		12345
		//		123456
		//		1234567
		//		12345678
		//		123456789
		//		1 3 5 7 90
		//		출력하는 프로그램을 만드시요

		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1;j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			}else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
	
	}

}
