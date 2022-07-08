import java.util.Scanner;

public class a7_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 할인 대상 찾기
//		나이가 19이하 또는 60이상 할인 대상
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
//		|| = 또는
		if(age <= 19 || age>=60) {
			System.out.println("할인 대상입니다.");
		}else
			System.out.println("할인 대상이 아닙니다.");
	}

}
