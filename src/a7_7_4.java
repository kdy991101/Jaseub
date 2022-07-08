import java.util.Scanner;

public class a7_7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 20대 인지 검사
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 확인하겠습니다.");
		int age = sc.nextInt();
		
		if(age >=20 && age <= 29) {
			System.out.println("당신은 20대 입니다.");
		}else {
			System.out.println("당신은 20대가 아닙니다.");
		}
	}

}
