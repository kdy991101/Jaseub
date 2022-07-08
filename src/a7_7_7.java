import java.util.Scanner;

public class a7_7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// while문으로 로그인 프로그램 만들기
		class Member{
		Member(){
		Scanner sc = new Scanner(System.in);
		String ID = "r8895r";
		String PW = "90090";
		
		while(true) 
		{
			System.out.println("1.로그인");
			System.out.println("2.종료");
			System.out.print("선택 : ");
			int sel = sc.nextInt();
		if(sel==1)
		{
					System.out.println("아이디를 입력하세요:  ");
					ID = sc.next();
					System.out.println("패스워드를 입력하세요: ");
					PW = sc.next();
						if(ID.equals("r8895r"))
						{
							if(PW.equals("90090")) 
								{System.out.println("로그인합니다.");
								break;}
								else  {
									System.out.println("패스워드가 틀렸습니다."); }
								}
								else 
									{System.out.println("아이디가 틀렸습니다.");}
							}
						if(sel ==2)
						{System.out.println("시스템 종료");
						break;}
								
						}
					}
				}
		}
	}


