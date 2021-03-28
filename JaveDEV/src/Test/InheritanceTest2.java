package Test;

class ParentClass2{//부모클래스
	private int age;
	
	public ParentClass2(int age) { // 생성자
		this.age = age;
	}
	
	public void family() {
		System.out.println("부모입니다. 나이는 "+this.age+"살입니다.");
	}
}

class ChildClass2 extends ParentClass2{
	private int age;
	
	public ChildClass2(int age) { // 생성자
		super(age+30);
		this.age=age;
	}
	public void family() {
		System.out.println("자식입니다. 나이는"+this.age+"살입니다.");
	}
	
	public void childMethod() {
		family(); // 자식클래스에 있는 family()
		super.family(); //부모클래스에 있는 family 
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		ChildClass2 child = new ChildClass2(20);
		
		child.childMethod();
	}

}
