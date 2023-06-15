
class A{
	public A() {
		System.out.println("A() 생성자 ");
	}
}

class B extends A{
	public B() {
		super(); // 항상 첫줄에 와야 에러 안남. 묵시적 생략 가능 (부모의 기본생성자 호출은 생략해도 자바컴파일러가 묵시적 제공함.)
		System.out.println("B() 생성자");
		
	}
}
public class Ex16_8 {
	public static void main(String[] args) {
		A a = new B(); //업캐스팅 문법
	}
}
