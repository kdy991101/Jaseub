import java.util.Scanner;

public class a7_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력
		Scanner sc = new Scanner(System.in);
		
		char[] arr = new char[10];
		
		for (int i = 0; i <10; i++) {
			arr[i] = sc.next().charAt(0);
			System.out.println(arr[i]);
		}
	}

}
