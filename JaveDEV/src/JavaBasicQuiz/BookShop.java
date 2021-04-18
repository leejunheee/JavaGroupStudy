package JavaBasicQuiz;

public class BookShop {
	private String bname;
	private String author;
	private int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public void viewBook() {
		System.out.println("책이름 : " + bname);
		System.out.println("저  자 : " + author);
		System.out.println("가  격 : " + price + "원");
	}
	
	//책이름 
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBname() {
		return this.bname;
	}
	
	// 저자 
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
	
	//가격 
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
}
