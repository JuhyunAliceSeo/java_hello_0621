

class Gugudan{
	int n;
	void printGugu(int n){
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}
}

class GetSum{
	   int num;
	   
	   void setNum(int num1) {
	      num = num1;
	   }
	   
		int sum() {
			int sum = 0;
			for(int i=1;i<=num;i++) {
				sum = sum + i;
			}
			return sum;
		}
		
		}
class Grade{
	int kor, eng, math, total;
	double avg;
	
	void setGrade(int kor, int eng, int math){
		this.kor=kor;
		this.eng=eng;
		this.math=math;		
	}
	
}

public class Java_05_practice {

	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1단부터 10단까지 출력
		gugudan.printGugu(20); //1단부터 20단까지 출력
		///////////////////////////////////
		GetSum getsum = new GetSum(); // 1)객체 생성
        int num; // 2)num 변수 선언

        num = 100;

        getsum.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 50 저장

        num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
        System.out.println(num);

        getsum.setNum(1000);
        num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
        System.out.println(num);

	}
	


}
