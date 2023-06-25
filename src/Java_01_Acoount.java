class BankAccount {
    int balance = 0;     // 예금 잔액
 
    BankAccount(){
    	this(1000); // =BankAccount()
       System.out.println("생성자 시작");
    } //디폴트 생성자 =  컴파일러가 개발자가 안넣게 되면 기본적으로 넣음
    
    /* 생성자를 한개라도 개발자가 만들면 디폴트생성자를 컴파일러가 만들어 주지 않는다.*/
    BankAccount(int balance){
       this.balance = balance;
       System.out.println("생성자 시작2");
    }
    
    public int deposit(int amount) { //예금
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) { //출금
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() { //잔액조회
        System.out.println("잔액 : " + balance);
        return balance;
    }
}

public class Java_01_Acoount {
    
   public static void check(BankAccount acc) {
        acc.checkMyBalance();
    }
    
   public static void main(String[] args) {
        
      BankAccount ref = new BankAccount();
//      BankAccount ref2 = new BankAccount(2000);
   
    //1.null->참조형에만 넣을 수 있다. int num=null;안됨 / 의미: 아무것도 가리키지 않는 상태 / 
    		// 활용: 참조형에 null로 지정하게 되면 JVM으로 하여금 할당되었던 메모리를 회수 하라는 의미임.
//    		BankAccount ref;
//    		ref = new BankAccount();  //위와 똑같은 내용.
//    		ref = null; //null을 넣으면 저장되었던 메모리가 사라짐
    		
    		
    		ref.deposit(3000);
    		ref.withdraw(300);
    		check(ref); //참조값 전달
    	}
    	
    	public static void check1(BankAccount acc) { //매개변수 //check(ref)에 BankAccount(acc)를 불러옴. 즉 BankAccount = ref
    		acc.checkMyBalance();
    	} //대한 함수 //뿌리면 사라짐.
    	



    //public class Java_01_Account {
//    	public static void main(String[] args) {
//    		BankAccount ref1 = new BankAccount();
//    		BankAccount	ref2 = ref1;
//    		
//    		//각 인스턴스를 대상으 예금을 진행
//    		ref1.deposit(3000); 
//    		ref2.deposit(2000);
//    		
//    		// 각 인스턴스를 대상으로 출금을 진행
//    		ref1.withdraw(400); // 5000-400
//    		ref2.withdraw(300); // 4600-300
//    		
//    		// 각 인스턴스를 대상으로 잔액 조회
//    		ref1.checkMyBalance();
//    		ref2.checkMyBalance();
    //

   }
