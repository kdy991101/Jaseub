import java.util.Scanner;

public class a7_10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		연도와 월을 입력받아 해당 월의 날수를 출력하다가 월이 0이면 종료 ''while문 이용할 것
//		월이 잘못 입력되면 잘못되었다고 출력
		Scanner sc = new Scanner(System.in);
		int [] day = new int[13];
		int i, year;
		
		for( i=0; i<day.length; i++) 
			{
			if(i == 2)
			{
				day[i] = 28;
			}else if (i==4 || i==6 || i==9 || i==11)
			{
				day[i] = 30;
			}else
			{
				day[i] = 31;
			}
		}
		while(true) {
			System.out.println("년도 : ");
			year = sc.nextInt();
			System.out.println("월 : ");
			i = sc.nextInt();
			
			if(i == 0)
			{
				break;
			}
			if(i<1 || i>12)
			{
				System.out.println("잘못 입력하였습니다.");
				continue;
			}
			else if (i == 2)
			{
				if(year%400 == 0 || ((year%4 == 0)&&(year%100==0)))
				{
					day[2] = 29;
				}
				else
				{
					day[2] = 28;
				}
				}
			System.out.printf("입력하신 달의 날수는 %d일 입니다 \n", day[1]);
		}//while

	}//main

}//class
