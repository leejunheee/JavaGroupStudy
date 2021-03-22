package CH6;

 class Exercise6_2 {

	public static void main(String[] args) {
		SutdaCard card1 =  new SutdaCard(3,false);
		SutdaCard card2 =  new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());

	}

}
 class SutdaCard {
	 int num ;
	 boolean isKwang;
	 
	 SutdaCard(){
		 this(1,true); // SutdaCard(1,True)를 호출.
	 }
	 SutdaCard(int num, boolean isKwang){
		 this.num= num;
		 this.isKwang = isKwang;
	 }
	 String info() { // 숫자를 문자열로 반환. 광인 경우 k를 덧붙임.
		 return num + (isKwang? "K":"");
	 }
 }
