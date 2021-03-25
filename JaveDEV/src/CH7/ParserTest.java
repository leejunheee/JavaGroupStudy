package CH7;
interface Parseable {
	//구문 분석작업을 수행.
	public abstract void parse (String fileName); // 추상메서드
}

class ParserManager {
	//리턴타입이 Parseable인터페이스이다.
	public static Parseable getParser(String type) {
		//getParse메서드는 매개변수로 넘겨받는 type의 값에 따라 XMLParser인스턴스 
		// 또는 HTMLParse인스턴스를 반환,
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다 */
		System.out.println(fileName + "- XML parsing completed");
	}
}

class HTMLParser implements Parseable {
	/* 구문 분석작업을 수행하는 코드를 적는다 */
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed");
		
	}
}

class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
		
	}

}
