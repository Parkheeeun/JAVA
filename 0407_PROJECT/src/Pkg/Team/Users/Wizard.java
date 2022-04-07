package Pkg.Team.Users;

import Pkg.Commons.*;
public class Wizard extends User implements IuseMagic{

	
	//2.생성자
	public Wizard() {
		super();
	}
	
	public Wizard(String userName, int userAge) {
		super(userName, userAge);
	}
	
	
	//3.메서드(행위)
	@Override
	public void greeting() {
		System.out.println("마법사가 인사를한다.");
	}
	
	@Override
	public void useMagic() {
		System.out.println("마법사가 마법을쓴다.");
	}
}
