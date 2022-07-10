import java.util.Scanner;

public class a7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	while문으로 구구단 만들기
//		int a = 1;
//		int b = 1;
//		int c = 1;
//		
//		while (a < 10) {
//			while (c < 10) {
//				System.out.println("현재 단수 : " + c + "단 입니다.");
//				c++;
//			while (b < 10) {
//				System.out.println(a * b);
//				b++;
//			}
//			b = 1;
//			a++;
//		}
//	}
//		
//============================================================
//		scanner와 while문을 이용하여 구구단 출력
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int q = 1;
		int w = 1;
		
		while (check) {
			System.out.println("구구단을 시작합니다 \n 숫자를 입력하세요.");
			 	int gugu = sc.nextInt();
			 		if (gugu >= 1 && gugu < 10) {
			 			 while (gugu < 10) {
			 				 System.out.println("현재 단수 : " + gugu + "단 입니다.");
			 				 while (q < 10) {
			 					 System.out.println(gugu*q);
			 					 q++;
			 				 }
			 				 q = 1;
			 				 break;
			 			 }
			 			System.out.println("이상입니다.");	
			 		}else {
			 			System.out.println("다시 입력하세요.");
			 		}
		}
	}//main

}//class
