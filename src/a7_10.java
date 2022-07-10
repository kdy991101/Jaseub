import java.util.Scanner;

public class a7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			배열
//		같은 데이터 타입의 여러 변수를 필요로 할 떄 사용
	
//		5개의 정수를 압력받은 후 차례로 출력
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [5];
		
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i] + "");
		}
		
	}

}
