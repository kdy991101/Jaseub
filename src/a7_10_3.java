import java.util.Scanner;

public class a7_10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			정수 10개를 입력받은 후 세번째, 다섯번째와 마지막으로 입력받은 정수를 차례로 출력
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr[2] + "" + arr[4] + "" + arr[arr.length-1] );
	}

}
