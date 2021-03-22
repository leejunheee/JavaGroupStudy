package CH6;

class BlockTest {
	
	static { // 클래스 초기화 블럭
		System.out.println("static { }");
	}
	{ // 인스턴스 초기화 블럭
		System.out.println("{ }");
	}
	public BlockTest () {
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		
	}

}
/* BlockTest가 메모리에 로딩될때, 클래스초기화 불럭이 가장 먼저 수행되어
static { }이 화면에 출력, 다음 main메소드 수행되어 BlockTest인스턴스가
생성되면서 인스턴스 초기화 블럭이 먼저 수행되고, 생성자 수행 
클래스 초기화 블럭은 메모리 로딩시 한번만 수행되었지만 인스턴스 초기화 블럭은 
인스턴스가 생성될때마다 수행. */
