package CH6;
//컴터 게임 병사(marine)을 클래스로 정의, 이 클래스의 멤버변수 중 
//static을 붙여야 하는것은 어떤거고 이유는?

 class Marine {
	 int x = 0, y=0; // 위치좌표 
	 int hp = 60; // 현재체력
	 static int weapon = 6; // 공격력
	 static int armor = 0; // 방어력
	 //모든 marine 한테 동일한 값이어야 하므로 static 사용
	 static void weaponUp (){ // static 변수에 대한 작업을 하는 메서드이므로
		 weapon++;
	 }
	 static void armorUp() {// static 변수에 대한 작업을 하는 메서드이므로
		 armor++;
	 }
	 void move(int x, int y) {
		 this.x=x;
		 this.y=y;
	 }

}
