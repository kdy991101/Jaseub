import java.util.Scanner;

public class a7_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if문 실습
//	int형 변수,value가 3배의 수인지 2의 배수인지 확인
//		value를 3으로 나눈 나머지가 0인지를 검사하기
//		?value의 값을 변경해가면서 출력이 어떨게 바뀌는지 확인
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int value = sc.nextInt();
		
		if(value%3 == 0 ) {
			System.out.println("vlaue는 3의 배수입니다." );
		}else 
			System.out.println("value는 2의 배수입니다.");
		
		
		}

}
