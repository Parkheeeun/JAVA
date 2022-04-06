
public class CONDITION {

	public static void main(String[] args) {
		//조건문
		//if,switch case
		
		//for,while,do while,foreach --배열,객체
		String strResult="";
		int result=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				strResult+=Integer.toString(i)+"-";
				result+=i;
			}
			else {
				strResult+=Integer.toString(i)+"+";
				result-=i;
			}
		}
		System.out.println(strResult+"="+Integer.toString(result));
	}

}
