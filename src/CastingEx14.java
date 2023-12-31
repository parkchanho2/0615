// 다운캐스팅이 잘못되어서 캐스팅 연산 예외 오류가 나는 ex)
// - 사전에 미리 업캐스팅을 안해서 다운캐스팅을 명시적으로 하면 정상적으로 컴파일 된다. 컴파일된 바이트코드 클래스 파일을 실행시 캐스팅 연산 예외 오류를 발생 시킨다.

class Mother14{
	void m14() {
		System.out.println("부모 Mother14 class m14() 메서드 ");
	}
}

class Child14 extends Mother14{
	void ch14() {
		System.out.println("자손 Child14 class ch14() 메서드 ");
	}
}

public class CastingEx14 {
	public static void main(String[] args) {
		Mother14 m = new Mother14(); // 사전에 업캐스팅을 안함. Mother14 m = new Child14 -> 업캐스팅한것
		Child14 ch = (Child14) m; //사전에 업캐스팅을 안해서 실행시 캐스팅 연산 오류가 난다.
		ch.m14();
		ch.ch14();
	}
}
