import java.util.ArrayList;

public class Exec {

	public static void main(String[] args) {
		//1.collection 사용이유
		//2.collection 어떤종류가있고 어떻게사용
		//3.동기화에 대한 이해
		
		//1.USERS테이블- ID,NAME,PASS
		User[] users=new User[2];
		users[0]=new User();
		users[1]=new User();
		
		users[0].id="UID001";
		users[0].name="박희은";
		users[0].pass="1111";
		
		users[1].id="UID002";
		users[1].name="박효진";
		users[1].pass="2222";
		
		for(int i=0; i<users.length; i++) {
			System.out.println("--------------------------");
			System.out.println("사용자이름:"+users[i].name);
			System.out.println("사용자아이디:"+users[i].id);
			System.out.println("사용자pass:"+users[i].pass);
			System.out.println("--------------------------");
		}
		
		
		User user1=new User();
		user1.id="UID001";
		user1.name="박희은";
		user1.pass="1111";
		
		User user2=new User();
		user2.id="UID002";
		user2.name="박효진";
		user2.pass="2222";
		/*
		//Collection
		ArrayList<User> arrs=new ArrayList<User>();
		arrs.add(user1);
		arrs.add(user2);
		*/
		
		House house1=new House();
		House house2=new House();
		
		house1.setHouse(user1);
		house1.setHouse(user2);
		
		//house1에 살고있는사람의 리스트
		ArrayList<User> house1List =house1.getUserList();
		System.out.println(house1List);
		
		
	}

}
