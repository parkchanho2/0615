
class Base{
	Base(){
		super(); //최고 조상 Object클래스의 기본생성자를 호출하면서 끝이남.
		System.out.print("Base ");
	}
}

class Alpha extends Base{
	// Alpha클래스 멤버변수와 메서드는 없고, 기본생성자만 생략
	
	
}
public class Ex16_7 {
	public static void main(String[] args) {
		new Alpha();
		new Base();
	}
}

















