//오버라이딩 
package Test;
class Woman {//부모클래스
	public String name;
	public int age;
	
	//info 메서드
	public void info() {
		System.out.println("여자의 이름은 "+name +", 나이는 "+age+"살입니다.");
	}
}

class Job extends Woman { //Woman클래스를 상속받음 
	String job;
	
	public void info() {//부모클래스에 있는 info()메서드를 재정의.
		super.info();
		System.out.println("여자의 직업은 "+job +"입니다.");
	}
}

public class OverTest1 {

	public static void main(String[] args) {
		//Job 객체 생성.
		Job j = new Job();
		 // 변수 설정
		j.name = "유리";
		j.age = 30;
		j.job = "프러그래머";
		
		//호출
		j.info();
		
	}

}
