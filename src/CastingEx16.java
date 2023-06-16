
// 업 캐스팅 이후 메서드가 오버라이딩을 한 경우에는 업캐스팅 된 참조변수가 실제 가리키는 객체 타입에 의해서 호출되는 메서득 결정된다.
// 결국 업 캐스팅 이후 자손에서 오버라이딩 한 메서드를 호출 한다.

// 업캐스팅 또는 메소드를 오버라이딩 할려면 사전에 상속관계 먼저 만들어야 한다.

class Mother16{
	void m16() {
		System.out.println("부모클래스 Mother16 m16() 메소드");
	}
}

class Child17 extends Mother16{

	@Override
	void m16() {
		System.out.println("오버라이딩 한 메소드 m16()");
	}
	
	void ch16() {
		System.out.println("자손에서 정의된 메소드()");
	}
}

public class CastingEx16 {
	public static void main(String[] args) {
		Mother16 m = new Mother16();
		m.m16();
		
		Mother16 m2 = new Child17();
		m2.m16(); // 업캐스팅 이후 오버라이딩 한 메서드를 호출 => m2가 실제 가리키는 객체 타입에 의해서 호출되는 메서드가 결정 된다.
		Child17 ch2 = (Child17) m2;
		
		ch2.ch16();
		ch2.m16();
		
	}
}
