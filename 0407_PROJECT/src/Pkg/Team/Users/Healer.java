package Pkg.Team.Users;

public class Healer extends User{

	//2.생성자
		public Healer() {
			super();
		}
			
		public Healer(String userName, int userAge) {
			super(userName, userAge);
		}
	//3.메서드(행위)
		@Override
		public void greeting() {
			System.out.println("힐러가 인사를한다.");
		}
		
		public void heal() {
			System.out.println("힐러가 힐을 한다.");
		}
}
