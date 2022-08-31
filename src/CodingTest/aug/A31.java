package CodingTest.aug;

public class A31 {

	public static void main(String[] args) {
//		1. array
//		scoreChemisty 의 평균을 구해서 출력하시오.
//2. array
//		국어,영어,수학
//		1. 개인의 평균
//		2. 과목별 평균
		
		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
//		
//		int sum = 0;
//		
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < scores.length; j++) {
//				sum +=scores[i][j];
//			}
//			System.out.println("학생1의 평균 : " + ((double)sum/5));
//		}   => 오류 이유 모르겠음
		
		String [] name = {"갑","을","병","정","무"};
		String [] subject = {"국","영","수"};
		
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<3; j++) {
				sum +=scores[i][j];
			}
			System.out.println("학생" + name[i]+"의 평균 점수는: "+((double)sum/3));
		}
		
		System.out.println("-----------");		
		
		for(int j=0; j<3; j++) {
			int sum=0;
			for(int i=0; i<5; i++) {
				sum +=scores[i][j];
			}
			System.out.println(subject[j]+" 과목의 평균 점수는: "+((double)sum/5));
		}

		
	}

}
