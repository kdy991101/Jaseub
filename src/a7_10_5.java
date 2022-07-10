import java.util.Scanner;

public class a7_10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0이 입력되면 0을 제외하고
//			그때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례로 출력
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int cnt = 0;
			for(int i=0; i<arr.length; i++) 
			{
				arr[i] = sc.nextInt();
				if(arr[1] == 0) 
				{
					break;
				}
				cnt++;
			}
			for(int i = cnt-1; i>=0; i--) 
			{
				System.out.print( arr[i] + " ");
			}
	}

}
