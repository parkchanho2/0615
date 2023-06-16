class Mother13{
	void m13() {
		System.out.println("부모클래스 메서드 m13()");
	}
}

class Child13 extends Mother13{
	void ch13() {
		System.out.println("자손클래스 메서드 ch13()");
	}
	public void print() {
		System.out.println("aa");
	}
}

public class CastingEx13 {
	public static void main(String[] args) {
		// 한줄로 업캐스팅을 해서 메서드를 호출해 보고, 명시적인 형변환을 해서 다운캐스팅을 한 다음 메서드를 호출해보자.
//		Mother13 m = new Mother13();
//		
//		Child13 ch = new Child13();
//		
//		Mother13 m2 = (Mother13) ch; //업캐스팅
//		
//		Child13 ch2 = (Child13) m2; //다운캐스팅
//		
//		m.m13();
		
		/////////////////
		Mother13 mother = new Child13(); // 자동형변환 (업캐스팅)
		mother.m13();
		
		Child13 ch = (Child13) mother;// 캐스팅연산자 (Child13 => 형변환 연산자) 를 사용해서 명시적인 형변환하는 강제 다운캐스팅
		// 강제 다운캐스팅
		mother.m13(); // 부모로 부터 상속받아서 호출
		ch.ch13(); // 자손에서 정의된 메서드를 호출
	}
}
