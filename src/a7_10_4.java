import java.util.Scanner;

public class a7_10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			최대 100까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수번째에 입력된 정수를 모두 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [100];
		int cnt = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == 0) {
				break;
			}
			cnt++;
		}
		for(int i = 1; i<cnt; i+=2) {
			System.out.println(arr[i] + "");
		}
	}

}
