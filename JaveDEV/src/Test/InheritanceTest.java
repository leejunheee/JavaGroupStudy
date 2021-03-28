package Test;

class ParentClass {
	public void parentMethod() {
		System.out.println("부모클래스의 parentMethod()가 호출.");
	}
}
class ChildClass extends ParentClass {
	public void childMethod() {
		System.out.println("자식클래스의 childMethod()가 호출");
		System.out.println("부모클래스의 parentMethod()가 호출");
		parentMethod();//부모클래스를 상속받았기때문에 부모의 메서드사용가능
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.childMethod();//자식클래스의 childmethod 호출
	}

}
