import java.util.*;

public class Exec {

	public static void main(String[] args) {
		
		/*
		//중복으로 멤버가 등록이 되느냐
		//1.vector
		Vector<String> vector= new Vector<String>();
		
		vector.add("홍길동1");
		vector.add("전우치2");
		vector.add("홍길동3");
		
		boolean isResult=vector.contains("홍길동1");
		System.out.println(isResult);
		
		//for each
		for(String strName:vector) {
			System.out.println(strName);
		}
		
		System.out.println(vector.size());
		
		//Vector<Integer> vector2=new Vector<Integer>();
		
		//2.LinkedList
		LinkedList<String> lk=new LinkedList<String>();
		lk.add("홍길동1");
		lk.add("홍길동2");
		lk.add("전우치3");
		System.out.println(lk.size());
		
		for(String strName:lk) {
			System.out.println(strName);
		}
		
		//3. stack
		Stack<String> st=new Stack<String>();
		st.add("전우치1");
		st.add("홍길동2");
		st.add("홍길동3");
		System.out.println(st.size());
		
		for(String strName:st) {
			System.out.println(strName);
		}
		
		//4.ArrayList
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("전우치1");
		arr.add("전우치2");
		arr.add("홍길동3");
		System.out.println(arr.size());
		
		for(String strName:arr) {
			System.out.println(strName);
		}*/
		
		
		Car car1=new Car("소나타","현대");
		Car car2=new Car("k5","기아");
		Car car3=new Car("sm5","삼성");
		Car car4=new Car("소나타","현대");
		
		//LinkedList<Car> lk=new LinkedList<Car>();
		//Vector<Car> lk=new Vector<Car>();
		//Stack<Car>lk=new Stack<Car>();
		ArrayList<Car>lk=new ArrayList<Car>();
		lk.add(car1);
		lk.add(car2);
		lk.add(car3);
		
		
		System.out.println(lk.size());
		boolean isResult=lk.contains(car4);
		System.out.println(isResult);
		
		//List --> arrayList 자바쓰레드에서 동기화하지않는다.
		
		
	}


}
