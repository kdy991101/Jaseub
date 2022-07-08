import java.util.Scanner;

public class a7_6_2 {
// scanner이용한 실습
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	원화를 입력받아 달러로 바꾸어 다름 예시와 같이 출력하는 프로ㅡ램
		int won;
		double dollar;
		Scanner s = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>>");
		won = s.nextInt();
		dollar = won/1100;
		System.out.println(won + "원은 " + "$" + dollar + "입니다.");
		
		int num;
		int ten;
		int one;
		Scanner sc = new Scanner(System.in);
		System.out.println("두자리수 정수 입력(10~99)>>");
		num = sc.nextInt();
		ten = num/10;
		one = num%10;
		
		System.out.println("10자리 : " + ten);
		System.out.println("1자리 : " + one);
		if(ten == one) {
			System.out.println("yes! 10의 자리와 1의 자리가 같습니다!");
		} else
			System.out.println("NO! 10의 자라와 1의 자리가 다릅니다.");
		
	}

}
