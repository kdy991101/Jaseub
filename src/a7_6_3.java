import java.util.Scanner;

public class a7_6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int mon;
			int C50000;
			int C500;
			int C50;
			int C10000;
			int C1000;
			int C100;
			int C10;
			int C1;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("금액을 입력하시오");
			mon = sc.nextInt();
			
//			C50000 =  mon/50000; mon %= 50000;
			C50000 =  mon/50000; mon = mon%50000;
			if(C50000 != 0)
				System.out.println("오만원권 " + C50000 + "매");
			
			C10000 =  mon/10000; mon = mon%10000;
			if(C10000 != 0)
				System.out.println("만원권 " + C10000 + "매");
			
			C1000 =  mon/1000; mon = mon%1000;
			if(C1000 != 0)
				System.out.println("천원권 " + C1000 + "매");
			
			C500 =  mon/500; mon = mon%500;
			if(C500 != 0)
				System.out.println("오백원 " + C500 + "개");
			
			C100 =  mon/100; mon = mon%100;
			if(C100 != 0)
				System.out.println("백원 " + C100 + "개");
			
			C50 =  mon/50; mon = mon%50;
			if(C50 != 0)
				System.out.println("오십원 " + C50 + "개");
			
			C10 =  mon/10; mon = mon%10;
			if(C10 != 0)
				System.out.println("십원 " + C10 + "개");
			
			C1 =  mon/1; mon = mon%1;
			if(C1 != 0)
				System.out.println("일원 " + C1 + "개");

			
			
	}

}
