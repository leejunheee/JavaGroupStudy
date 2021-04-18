package JavaBasicQuiz;

public class Quiz30 {
	public static void main(String[] args) {
		BookShop bs = new BookShop();
		
		bs.setBook("자바완성", "황완성", 25000);
		bs.viewBook();
		System.out.println();
		
		bs.setBname("JSP잡기");
		bs.setAuthor("송JP");
		bs.setPrice(35000);
		
		System.out.println("책이름 : " + bs.getBname());
		System.out.println("저  자 : " + bs.getAuthor());
		System.out.println("가  격 : " + bs.getPrice() + "원");
	}
}
