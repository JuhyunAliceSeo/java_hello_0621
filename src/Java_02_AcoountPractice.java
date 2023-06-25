class BankAccounta{
	String accNumber; //계좌번호
	String ssNumber; //주민번호
	int balance = 0;
	
	public void initAccount(String acc, String ss, int bal) { //생성자
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	} //초기화를 위한 생성자
}

public class Java_02_AcoountPractice {
	public static void main(String[] args) {
		String str1= "Happy";
		String str2= "Birthday";
		System.out.println(str1 + " " + str2); 
		
		BankAccounta yoon = new BankAccounta(); //계좌생성
		yoon.initAccount("12-34-56", "990000-0111010", 10000); //초기화
		

	}
}
